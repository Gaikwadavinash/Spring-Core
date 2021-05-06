package com.nt.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO{
private static final String GET_EMP_DESG="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";

@Autowired
private DataSource ds;
@Override
public List<EmployeeBO> getEmpDesg(String desg1, String desg2, String desg3) throws Exception {

PreparedStatement ps=null;
Connection con=null;
ResultSet rs=null;
List<EmployeeBO> empbo= null;
try {
//create Connection
	con=ds.getConnection();
	//prepared Statement
	ps=con.prepareStatement(GET_EMP_DESG);
	//set the values
	ps.setString(1, desg1);
	ps.setString(2, desg2);
	ps.setString(3, desg3);
	rs=ps.executeQuery();
	//convert  ResultSet obj records to ListBO
	empbo= new ArrayList();
//getting data one by one
	while(rs.next()) {
	EmployeeBO bo= new EmployeeBO();
	bo.setEmpNo(rs.getInt(1));
	bo.setEName(rs.getString(2));
	bo.setJob(rs.getString(3));
	bo.setSal(rs.getFloat(4));
	bo.setDeptNo(rs.getInt(5));
	empbo.add(bo);
}
}
	catch(SQLException se) {
		se.printStackTrace();
		throw se; //Exception rethrowing for exception propagation
	}
	catch(Exception e) {
		e.printStackTrace();
		throw e;  //Exception rethrowing  for exception propagation
	}
finally {
	try {
	  if(rs!=null)
		 rs.close();
	}
	catch(SQLException se) {
		se.printStackTrace();
	}
	try {
		  if(ps!=null)
			 ps.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	try {
		  if(con!=null)
			 con.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
}//finally
return empbo;

}
}
