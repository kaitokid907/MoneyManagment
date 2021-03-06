package com.pddstudio.pocketlibrary.models;


import java.io.Serializable;

public class Profile implements Serializable {

    private String profileName;
    private String profileDescription;
    private boolean isProtected;
    private double fixedMonthlyIncome;

    public Profile() {
        //required empty default constructor
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public double getFixedMonthlyIncome() {
        return fixedMonthlyIncome;
    }

    public void setFixedMonthlyIncome(double fixedMonthlyIncome) {
        this.fixedMonthlyIncome = fixedMonthlyIncome;
    }
}
