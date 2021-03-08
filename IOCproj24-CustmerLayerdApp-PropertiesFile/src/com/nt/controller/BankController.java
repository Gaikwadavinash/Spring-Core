package com.nt.controller;

import com.nt.dto.CustmerDTO;
import com.nt.service.CustmerMangServiceImpl;
import com.nt.vo.CustmerVO;
public class BankController {
private CustmerMangServiceImpl service;

public BankController(CustmerMangServiceImpl service) {
	this.service = service;
}

public String processCustmer(CustmerVO vo) throws Exception{
	//convert CustomerVO to CustomerDTO
	CustmerDTO dto= new CustmerDTO();
	dto.setCname(vo.getCname());
	dto.setCadd(vo.getCadd());
	dto.setPamt(Float.parseFloat(vo.getpAmt()));
	dto.setRate(Float.parseFloat(vo.getRate()));
	dto.setTime(Float.parseFloat(vo.getTime()));
	//use service
	String result=service.calSimpleIntrest(dto);
	return result;
}
}
