package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustmerBO;
public class CustmerDAOImpl implements ICustmerDAO {

//Insert Query
	private String 
INSERT_CUST_QUERY="INSERT INTO SP_TB1_CUSTMER VALUES(CUST_NO.NEXTVAL,?,?,?,?,?,?)";
//DataSource Interface represent jdbc con pool obj
private DataSource ds;

private String os;


public void setOs(String os) {
	this.os = os;
}
public void setLang(String lang) {
	this.lang = lang;
}
private String lang;

@Override
public String toString() {
	return "CustmerDAOImpl [os=" + os + ", lang=" + lang + "]";
}
public CustmerDAOImpl(DataSource ds) {
	this.ds = ds;
}
	public int insert(CustmerBO bo) throws Exception {
	//get jbdc pool connection object
		Connection con=ds.getConnection();
		//prepared Statement query
PreparedStatement ps=con.prepareStatement(INSERT_CUST_QUERY);
//set values query param collecting data form Custemer BO
ps.setString(1,bo.getCname());
ps.setString(2, bo.getCadd());
ps.setFloat(3,bo.getPamt());
ps.setFloat(4, bo.getRate());
ps.setFloat(5,bo.getTime());
ps.setFloat(6, bo.getIntrAmt());
//execute Query
int count=ps.executeUpdate();
con.close();
		return count;
	}

}
