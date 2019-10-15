package by.epam.unit04.country.entity;


import java.util.Objects;

public class City {

    private String title; //название города
    private boolean capitalOfCountry; //является ли столицей старны
    private boolean regionalCenter;  //является ли областным цетром
    private int population; //колличество населения

    public City(String title, boolean capitalOfCountry, boolean regionalCenter, int population) {
        this.title = title;
        this.capitalOfCountry = capitalOfCountry;
        this.regionalCenter = regionalCenter;
        this.population = population;
    }

    public City() {
        this.title = "no name";
        this.capitalOfCountry = false;
        this.regionalCenter = false;
        this.population = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCapitalOfCountry() {
        return capitalOfCountry;
    }

    public void setCapitalOfCountry(boolean capitalOfCountry) {
        this.capitalOfCountry = capitalOfCountry;
    }

    public boolean isRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return capitalOfCountry == city.capitalOfCountry &&
                regionalCenter == city.regionalCenter &&
                population == city.population &&
                Objects.equals(title, city.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, capitalOfCountry, regionalCenter, population);
    }

    @Override
    public String toString() {
        return "City{" +
                "title='" + title + '\'' +
                ", capitalOfCountry=" + capitalOfCountry +
                ", regionalCenter=" + regionalCenter +
                ", population=" + population +
                '}';
    }
}

