package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MovieDao;
import dto.MovieDto;

public class MovieView implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String url = "/movie/view.jsp";
		int code = Integer.parseInt(request.getParameter("code"));

		MovieDao mDao = MovieDao.getInstance();
		MovieDto mDto = mDao.selectOne(code);

		request.setAttribute("movie", mDto);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
