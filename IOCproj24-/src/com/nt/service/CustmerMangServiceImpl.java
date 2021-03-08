package com.nt.service;

import com.nt.bo.CustmerBO;
import com.nt.dao.ICustmerDAO;
import com.nt.dto.CustmerDTO;
public class CustmerMangServiceImpl implements ICustmerMangSerivce {
	private ICustmerDAO dao;
	public  CustmerMangServiceImpl(ICustmerDAO dao) {
		this.dao=dao ;
	}
	public String calSimpleIntrest(CustmerDTO dto) throws Exception {
		//write b.logic to calculate simple intrAmount  based on  pAmt,rate,time
	float intrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
	////prepare  CustomerBO obj having persistable data
	CustmerBO bo= new CustmerBO();
	bo.setCname(dto.getCname());
	bo.setCadd(dto.getCadd());
	bo.setPamt(dto.getPamt());
	bo.setRate(dto.getRate());
	bo.setTime(dto.getTime());
	bo.setIntrAmt(intrAmt);
	//use DAO
	int count=dao.insert(bo);
		return 
count==0?"Custmer Registraion Faild..":"CustmerRegistraion Sucesssfull::Details are::Principle Amount:"+dto.getPamt()+"Time:: "+dto.getTime()+" rate::"+dto.getRate()+" Intrest amount:: "+intrAmt;
	}

}
