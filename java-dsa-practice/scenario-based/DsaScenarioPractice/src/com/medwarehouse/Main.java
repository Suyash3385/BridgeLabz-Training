package com.medwarehouse;

public class Main {
	public static void main(String[] args) {

        Medicine[] medicines={
            new Medicine("Paracetamol", 30),new Medicine("Insulin", 5), new Medicine("Vitamin C", 90), new Medicine("Antibiotic", 12)};

        Warehouse warehouse=new Warehouse();
        warehouse.mergeSort(medicines);

        for (Medicine m:medicines) {
            System.out.println(m.name  + m.expiry );
        }
	}
}
