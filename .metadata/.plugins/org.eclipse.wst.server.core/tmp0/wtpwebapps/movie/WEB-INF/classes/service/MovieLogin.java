package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
=======
import javax.servlet.http.HttpSession;

import dto.MemberDto;

public class MovieLogin implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDto mDto = new MemberDto();
		
		session.setAttribute("member", mDto);	// 멤버 세션값을 저장 

		new MovieList().execute(request, response);
	}

}
