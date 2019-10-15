package by.epam.unit04.country;

import by.epam.unit04.country.entity.City;
import by.epam.unit04.country.entity.Country;
import by.epam.unit04.country.entity.District;
import by.epam.unit04.country.entity.Region;
import by.epam.unit04.country.logicCountry.LogicCountry;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private void printCityTitle(City city) {
        System.out.println(city.getTitle());
    }

    private void printCollection(List<City> cities) {
        for (City city : cities) {
            if (city.isRegionalCenter()) {
                System.out.println(city.getTitle());
            }
        }
    }
    public static void main(String[] args) {

        City minsk = new City("Минск",true, true,208787);
        City brest = new City("Брест",false, true,42037);
        City grodno = new City("Гродно",false, true,49987);
        City gomel = new City("Гомель",false, true,68210);
        City vitebsk = new City("Витебск",false, true,37206);
        City mogilev = new City("Могилёв",false, true,40130);


        List<City> minskList = new ArrayList<>();
        minskList.add(minsk);

        List<City> brestkList = new ArrayList<>();
        minskList.add(brest);

        List<City> grodnokList = new ArrayList<>();
        minskList.add(grodno);

        List<City> gomelkList = new ArrayList<>();
        minskList.add(gomel);

        List<City> vitebskList = new ArrayList<>();
        minskList.add(vitebsk);

        List<City> mogilevkList = new ArrayList<>();
        minskList.add(mogilev);

        District minskDistrict = new District("Минский", minskList);
        List<District> minskD = new ArrayList<>();
        minskD.add(minskDistrict);

        District brestDistrict = new District("Брестский район", brestkList);
        List<District> brestD = new ArrayList<>();
        brestD.add(brestDistrict);

        District grodnoDistrict = new District("Гродненский район", grodnokList);
        List<District> grodnoD = new ArrayList<>();
        grodnoD.add(grodnoDistrict);

        District gomelDistrict = new District("Гомельский район", gomelkList);
        List<District> gomelD = new ArrayList<>();
        gomelD.add(gomelDistrict);

        District vitebskDistrict = new District("Витебский район", vitebskList);
        List<District> vitebskD = new ArrayList<>();
        vitebskD.add(vitebskDistrict);

        District mogilevDistrict = new District("Могилевский район", mogilevkList);
        List<District> mogilevD = new ArrayList<>();
        mogilevD.add(mogilevDistrict);

        Region minskRegion = new Region("Минская область",1902,minskD);
        Region brestRegion = new Region("Брестская область",1540,brestD);
        Region grodnoRegion = new Region("Гродненская область",2594,grodnoD);
        Region gomelRegion = new Region("Гомельская область",1951,gomelD);
        Region vitebskRegion = new Region("Витебская область",2705,vitebskD);
        Region mogolevRegion = new Region("Могилевская область",1895,mogilevD);

        List<Region> regions = new ArrayList<>();
        regions.add(minskRegion);
        regions.add(brestRegion);
        regions.add(grodnoRegion);
        regions.add(gomelRegion);
        regions.add(vitebskRegion);
        regions.add(mogolevRegion);

        Country belarus = new Country("Республика Беларусь", regions);
        LogicCountry logicCountry = new LogicCountry();

        Main main = new Main();

        main.printCityTitle(logicCountry.findCapitalOfCountry(belarus));
        System.out.println(logicCountry.countRegionsInCountry(belarus));
        System.out.println(logicCountry.squareOfCountry(belarus));
        main.printCollection(logicCountry.findRegionCenter(belarus));











    }
}