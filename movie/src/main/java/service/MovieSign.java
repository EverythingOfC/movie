package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MovieDao;
import dto.MemberDto;

public class MovieSign implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String auth = request.getParameter("auth");
		
		MemberDto mDto = new MemberDto();
		
		mDto.setId(id);
		mDto.setPw(pw);
		mDto.setName(name);
		mDto.setAuth(auth);
		
		MovieDao mDao = MovieDao.getInstance();
		
		mDao.memberSign(mDto); // 회원가입
		
		new MovieLoginForm().execute(request, response);	// 회원가입 후 로그인 화면으로 이동
	}

}
