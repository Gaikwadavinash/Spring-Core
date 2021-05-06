package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAOImpl;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;
@Service("empService")
public class EmployeeMangServiceImpl implements IEmployeeMangService {
@Autowired
private IEmployeeDAO dao;

//public EmployeeMangServiceImpl() {
//	dao= new EmployeeDAOImpl();
//}	
	
public List<EmployeeDTO> fetchEmpDesg(String desg1, String desg2, String desg3) throws Exception {
	List<EmployeeBO> empBO=dao.getEmpDesg(desg1, desg2, desg3);
	
//convert ListBO to ListDTOn null
	List<EmployeeDTO> empDTO=new ArrayList();
	empBO.forEach(bo->{
	EmployeeDTO dto= new EmployeeDTO();
	BeanUtils.copyProperties(bo,dto);//copy  bean properties and data
	dto.setSerialNo(empDTO.size()+1);
empDTO.add(dto);
	});
	return empDTO; 
}
}
