package by.epam.unit04.country.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {  //район

    private String title;
    List<City> cities;

    public District(String name, List<City> cities) {
        this.title = name;
        this.cities = cities;
    }

    public District() {
        this("no name city", new ArrayList<>() );
       }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    // bean rule 2 get и 2 set

    public void addCity (City city){ //добавление города в коллекцию в конец
        cities.add(city);
    }
    public void addCity (int index, City city){ //добавление города в указанную позицию
        cities.add(index, city);
    }

    public City getCity(City city) { //вернуть город из коллекции
        for (City c : cities) {
            if (city.equals(c)) {
                return city;
            }
        }
        return new City(); //вернуть пустой город )))
    }
    public City getCity (int index){ //вернуть город из коллекции по индексу
        return cities.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(title, district.title) &&
                Objects.equals(cities, district.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, cities);
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + title + '\'' +
                ", cities=" + cities +
                '}';
    }
}