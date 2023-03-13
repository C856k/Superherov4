package com.example.superhero_v4.model;

public class Superhelt {
    private String heroName;
    private String realName;
    private String superpowers;
    private boolean human;
    private static String city;

    public Superhelt(String heroName, String realName, String superpowers, boolean human, String city) {
        this.heroName = heroName;
        this.realName = realName;
        this.superpowers = superpowers;
        this.human = human;
        this.city = city;
    }

    public static String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(String superpowers) {
        this.superpowers = superpowers;
    }

    public boolean isHuman() {
        return human;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Superhelt{" +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", superpowers='" + superpowers + '\'' +
                ", human=" + human +
                '}';
    }

}
