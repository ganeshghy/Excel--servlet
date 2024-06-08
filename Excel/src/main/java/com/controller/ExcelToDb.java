package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Excel2DatabaseTest;

/**
 * Servlet implementation class ExcelToDb
 */
public class ExcelToDb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Excel2DatabaseTest excel = new Excel2DatabaseTest();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String excelFilePath = "C:\\Users\\GANESH\\Downloads\\spdclmasterdata.xlsx";
		PrintWriter out = response.getWriter();
		boolean res = false;
		try {
			res = excel.insert(excelFilePath);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res) {
			out.println("excel data inserted into db");
		}
		else {
			out.println("err");
		}
	}

}
