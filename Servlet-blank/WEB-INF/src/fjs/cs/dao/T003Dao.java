package fjs.cs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.CustomerInfo;
import model.DataConnect;

public class T003Dao {
	Connection conn = null; 
	PreparedStatement ps = null;
	public CustomerInfo getCustomerInfo(int customerId) {
        CustomerInfo customer = null;
        try {
        	conn = DataConnect.getConnection();
            String query = "SELECT * FROM MSTCUSTOMER WHERE CUSTOMER_ID = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, customerId);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                customer = new CustomerInfo(
                        rs.getInt("CUSTOMER_ID"),
                        rs.getString("CUSTOMER_NAME"),
                        rs.getString("SEX"),
                        rs.getString("BIRTHDAY"),
                        rs.getString("EMAIL"),
                        rs.getString("ADDRESS")
                );
            }
            rs.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return customer;
    }
	
	public CustomerInfo updateCustomer(int customerId, String customerName, String sex, String birthday, String email, String address) {
	    CustomerInfo customer = null;
	    StringBuilder queryBuilder = new StringBuilder("UPDATE MSTCUSTOMER SET ");

	    if (customerName != null && !customerName.isEmpty()) {
	        queryBuilder.append("CUSTOMER_NAME = ?, ");
	    }
	    if (sex != null && !sex.isEmpty()) {
	        queryBuilder.append("SEX = ?, ");
	    }
	    if (birthday != null && !birthday.isEmpty()) {
	        queryBuilder.append("BIRTHDAY = ?, ");
	    }
	    if (email != null && !email.isEmpty()) {
	        queryBuilder.append("EMAIL = ?, ");
	    }
	    if (address != null && !address.isEmpty()) {
	        queryBuilder.append("ADDRESS = ?, ");
	    }

	    if (queryBuilder.charAt(queryBuilder.length() - 2) == ',') {
	        queryBuilder.delete(queryBuilder.length() - 2, queryBuilder.length());
	    }

	    queryBuilder.append(" WHERE CUSTOMER_ID = ?");

	    try {
	        conn = DataConnect.getConnection();
	        ps = conn.prepareStatement(queryBuilder.toString());

	        int parameterIndex = 1;

	        if (customerName != null && !customerName.isEmpty()) {
	            ps.setString(parameterIndex++, customerName);
	        }
	        if (sex != null && !sex.isEmpty()) {
	            ps.setString(parameterIndex++, sex);
	        }
	        if (birthday != null && !birthday.isEmpty()) {
	            ps.setString(parameterIndex++, birthday);
	        }
	        if (email != null && !email.isEmpty()) {
	            ps.setString(parameterIndex++, email);
	        }
	        if (address != null && !address.isEmpty()) {
	            ps.setString(parameterIndex++, address);
	        }

	        ps.setInt(parameterIndex, customerId);

	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected > 0) {
	            customer = getCustomerInfo(customerId);
	        }
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (ps != null) ps.close();
	            if (conn != null) conn.close();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }
	    return customer;
	}
	
	public CustomerInfo addCustomer(String customerName, String sex, String birthday, String email, String address, int insertPsnCd) {
	    CustomerInfo customer = null;
	    try {
	        conn = DataConnect.getConnection();
	        String query = "INSERT INTO MSTCUSTOMER (CUSTOMER_NAME, SEX, BIRTHDAY, EMAIL, ADDRESS, INSERT_PSN_CD) VALUES (?, ?, ?, ?, ?, ?)";
	        ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	        ps.setString(1, customerName);
	        ps.setString(2, sex);
	        ps.setString(3, birthday);
	        ps.setString(4, email);
	        ps.setString(5, address);
	        ps.setInt(6, insertPsnCd);

	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected > 0) {
	            ResultSet generatedKeys = ps.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                int newCustomerId = generatedKeys.getInt(1);
	                customer = getCustomerInfo(newCustomerId);
	            }
	        }
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (ps != null) ps.close();
	            if (conn != null) conn.close();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }
	    return customer;
	}

	
	
	
	
}
