package kr.or.iei.person.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.iei.person.model.vo.Person;
import kr.or.iei.person.model.vo.PersonManager;

/**
 * Servlet implementation class Dependency5Servlet
 */
public class Dependency5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dependency5Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("/personBeanScopeContext.xml");
		
		PersonManager psMgr1 = context.getBean("psMgr",PersonManager.class);
		
		Person ps1 = psMgr1.getPs();
		
		System.out.println(ps1.getName());
		System.out.println(ps1.getAge());
		System.out.println(ps1.getAddr());
		
		ps1.setAge(100);
		System.out.println("--------------------------------------");
		
		
		PersonManager psMgr2 = context.getBean("psMgr",PersonManager.class);
		Person ps2 = psMgr2.getPs();
		
		System.out.println(ps2.getName());
		System.out.println(ps2.getAge());
		System.out.println(ps2.getAddr());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
