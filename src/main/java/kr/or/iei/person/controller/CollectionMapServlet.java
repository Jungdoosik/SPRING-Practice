package kr.or.iei.person.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.iei.person.model.vo.PersonMapBeanFactory;

/**
 * Servlet implementation class CollectionMapServlet
 */
public class CollectionMapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollectionMapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("/personBeanMapContext.xml");
		
		PersonMapBeanFactory mapBeanFactory = context.getBean("mapBeanFactory",PersonMapBeanFactory.class);
		
		HashMap<String,String> map = mapBeanFactory.getMap();
		
		System.out.println(map.get("홍길동"));
		System.out.println(map.get("김말동"));
		System.out.println(map.get("고길동"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
