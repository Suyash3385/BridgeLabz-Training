package com.ZipZipMart;

public class SalesRecord {
private String date;
private Double amount;

SalesRecord(String date,double amount){
	this.date=date;
	this.amount=amount;
}
public String getDate() {
	return date;
}
public double getAmount() {
	return amount;
}
public String toString() {
	return date + "rs: " +amount;
}

}
