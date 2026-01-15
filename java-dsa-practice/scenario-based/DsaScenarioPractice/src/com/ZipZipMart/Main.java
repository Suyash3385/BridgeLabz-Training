package com.ZipZipMart;

public class Main {
	    public static void main(String[] args) {

	        SalesRecord[] records={ new SalesRecord("2025-01-10", 1200),new SalesRecord("2025-01-09", 700), new SalesRecord("2025-01-10", 900),new SalesRecord("2025-01-08", 1500), new SalesRecord("2025-01-09", 500)};
	        SalesReport report=new SalesReport();
	        System.out.println("Before Sorting:");
	        report.printReport(records);

	        report.mergeSort(records, 0, records.length - 1);

	        System.out.println("After Sorting :");
	        report.printReport(records);
	 }
	}



