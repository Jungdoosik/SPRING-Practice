package kr.or.iei.person.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.iei.person.model.vo.Person;
import kr.or.iei.person.model.vo.PersonListBeanFactory;

/**
 * Servlet implementation class CollectionListServlet
 */
public class CollectionListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollectionListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("/personBeanListContext.xml");
		
		PersonListBeanFactory listBeanFactory = context.getBean("listBeanFactory",PersonListBeanFactory.class);
		
		ArrayList<Person> list = listBeanFactory.getList();
		
		for(Person p : list) {
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getAddr());
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
