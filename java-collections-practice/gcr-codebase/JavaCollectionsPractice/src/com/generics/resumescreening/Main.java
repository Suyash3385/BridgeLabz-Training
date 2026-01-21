package com.generics.resumescreening;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1=new Resume<>("Suyash", new SoftwareEngineer());
        Resume<ProductManager>r3=new Resume<>("Neha", new ProductManager());
        List<JobRole> roles=new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new ProductManager());

        ScreeningPipeline.processRoles(roles);
    }
}
