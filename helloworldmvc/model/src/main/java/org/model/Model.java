package org.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.contract.IModel;

public class Model implements IModel{
	
	
	public String getHelloWorld() throws SQLException{
		
		DAOHelloWorld.getInstance().open();
		ResultSet rs = DAOHelloWorld.getInstance().executeQuery(DAOHelloWorld.getInstance().getQuerySelectFirstHelloWorld());
		rs.next();
		DAOHelloWorld.getInstance().close();
		return rs.getString(1);
		
	}

}
