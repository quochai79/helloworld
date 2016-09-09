package com.javahelps.helloworld;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.javahelps.helloworld.CurentDayTime;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
@MultipartConfig
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
    	// TODO: what is it?
    	// TODO: whta is construction function in java
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String param1 = request.getParameter("param1");
		// String data = "Hello";
		
		CurentDayTime get = new CurentDayTime();
		
		String show = get.GetCurent(getServletName());
		
		response.setContentType("text/html");
        PrintWriter printWriter  = response.getWriter();
        if (param1 == null){
            printWriter.print("<p>Hello World, I'm Hai. Today is : " + show + "</p>");

        }
        else 
        {
        	printWriter.print("<p>Hello World, I'm "+ param1 +" . Today is : " + show + "</p>");
        }
       // response.getWriter().write(data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String description = request.getParameter("description");
		Part filePart = request.getPart("file");
		String fileName = Paths.get(filePart.getName()).getFileName().toString();
		InputStream fileContent = filePart.getInputStream();
		/*File directory = new File("/media/chiphoi/DATA/image");
		 if (!directory.exists()) {
		      if (directory.mkdir()) {
		         System.out.println("Directory is created!");
		      } else {
		         System.out.println("Failed to create directory!");
		      }
		   }*/
		String name = "image_";
		int i[]={1,2,3,4,5};
		OutputStream out = new FileOutputStream("/media/chiphoi/DATA/image/"+ name + i[1]);
		//OutputStream out = response.getOutputStream();
		byte[] buffer = new byte[4096];
		int length;
		while ((length = fileContent.read(buffer)) > 0){
		    out.write(buffer, 0, length);
		}
		fileContent.close();
		out.close();
		System.out.println("Im hai");
		String method = request.getMethod();
		System.out.println(method);
		response.addHeader("abc", "def");
		response.setContentType("text/html");
		response.getWriter().println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		response.getWriter().println("<title>Insert title here</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		response.getWriter().println("<p>Tao la Hai</p>");
		response.getWriter().print("<img size=\"200\">");
		response.getWriter().println("</body>");
		response.getWriter().println("<html>");

	}
}
