package com.example.project;

public class Berries {
    private String name; //Hallon
    private String company; //Paj
    private String location; //buske
    private String category; //små-frukt
    private String auxdata; //raspberry.png

    public Berries(String name, String grows, String worksAs, String type, String img) {
        this.name = name;
        this.company = company;
        this.location = location;
        this.category = category;
        this.auxdata = auxdata;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public String getAuxdata() {
        return auxdata;
    }

    @Override
    public String toString() {
        return name + " är av typen " + category + " och fungerar bra som " + company + ". Den växer på " + location + ".";
    }
}
