package by.epam.unit04.country.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region { //область

    private String title; //название области
    private int area;  //площадь области
    List<District> districts;

    public Region(String title, int area, List<District> districts) {
        this.title = title;
        this.area = area;
        this.districts = districts;
    }

    public Region() {
        this("no name region", 0, new ArrayList<>());
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
    // bean rule 2 get и 2 set

    public void addDistrict (District district){ //добавление области в коллекцию в конец
        districts.add(district);
    }
    public void addDistrict (int index, District district){ //добавление области в указанную позицию
        districts.add(index, district);
    }

    public District getDistrict(District district) { //вернуть город из коллекции
        for (District d : districts) {
            if (district.equals(d)) {
                return district;
            }
        }
        return new District(); //вернуть пустой район )))
    }
    public District getDistrict (int index){ //вернуть район из коллекции по индексу
        return districts.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return area == region.area &&
                Objects.equals(title, region.title) &&
                Objects.equals(districts, region.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, area, districts);
    }

    @Override
    public String toString() {
        return "Region{" +
                "title='" + title + '\'' +
                ", area=" + area +
                ", districts=" + districts +
                '}';
    }
}
