package com.javahelps.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.javahelps.helloworld.GetCurentDayTime;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String param1 = request.getParameter("param1");
		GetCurentDayTime get = new GetCurentDayTime();
		String show = get.GetCurent(getServletName());
		response.setContentType("text/html");
        PrintWriter printWriter  = response.getWriter();
        if (param1 == null){
            printWriter.print("<p>Hello World, I'm Hai. Today is :" + show + "</p>");

        }
        else 
        {
        	printWriter.print("<p>Hello World, I'm "+ param1 +" . Today is :" + show + "</p>");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
