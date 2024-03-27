/**
 * @(#)T001.java 01-00 2021/07/16
 *
 * Copyright(C) 2021 by FUJINET CO., LTD.
 *
 * Last_Update 2021/07/16.
 * Version 1.00.
 */
package fjs.cs.action;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fjs.cs.common.Constants;
import fjs.cs.dao.T001Dao;
import model.UserInfo;



/**
 * T001
 * 
 * @version 1.00
 * @since  1.00
 * @author Long-PH
 * 
 */
public class T001 extends HttpServlet{

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
        // Hien thi man hinh Login
        myRD = req.getRequestDispatcher(Constants.T001_LOGIN);
        myRD.forward(req, resp);

    }

    /**
     * Event man hinh
     * 
     * @param HttpServletRequest req
     * @param HttpServletResponse resp
     * @return RequestDispatcher
     * @throws ServletException, IOException
     * @since 1.00
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher myRD = null;
        String myUsername = request.getParameter("username");
        String myPassword = request.getParameter("password");

        if (myUsername == null || myUsername.trim().length() == 0) {
            myRD = request.getRequestDispatcher(Constants.T001_LOGIN);
            request.setAttribute("errorMessage", "ユーザーIDを入力してください。");

        } else if(myPassword == null || myPassword.trim().length() == 0) {
            myRD = request.getRequestDispatcher(Constants.T001_LOGIN);
            request.setAttribute("errorMessage", "パスワードを入力してください。");
        }
        else {
            UserInfo myUserInfo = T001Dao.getUserInfo(myUsername,
                    myPassword);
            request.setAttribute("userinfo", myUserInfo);
            if (myUserInfo == null) {
                myRD = request.getRequestDispatcher(Constants.T001_LOGIN);
                request.setAttribute("errorMessage", "ユーザーIDまたはパスワードが不正です。");            } 
            else {
                System.out.println("da co tai khoan2");
                HttpSession session = request.getSession();
                session.setAttribute("userinfo", myUserInfo);    
                
                String redirectURL = request.getContextPath() + "/T002";           
                response.sendRedirect(redirectURL);           
                return;

            }
        }myRD.forward(request, response);
    }

}
