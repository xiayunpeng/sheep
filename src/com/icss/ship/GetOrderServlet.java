package com.icss.ship;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ö�������
 */
@WebServlet("/GetOrderServlet")
public class GetOrderServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		���ñ���
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
//		�����
		PrintWriter out = response.getWriter();
		
//		��ñ�����
		String[] prices= request.getParameterValues("price"); //Ʊ��
		String[] names = request.getParameterValues("name"); //�˿�����
		String[] codes = request.getParameterValues("code"); //֤������
		String[] mobiles = request.getParameterValues("mobile"); //�ֻ�
		
		String ticketCount = request.getParameter("ticket"); //Ʊ������
		String totalPrice = request.getParameter("totalPrice"); //�����ܶ�
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(prices));
		System.out.println(Arrays.toString(codes));
		System.out.println(Arrays.toString(mobiles));	
		
		System.out.println("Ʊ��������" + ticketCount);
		System.out.println("�����ܶ" + totalPrice);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}