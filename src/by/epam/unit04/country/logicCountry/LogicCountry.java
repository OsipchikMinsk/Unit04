package by.epam.unit04.country.logicCountry;

import by.epam.unit04.country.entity.City;
import by.epam.unit04.country.entity.Country;
import by.epam.unit04.country.entity.District;
import by.epam.unit04.country.entity.Region;

import java.util.ArrayList;
import java.util.List;


public class LogicCountry {


    public City findCapitalOfCountry (Country country) {  //вернуть столицу страны
        for (Region reg: country.getRegions()) {
            for (District dis: country.getRegion(reg).getDistricts()){
                for (City city : country.getRegion(reg).getDistrict(dis).getCities()){
                    if(city.isCapitalOfCountry()){
                        return city;
                    }
                }
            }
        } return new City();
    }
    public int countRegionsInCountry (Country country){
        return country.getRegions().size();
    }

    public int squareOfCountry (Country country){
        int square =0;
        for (Region region: country.getRegions()){
           square+=region.getArea();
        }
        return square;
    }

    public List<City> findRegionCenter(Country country) {
        List<City> regionalCenter = new ArrayList<>();
        for (Region reg : country.getRegions()) {
            for (District dis : country.getRegion(reg).getDistricts()) {
                for (City city : country.getRegion(reg).getDistrict(dis).getCities()) {
                    if (city.isRegionalCenter()) {
                        regionalCenter.add(city);

                    }
                }
            }

        }return regionalCenter;
    }


    /*public int countOfDistrictInCountry(Country country) {
        City[] cities = country.getCities();
        int countOfDistrict = 0;
        for (City city : cities) {
            if (city.getDistrict() != null) {
                countOfDistrict++;
            }
        }return countOfDistrict;
    }

    public int countOfCountryArea(Country country) {
        City[] cities = country.getCities();
        int areaOfCountry = 0;
        for (City city : cities) {
            areaOfCountry += city.getRegionSquare();
        }
        return areaOfCountry;
    }
    public City [] findRegionCenter(Country country) {
        City[] cities = country.getCities();
        int countOfRegionCenter =0;
        for (City city : cities) {
            if (city.isAreaCenter()) {
               countOfRegionCenter++;
            }
        }
        if (countOfRegionCenter==0){
            return new City [0];
        }
        City[] regionCityCenter = new City[countOfRegionCenter];
        for (int i=0;i<cities.length;i++){
            if (cities[i].isAreaCenter())
                regionCityCenter[i] = cities[i];
        }
        return regionCityCenter;
    }
*/


    }