package com.nt.vo;

public class ProductVo {
private String pName;
private String type;
private String basePrice;
private String status;
private String qty;
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getBasePrice() {
	return basePrice;
}
public void setBasePrice(String basePrice) {
	this.basePrice = basePrice;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getQty() {
	return qty;
}
public void setQty(String qty) {
	this.qty = qty;
}
@Override
public String toString() {
	return "ProductVo [pName=" + pName + ", type=" + type + ", basePrice=" + basePrice + ", status=" + status + ", qty="
			+ qty + "]";
}


}