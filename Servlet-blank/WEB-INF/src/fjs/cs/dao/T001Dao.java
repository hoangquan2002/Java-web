/**
 * @(#)T001Dao.java 01-00 2021/07/16
 * 
 * Copyright(C) 2021 by FUJINET CO., LTD.
 * 
 * Last_Update 2021/07/16
 * Version 1.00.
 */
package fjs.cs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.DataConnect;
import model.UserInfo;

/**
 * T001Dao
 * 
 * @version 1.00
 * @since 1.00
 * @author Long-PH
 * 
 */
public class T001Dao {
    public static UserInfo getUserInfo(String pUsername, String pPassword) {
        Connection conn = null;
        PreparedStatement stmt = null;
        UserInfo myUserObject = null;

        try {
            conn = DataConnect.getConnection();
            System.out.println("Connected...");
            String mySqlQuery = "SELECT * FROM MSTUSER";
            stmt = conn.prepareStatement(mySqlQuery);
            ResultSet myResultSet = stmt.executeQuery();

            while (myResultSet.next()) {
                String myDbUsername = myResultSet.getString("username");
                System.out.println(myDbUsername);
                String myDbPassword = myResultSet.getString("password");
                System.out.println(myDbPassword);

                if (pUsername.equals(myDbUsername) && pPassword.equals(myDbPassword)) {
                    myUserObject = new UserInfo();
                    myUserObject.setgUsername(myDbUsername);
                    System.out.println("da co tai khoan");

                    // Set other user information as needed
                    break;
                }
            }

            myResultSet.close();
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return myUserObject;
    }
}
