package com.example.project;

public class Berries {
    private String name;
    private String grows;
    private String worksAs;
    private String type;
    private String img;

    public Berries(String name, String grows, String worksAs, String type, String img) {
        this.name = name;
        this.grows = grows;
        this.worksAs = worksAs;
        this.type = type;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getGrows() {
        return grows;
    }

    public String getWorksAs() {
        return worksAs;
    }

    public String getType() {
        return type;
    }

    public String getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "Berries{" +
                "name='" + name + '\'' +
                ", grows='" + grows + '\'' +
                ", worksAs='" + worksAs + '\'' +
                ", type='" + type + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
