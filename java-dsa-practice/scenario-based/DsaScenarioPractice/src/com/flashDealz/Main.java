package com.flashDealz;

public class Main {
	public static void quickSort(Product[] products, int low, int high) {
        if (low<high) {
            int pivotIndex=partition(products, low, high);
            quickSort(products, low, pivotIndex-1);
            quickSort(products, pivotIndex+1, high);
        }
    }
    private static int partition(Product[] products, int low, int high) {
        Product pivot=products[high];
        int i =low-1;

        for (int j =low; j<high; j++) {
            if (products[j].discount>pivot.discount) {
                i++;
                Product temp=products[i];
                products[i]=products[j];
                products[j]=temp;
            }
        }

        Product temp=products[i+1];
        products[i+1]=products[high];
        products[high]=temp;

        return i+1;
    }
    public static void display(Product[] products) {
        for (Product p:products) {
            System.out.println(p.name +  p.discount );
        }
    }
    public static void main(String[] args) {
        Product[] products = {new Product("Laptop", 30), new Product("Phone", 50), new Product("Headphones", 20), new Product("TV", 40)};

        System.out.println("Before Sorting:");
        display(products);

        quickSort(products, 0, products.length - 1);

        System.out.println("after sorting:");
        display(products);
    }

}
