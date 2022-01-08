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
import kr.or.iei.tv.model.vo.TV;
import kr.or.iei.tv.model.vo.TVmanager;

/**
 * Servlet implementation class Dependency4Servlet
 */
public class Dependency4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dependency4Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("/ApplicationContext.xml");
		
		TVmanager tm = context.getBean("tvMgr",TVmanager.class);
		PersonManager pm = context.getBean("pm",PersonManager.class);
		
		TV tv = tm.getTv();
		Person ps = pm.getPs();
		
		tv.powerOn();
		tv.soundOn();
		tv.soundOff();
		tv.powerOff();
		
		System.out.println(ps.getName());
		System.out.println(ps.getAge());
		System.out.println(ps.getAddr());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
