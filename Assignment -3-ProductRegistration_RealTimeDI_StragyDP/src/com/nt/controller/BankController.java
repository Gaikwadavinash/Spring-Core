package com.nt.controller;
import com.nt.dto.ProductDTO;
import com.nt.service.ProductMangServiceImpl;
import com.nt.vo.ProductVo;
public class BankController {
private ProductMangServiceImpl service;

public BankController(ProductMangServiceImpl service) {

	this.service = service;
}
public String productProcess(ProductVo vo) throws Exception{

ProductDTO dto= new ProductDTO();

dto.setpName(vo.getpName());
dto.setType(vo.getType());
dto.setStatus(vo.getStatus());
dto.setBaseprice(Float.parseFloat(vo.getBasePrice()));
dto.setQty(Integer.parseInt(vo.getQty()));
String result=service.calmrpPrice(dto);
	return result;	
}
}
