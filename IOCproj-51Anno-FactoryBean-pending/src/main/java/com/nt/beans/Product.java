package com.nt.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
//@AllArgsConstructor
//@RequiredArgsConstructor
public abstract class Product {
private int pId;
private String pName;
}
