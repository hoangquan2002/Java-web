package fjs.cs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CustomerInfo;
import model.DataConnect;

public class T002Dao {
    Connection conn = null;
    PreparedStatement ps = null;

    private ArrayList<CustomerInfo> listAccount = new ArrayList<>();

    public List<CustomerInfo> getlistAccount(String customerId, String customerName, String sex, String email, String birthdayFrom, String birthdayTo) {
        try {
            StringBuilder queryBuilder = new StringBuilder("SELECT * FROM MSTCUSTOMER WHERE 1 = 1");

            if (customerId != null && !customerId.isEmpty()) {
                queryBuilder.append(" AND CUSTOMER_ID = ").append(customerId);
            }
            if (customerName != null && !customerName.isEmpty()) {
                queryBuilder.append(" AND CUSTOMER_NAME = '").append(customerName).append("'");
                System.out.println(queryBuilder);
            }
            if (sex != null && !sex.isEmpty()) {
                queryBuilder.append(" AND SEX = '").append(sex).append("'");
            }
            if (birthdayFrom != null && !birthdayFrom.isEmpty() && birthdayTo != null && !birthdayTo.isEmpty()) {
                queryBuilder.append(" AND BIRTHDAY >= '").append(birthdayFrom).append("'");
                queryBuilder.append(" AND BIRTHDAY <= '").append(birthdayTo).append("'");
            }
            queryBuilder.append(" AND DELETE_YMD IS NULL  ");
            queryBuilder.append(" ORDER BY CUSTOMER_ID ");

            conn = DataConnect.getConnection();
            System.out.println(queryBuilder);
            ps = conn.prepareStatement(queryBuilder.toString());
            System.out.println(ps);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CustomerInfo customer = new CustomerInfo(rs.getInt("CUSTOMER_ID"), rs.getString("CUSTOMER_NAME"), rs.getString("SEX"), rs.getString("BIRTHDAY"), rs.getString("EMAIL"),  rs.getString("ADDRESS"));
                listAccount.add(customer);
                System.out.println(customer.getCustomerId());
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null)
                    ps.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listAccount;
    }

}
