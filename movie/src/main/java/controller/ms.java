package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Action;
import service.ActionFactory;
import service.MovieLoginForm;

@WebServlet("/ms")
public class ms extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ms() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String command = request.getParameter("command");
		ActionFactory af = ActionFactory.getInstance();
		
		if (command != null) {
			Action ac = af.getAction(command); // 해당 요청에 맞는 액션 객체 리턴
		System.out.println(command);
			ac.execute(request, response);
		} else {
			new MovieLoginForm().execute(request, response); // 기본 요청은 영화 리스트
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
