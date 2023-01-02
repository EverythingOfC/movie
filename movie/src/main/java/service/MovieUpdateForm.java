package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MovieDao;
import dto.MovieDto;

public class MovieUpdateForm implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String url = "movie/update.jsp";
		int code = Integer.parseInt(request.getParameter("code"));

		MovieDao mDao = MovieDao.getInstance();
		MovieDto mDto = mDao.selectOne(code);	// 객체를 받아옴.
		request.setAttribute("movie", mDto);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
