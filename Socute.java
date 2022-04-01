package com.socute.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Socute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Socute() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().append("<span style=\"color:blue\"><h1>2022/3/28 SoCute</h1></span>");
	}


	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("已成功連接");
		String name = request.getParameter("name");
		String feedback = request.getParameter("feedback");
		
		
		System.out.println("name:"+name);
		System.out.println("feedback:"+feedback);
		
	
		
		StringBuilder sb = new StringBuilder();
		sb.append("");
		sb.append("<div  style=\"background-color: #D4ABAD;"
				+ "    width: 800px;\r\n"
				+ "    padding: 10px;\">");
		sb.append("<span style=\"color:block;\">訪客:"+name+"</span>");
		sb.append("<span style=\"color:blue;\"><p style=\"color:blue;background-color:#EED2C7;height:150px\">留言內容:\r\n"+feedback+"</p></span>");
		sb.append("</div>");
		sb.append("");
		sb.append("<hr>");
		sb.append("");
		sb.append("<p style=\"color:DodgerBlue;\">請輸入您的姓名與要說的話</p>");
		sb.append("<form action=\"Socute\" method=\"post\">");
		sb.append("<label for=\"name\">遊客:</label><br>");
		sb.append("<input type=\"text\" id=\"name\" name=\"name\" value=\"\" placeholder=\"姓名\" size=\"30\">");
		sb.append("<br><br>");
		sb.append("<TEXTAREA NAME=\"feedback\" id=\"feedback\" ROWS=\"8\" COLS=\"80\" placeholder=\"想說甚麼都可以\" class=\"BG-Copy\"");
		sb.append(" style=\"border:2px #2f3944 solid;\"></TEXTAREA><br>");
		sb.append("<INPUT TYPE=\"submit\" VALUE=\"送出\" class=\"Base\" style='text-align:\"right\"' onclick='processFormData();addMsg()'>");
		sb.append("</form>");
		sb.append("");
		sb.append("");
		
		
		
		response.getWriter().append(sb.toString());
	
		response.setContentType("text/html");
		
	}

}
