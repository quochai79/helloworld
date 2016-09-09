package com.javahelps.helloworld;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String filename = request.getParameter("file");
		FileInputStream in = new FileInputStream("/media/chiphoi/DATA/image/" + filename);
		//PrintWriter out1 = response.getWriter();
		String name = "image_";
		int i[]={1,2,3,4,5};
		OutputStream out = new FileOutputStream("/home/chiphoi/Downloads/" + name +i[0]);
		//OutputStream out = response.getOutputStream();
		byte[] buffer = new byte[6144];
	      int byteRead;
	      while ((byteRead = in.read(buffer)) > 0)
	      {
	         out.write(buffer, 0, byteRead);
	      }
	      in.close();
	      out.close();
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
