package service;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.MovieDao;
import dto.MovieDto;

public class MovieUpdate implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ServletContext context = request.getServletContext();
		
		String path = context.getRealPath("upload");	// 서버에 저장할 경로
		int maxSize = 5 * 1024 * 1024;	// 파일 크기
		String enctype = "utf-8";		// 파일 인코딩

		MultipartRequest multi = new MultipartRequest(request,path,maxSize,enctype,new DefaultFileRenamePolicy());	// 파일 업로드 처리를 위한 객체
		
		int code = Integer.parseInt(multi.getParameter("code"));
		
		MovieDao mDao = MovieDao.getInstance();
		MovieDto preMdto = mDao.selectOne(code);
		String pre = preMdto.getPoster();	// 이전 파일 명 받아옴
		
		path = context.getRealPath("upload/");	// 업로드된 경로
		File file = new File(path+pre);	// 이전 경로의 파일 정보가 있는 객체 생성
		if(file.exists())
			file.delete();
		
		String title = multi.getParameter("title");
		String director = multi.getParameter("director");
		String actor = multi.getParameter("actor");
		int price = Integer.parseInt(multi.getParameter("price"));
		String poster = multi.getFilesystemName("poster");	// 서버에 실제 업로드 된 파일의 이름을 리턴한다. 
		String syno = multi.getParameter("synopsis");
		// 파일 업로드 처리를 위해서는 모든 요청에 대한 처리를 MultiPartRequest객체의 getParameter메소드를 통해서 한다.
		
		MovieDto mDto = new MovieDto();
		
		mDto.setCode(code);
		mDto.setTitle(title);
		mDto.setDirector(director);
		mDto.setActor(actor);
		mDto.setPrice(price);
		mDto.setPoster(poster);
		mDto.setSynopsis(syno);
		
		mDao.movieUpdate(mDto);	// 영화 수정

		response.sendRedirect("ms?command=list");
	}

}
