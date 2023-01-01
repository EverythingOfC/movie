package service;

import java.io.IOException;

<<<<<<< HEAD
=======
import javax.servlet.ServletContext;
>>>>>>> ad59b4fb864d14a03a36378cbd5fd8628791b9be
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
=======
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.MovieDao;
import dto.MovieDto;

public class MovieInsert implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		ServletContext context = request.getServletContext();
		String path = context.getRealPath("upload");	// 서버에 저장할 경로
		int maxSize = 5 * 1024 * 1024;	// 파일 크기
		String enctype="utf-8";		// 파일 인코딩

		MultipartRequest multi = new MultipartRequest(request,path,maxSize,enctype,new DefaultFileRenamePolicy());
		
		String title = multi.getParameter("title");
		String director = multi.getParameter("director");
		String actor = multi.getParameter("actor");
		int price = Integer.parseInt(multi.getParameter("price"));
		String poster = multi.getFilesystemName("poster");	// 서버에 실제 업로드 된 파일의 이름을 리턴한다. 
		String id = multi.getParameter("id");
		// 파일 업로드 처리를 위해서는 모든 요청에 대한 처리를 MultiPartRequest객체의 getParameter메소드를 통해서 한다.
		
		MovieDto mDto = new MovieDto();
		MovieDao mDao = MovieDao.getInstance();
		
		// mDao 함수 입력
		
		new MovieList().execute(request, response);
	}

}
