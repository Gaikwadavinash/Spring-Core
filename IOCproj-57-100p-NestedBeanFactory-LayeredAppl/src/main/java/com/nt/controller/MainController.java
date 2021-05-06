package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMangService;

@Controller("controller")
@Lazy
public class MainController {

	@Autowired
private IEmployeeMangService service;
public List<EmployeeDTO> showEmpDesg(String desg1,String desg2,String desg3)throws Exception{
List<EmployeeDTO> dto=service.fetchEmpDesg(desg1,desg2,desg3);
return dto;
}
}