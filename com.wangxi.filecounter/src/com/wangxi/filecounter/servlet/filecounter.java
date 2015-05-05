package com.wangxi.filecounter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class filecounter
 */
@WebServlet("/*")
public class filecounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public filecounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();
	    String uri = request.getRequestURI();
	    out.write(uri);
	    
	    if (uri.equalsIgnoreCase("/com.wangxi.filecounter/1"))
	    {
		    out.write("{\"userId\": 1, \"id\": 1, \"title\": \"wangbin\"}");
	    }
	    else if (uri.equalsIgnoreCase("/com.wangxi.filecounter/2/2"))
	    {
		    out.write("{\"userId\": 1, \"id\": 1, \"title\": \"jiaoshou\"}");
	    }
	    else
	    {
		    out.write("{\"userId\": 1, \"id\": 1, \"title\": \"huang\"}");
	    }
	    	
	    
	    	/*
	    String uri = request.getRequestURI();
	    out.write("\nuri is :" + uri);
	    
	    String lName = request.getLocalName();
	    out.write("\nlocal name is :" + lName);
	    
	    String ip = request.getContextPath();
	    out.write("\ncontext path is: " + ip);
	    */
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
