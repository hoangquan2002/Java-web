package fjs.cs.action;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fjs.cs.common.Constants;
import fjs.cs.dao.T002Dao;
import model.CustomerInfo;
import services.ListDivide;
public class T002 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	/**
	 * Init man hinh
	 * 
	 * @param HttpServletRequest req
	 * @param HttpServletResponse resp
	 * @return RequestDispatcher
	 * @throws ServletException, IOException
	 * @since 1.00
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher myRD = null;
		myRD = req.getRequestDispatcher(Constants.T002_SEARCH);
		String myUsername = req.getParameter("username");
		req.setAttribute("username", myUsername);	
		T002Dao dao = new T002Dao();
		HttpSession session = req.getSession();		
		Integer index = (Integer) session.getAttribute("index");
		if (index == null) {
			index = 0;
		}
		
        List<CustomerInfo> listAccount = dao.getlistAccount(null, null, null, null, null, null);
        List<List<CustomerInfo>> dividedLists = ListDivide.dividedListAccount(listAccount);
        session.setAttribute("dividedLists", dividedLists);
		req.setAttribute("list", dividedLists.get(index));
		session.setAttribute("totalPage",dividedLists.size());

		myRD.forward(req, resp);


	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher myRD = null;
		HttpSession session = request.getSession();		
		Integer index = (Integer) session.getAttribute("index");
		if (index == null) {
			index = 0;
		}
		
		String sMode = request.getParameter("mode");
				myRD = request.getRequestDispatcher(Constants.T002_SEARCH);	



		if("search".equals(sMode)) {	
			String nameSearch = request.getParameter("customerName");
			String sexSearch = request.getParameter("sex");
			String birthdayFromSearch = request.getParameter("birthdayFrom");
			String birthdayToSearch = request.getParameter("birthdayTo");
			
			T002Dao dao = new T002Dao();
			List<CustomerInfo> listAccount = dao.getlistAccount(null, nameSearch, sexSearch, null, birthdayFromSearch, birthdayToSearch);
			List<List<CustomerInfo>> dividedLists = ListDivide.dividedListAccount(listAccount);       
			index=0;
			session.setAttribute("index", index);
			session.setAttribute("dividedLists", dividedLists);
			
			
			request.setAttribute("customerName", nameSearch);
			request.setAttribute("sex", sexSearch);
			request.setAttribute("birthdayFrom", birthdayFromSearch);
			request.setAttribute("birthdayTo", birthdayToSearch);

			request.setAttribute("list", dividedLists.get(index));

		}
		else if("next".equals(sMode))
		{
			
			index++;			
			session.setAttribute("index", index);
		    List<List<CustomerInfo>> dividedLists = (List<List<CustomerInfo>>) session.getAttribute("dividedLists");
			request.setAttribute("list", dividedLists.get(index));

		}
		else if("previous".equals(sMode))
		{
			
			index--;			
			session.setAttribute("index", index);
		    List<List<CustomerInfo>> dividedLists = (List<List<CustomerInfo>>) session.getAttribute("dividedLists");

			request.setAttribute("list", dividedLists.get(index));
		}
		else if("first".equals(sMode))
		{
			
			index = 0 ;			
			session.setAttribute("index", index);
		    List<List<CustomerInfo>> dividedLists = (List<List<CustomerInfo>>) session.getAttribute("dividedLists");
			request.setAttribute("list", dividedLists.get(index));
		}
		else if("last".equals(sMode))
		{
		    List<List<CustomerInfo>> dividedLists = (List<List<CustomerInfo>>) session.getAttribute("dividedLists");
			index = dividedLists.size() -1  ;			
			session.setAttribute("index", index);	
			request.setAttribute("list", dividedLists.get(index));
		}
		else if("add".equals(sMode))
		{
			
			String redirectURL = request.getContextPath() + "/T003";		        
			response.sendRedirect(redirectURL);	
			return;
		}
		else if("detail".equals(sMode))
		{
			
			String redirectURL = request.getContextPath() + "/T003";		        
			response.sendRedirect(redirectURL);	
			return;
		}
		else if("logout".equals(sMode))
		{
			
			if (session != null) {
	            session.invalidate(); 
	        }
			
			String redirectURL = request.getContextPath() + "/T001";		        
			response.sendRedirect(redirectURL);	
			return;
		}

		myRD.forward(request, response);		


	}
}