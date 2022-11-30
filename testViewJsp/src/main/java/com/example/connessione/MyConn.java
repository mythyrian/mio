package com.example.connessione;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConn {
	
	private static MyConn c = null;
	private static Connection conn=null;
	
	private MyConn() {
		
		// Obtain our environment naming context
		Context initCtx;
		Context envCtx;
		DataSource ds;
		
		try {
			initCtx = new InitialContext();
			envCtx = (Context) initCtx.lookup("java:comp/env");
			// Look up our data source
			ds = (DataSource)
			envCtx.lookup("jdbc/sakila");
			// Allocate and use a connection from the pool
			conn = ds.getConnection();
			conn.close();
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	public Connection getConnection() {
		if(c == null) {
			new MyConn();
		}
		return conn;
	}

}
