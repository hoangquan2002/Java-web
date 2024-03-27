package fjs.cs.action;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fjs.cs.common.Constants;
import fjs.cs.dao.T003Dao;
import model.CustomerInfo;
import model.UserInfo;

public class T003 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        RequestDispatcher myRD = null;
        myRD = req.getRequestDispatcher(Constants.T003_EDIT);
        HttpSession session = req.getSession();
        UserInfo user = (UserInfo) session.getAttribute("userinfo");
        String userName = user.getgUsername();
        req.setAttribute("username", userName);
        String S = req.getParameter("customerId");
        if (S != null) {
            int customerId = Integer.parseInt(S);
            T003Dao dao = new T003Dao();
            CustomerInfo customerInfo = dao.getCustomerInfo(customerId);
            req.setAttribute("customerId", customerInfo.getCustomerId());
            req.setAttribute("customerName", customerInfo.getCustomerName());
            req.setAttribute("sex", customerInfo.getSex());
            req.setAttribute("birthday", customerInfo.getBirthday());
            req.setAttribute("email", customerInfo.getEmail());
            req.setAttribute("address", customerInfo.getAddress());
            session.setAttribute("customerInfo", customerInfo);
        } else {
            
        }

        myRD.forward(req, resp);
    }

    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher myRD = null;
        myRD = req.getRequestDispatcher(Constants.T003_EDIT);
        HttpSession session = req.getSession();
        CustomerInfo customerInfo = (CustomerInfo) session.getAttribute("customerInfo");
        String sMode = req.getParameter("mode");

        if ("save".equals(sMode)) {

            int id = customerInfo.getCustomerId();
            String name = (String) req.getParameter("customerName");
            String sex = (String) req.getParameter("sex");
            String bday = (String) req.getParameter("birthday");
            String e = (String) req.getParameter("email");
            String ar = (String) req.getParameter("address");

            T003Dao dao = new T003Dao();
            customerInfo = dao.updateCustomer(id, name, sex, bday, e, ar);
            req.setAttribute("customerId", customerInfo.getCustomerId());
            req.setAttribute("customerName", customerInfo.getCustomerName());
            req.setAttribute("sex", customerInfo.getSex());
            req.setAttribute("birthday", customerInfo.getBirthday());
            req.setAttribute("email", customerInfo.getEmail());
            req.setAttribute("address", customerInfo.getAddress());
        } else if ("logout".equals(sMode)) {

            if (session != null) {
                session.invalidate(); 
            }

            String redirectURL = req.getContextPath() + "/T001";           
            resp.sendRedirect(redirectURL);   
            return;
        }

        myRD.forward(req, resp);
    }

}
