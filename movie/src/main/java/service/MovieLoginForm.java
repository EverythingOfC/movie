package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MovieLoginForm implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/movie/login.jsp";
		
		HttpSession session = request.getSession();
		session.invalidate();	// 로그인 세션 삭제
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
