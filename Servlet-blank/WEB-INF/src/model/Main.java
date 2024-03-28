package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fjs.cs.dao.T002Dao;
import services.ListDivide;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DataConnect.getConnection();
            if (connection != null) {
                System.out.println("Connect successful!");
                connection.close();
            } else {
                System.out.println("Cannot connect");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        T002Dao dao = new T002Dao();
        List<CustomerInfo> listAccount = dao.getlistAccount(null, null, null, null, null, null);
        List<CustomerInfo> bathList = ListDivide.getBatchAtIndex(listAccount, 0);
        for (int i = 0; i < bathList.size(); i++) {
            CustomerInfo customer = bathList.get(i);
            System.out.println(customer.getCustomerName());
        }
    }
}
