package by.epam.unit04.country.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {

    private String title;
    private List<Region> regions = new ArrayList<>();

    public Country(String title, List<Region> regions) {
        this.title = title;
        this.regions = regions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
    // bean rule 2 get и 2 set

    public void addRegion (Region region){ //добавление области в коллекцию в конец
        regions.add(region);
    }
    public void addRegion (int index, Region region){ //добавление области в указанную позицию
        regions.add(index, region);
    }

    public Region getRegion(Region region) { //вернуть область из коллекции
        for (Region r : regions) {
            if (region.equals(r)) {
                return region;
            }
        }
        return new Region(); //вернуть пустую область )))
    }
    public Region getRegion (int index){ //вернуть области из коллекции по индексу
        return regions.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(title, country.title) &&
                Objects.equals(regions, country.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, regions);
    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", regions=" + regions +
                '}';
    }
}
