package com.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.training.interfaces.CrudRepository;
import com.training.model.Customer;

public class CustomerRepositoryImpl implements CrudRepository<Customer> {
	private Connection con;
	public  CustomerRepositoryImpl(Connection con) {
		super();
		this.con=con;
	}
	@Override
	public int add(Customer t) throws SQLException {
		String sqlAdd= "insert into customer values(?,?,?)";
		PreparedStatement pstmt= con.prepareStatement(sqlAdd);
		pstmt.setInt(1,t.getId());
		pstmt.setString(2,t.getCustomerName());
		pstmt.setString(3,t.getEmail());
		int rowAdded =pstmt.executeUpdate();	
		return rowAdded;
	}
	public void setCon(Connection con) {
		this.con=con;
	}

	public Connection getCon() {
		return con;
	}
	
	@Override
	public List<Customer> findAll() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Customer> custList= new ArrayList<>();
		String sql= "select * from Customer";
		PreparedStatement pstmt= con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		 while(rs.next()) {
		   int id= rs.getInt("id");
		   String customerName=rs.getString("customerName");
		   String email=rs.getString("email");
		
		   custList.add(new Customer(id,customerName,email));		
		
	      }
	     return custList;
	}
	@Override
	public Customer findById(int key) throws SQLException {
		// TODO Auto-generated method stub
		String sql= "select * from Customer where id=?";
	    Customer cust =null;
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, key);
		ResultSet rs=pstmt.executeQuery();
		 while(rs.next()) {
		   int id= rs.getInt("id");
		   String customerName=rs.getString("customerName");
		   String email=rs.getString("email");
		
		   cust=new Customer(id,customerName,email);
		 }
		
		return cust;
	}
	@Override
	public boolean remove(int key) throws SQLException {
		
		// TODO Auto-generated method stub
		int rs=0;
		String sql= "delete from Customer where id=?";
	   
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, key);
		rs=pstmt.executeUpdate();
		if(rs==1) {
		    return true;
	}
		return false;

}
}
