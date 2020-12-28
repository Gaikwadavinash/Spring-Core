package com.nt.bo;

import java.io.Serializable;
public class ProductBo {
private String pName;
private String type;
private float basePrice;
private String status;
private int qty;
private float mrp;
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
public float getBasePrice() {
	return basePrice;
}
public void setBasePrice(float basePrice) {
	this.basePrice = basePrice;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public float getMrp() {
	return mrp;
}
public void setMrp(float mrp) {
	this.mrp = mrp;
}
@Override
public String toString() {
	return "ProductBo [pName=" + pName + ", type=" + type + ", basePrice=" + basePrice + ", status=" + status + ", qty="
			+ qty + ", mrp=" + mrp + "]";
}
}
