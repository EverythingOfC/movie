package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {	// 액션의 인터페이스
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
