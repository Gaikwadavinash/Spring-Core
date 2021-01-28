package com.nt.service;
import com.nt.bo.CustmerBO;
import com.nt.bo.ProductBo;
import com.nt.dao.IProductDAO;
import com.nt.dto.CustmerDTO;
import com.nt.dto.ProductDTO;
public class ProductMangServiceImpl implements IProductMangService {
private IProductDAO dao;
public ProductMangServiceImpl(IProductDAO dao) {
	this.dao = dao;
}
	@Override
	public String calmrpPrice(ProductDTO dto) throws Exception {
float mrp;
		if(dto.getBaseprice()<=50) {
 mrp= dto.getBaseprice()+dto.getBaseprice()*12/100.0f;
}else if(dto.getBaseprice()>50 && dto.getBaseprice()<=100){
	 mrp= dto.getBaseprice()+dto.getBaseprice()*15/100.0f;	
}else {
	 mrp= dto.getBaseprice()+dto.getBaseprice()*18/100.0f;	
}
		ProductBo bo= new ProductBo();
		bo.setpName(dto.getpName());
		bo.setStatus(dto.getStatus());
		bo.setType(dto.getType());
		bo.setBasePrice(dto.getBaseprice());
		bo.setQty(dto.getQty());
		bo.setMrp(mrp);	
		
int count=dao.insert(bo);
return count==0?"Product Registred Failed":"Product Registred Sucessfully::Deails::ProductName::"+dto.getpName()+"\t"+"BasePrice::"+dto.getBaseprice()+"\t"+"Status::"+dto.getStatus()+"\t"+"mrp::"+mrp;
	}

}
