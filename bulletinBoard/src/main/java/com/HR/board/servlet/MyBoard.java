package com.HR.board.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.HR.board.dao.BoardDAO;
import com.HR.board.dto.BoardDTO;

@WebServlet("/board")
public class MyBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyBoard() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDAO dao = new BoardDAO();
		
		
		ArrayList<BoardDTO> resultList = dao.select();
		request.setAttribute("list", resultList); 
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/boardList.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int responseCount = 0;
		
		BoardDAO boardDAO = new BoardDAO();
		
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String nickName = request.getParameter("nickName");
		
		
		
		responseCount = boardDAO.insert(title, content, nickName);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("적용된 개수는 :" + responseCount);
		
	}

}
