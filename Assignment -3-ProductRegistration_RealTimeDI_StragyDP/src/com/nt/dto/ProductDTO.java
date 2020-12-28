package com.nt.dto;
import java.io.Serializable;
public class ProductDTO implements Serializable{
private String pName;
private String type;
private float Baseprice;
private String status;
private int qty;
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
public float getBaseprice() {
	return Baseprice;
}
public void setBaseprice(float Baseprice) {
	this.Baseprice =Baseprice;
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
@Override
public String toString() {
	return "ProductDTO [pName=" + pName + ", type=" + type + ", Baseprice=" + Baseprice + ", status=" + status
			+ ", qty=" + qty + "]";
}

}