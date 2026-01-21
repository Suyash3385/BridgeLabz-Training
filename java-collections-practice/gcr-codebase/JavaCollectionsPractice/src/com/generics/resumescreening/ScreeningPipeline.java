package com.generics.resumescreening;


import java.util.List;

public class ScreeningPipeline {

    public static void processRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("AI configured for role: " + role.getRoleName());
        }
    }
}
