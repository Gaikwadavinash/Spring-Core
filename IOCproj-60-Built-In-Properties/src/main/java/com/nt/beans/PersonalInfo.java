package com.nt.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
public class PersonalInfo {
private String name;
private float age;
private int luckyNumber;
//private Date dob;
private String[] mole;
private byte[] acedamicPercentage;
private long addharCard;
private char favChar;
private File fileLocation;
private Locale favLocale;
private URL fbUrl;
private Class favClass;
private Properties props;

private Date dom;
public Date getDom() {
	return dom;
}
public void setDom(Date dom) {
	this.dom = dom;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}
public int getLuckyNumber() {
	return luckyNumber;
}
public void setLuckyNumber(int luckyNumber) {
	this.luckyNumber = luckyNumber;
}
//public Date getDob() {
//	return dob;
//}
//public void setDob(Date dob) {
//	this.dob = dob;
//}
public String[] getMole() {
	return mole;
}
public void setMole(String[] mole) {
	this.mole = mole;
}
public byte[] getAcedamicPercentage() {
	return acedamicPercentage;
}
public void setAcedamicPercentage(byte[] acedamicPercentage) {
	this.acedamicPercentage = acedamicPercentage;
}
public long getAddharCard() {
	return addharCard;
}
public void setAddharCard(long addharCard) {
	this.addharCard = addharCard;
}
public char getFavChar() {
	return favChar;
}
public void setFavChar(char favChar) {
	this.favChar = favChar;
}
public File getFileLocation() {
	return fileLocation;
}
public void setFileLocation(File fileLocation) {
	this.fileLocation = fileLocation;
}
public Locale getFavLocale() {
	return favLocale;
}
public void setFavLocale(Locale favLocale) {
	this.favLocale = favLocale;
}
public URL getFbUrl() {
	return fbUrl;
}
public void setFbUrl(URL fbUrl) {
	this.fbUrl = fbUrl;
}
public Class getFavClass() {
	return favClass;
}
public void setFavClass(Class favClass) {
	this.favClass = favClass;
}
public Properties getProps() {
	return props;
}
public void setProps(Properties props) {
	this.props = props;
}
@Override
public String toString() {
	return "PersonalInfo [name=" + name + ", age=" + age + ", luckyNumber=" + luckyNumber + ", mole="
			+ Arrays.toString(mole) + ", acedamicPercentage=" + Arrays.toString(acedamicPercentage) + ", addharCard="
			+ addharCard + ", favChar=" + favChar + ", fileLocation=" + fileLocation + ", favLocale=" + favLocale
			+ ", fbUrl=" + fbUrl + ", favClass=" + favClass + ", props=" + props + ", dom=" + dom + "]";
}

}
