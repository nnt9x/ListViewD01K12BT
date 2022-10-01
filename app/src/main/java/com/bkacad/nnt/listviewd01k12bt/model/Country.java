package com.bkacad.nnt.listviewd01k12bt.model;

public class Country {
    private int id;
    private String name;
    private String capital;
    private String flagURL;
    private double square;
    private long population;

    public Country(int id, String name, String capital, String flagURL, double square, long population) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.flagURL = flagURL;
        this.square = square;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlagURL() {
        return flagURL;
    }

    public void setFlagURL(String flagURL) {
        this.flagURL = flagURL;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Đất nước [" +
                "tên: '" + name + '\'' +
                ", thủ đô: '" + capital + '\'' +
                ", diện tích: " + square + "km^2" +
                ", dân số: " + population + "người" +
                ']';
    }
}
