package by.epam.unit04.voucher.entity;

import by.epam.unit04.voucher.enums.Food;
import by.epam.unit04.voucher.enums.SeasonOfTour;
import by.epam.unit04.voucher.enums.Transport;
import by.epam.unit04.voucher.enums.TypeOfTour;

import java.util.Objects;

public class Voucher  implements Comparable<Voucher>{

    private Food food;        //тип еды
    private Transport transport;    //тип транспорта
    private TypeOfTour typeOfTour;  //тип тура
    private SeasonOfTour seasonOfTour;  //сезон тура
    private int costOfTour;    // стоимoсть тура
    private int tourDuration;  //продолжительность тура

    public Voucher(Food food, Transport transport, TypeOfTour typeOfTour,SeasonOfTour seasonOfTour,
                   int costOfTour, int tourDuration) {
        this.food = food;
        this.transport = transport;
        this.typeOfTour = typeOfTour;
        this.seasonOfTour = seasonOfTour;
        this.costOfTour = costOfTour;
        this.tourDuration = tourDuration;
    }

    public Voucher() {  //"пустая путевка, будет исспользоваться как результат не найден, чтоб null не возвращать "
         this(Food.NO_FOOD, Transport.NO_TRANSPORT, TypeOfTour.NO_TOUR,SeasonOfTour.NO_SEASON,0,0);
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public TypeOfTour getTypeOfTour() {
        return typeOfTour;
    }

    public void setTypeOfTour(TypeOfTour typeOfTour) {
        this.typeOfTour = typeOfTour;
    }

    public SeasonOfTour getSeasonOfTour() {
        return seasonOfTour;
    }

    public void setSeasonOfTour(SeasonOfTour seasonOfTour) {
        this.seasonOfTour = seasonOfTour;
    }

    public int getCostOfTour() {
        return costOfTour;
    }

    public void setCostOfTour(int costOfTour) {
        this.costOfTour = costOfTour;
    }

    public int getTourDuration() {
        return tourDuration;
    }

    public void setTourDuration(int tourDuration) {
        this.tourDuration = tourDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return costOfTour == voucher.costOfTour &&
                tourDuration == voucher.tourDuration &&
                food == voucher.food &&
                transport == voucher.transport &&
                typeOfTour == voucher.typeOfTour &&
                seasonOfTour == voucher.seasonOfTour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, transport, typeOfTour, seasonOfTour, costOfTour, tourDuration);
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "food=" + food +
                ", transport=" + transport +
                ", typeOfTour=" + typeOfTour +
                ", seasonOfTour=" + seasonOfTour +
                ", costOfTour=" + costOfTour +
                ", tourDuration=" + tourDuration +
                '}' + "\n";
    }

    @Override
    public int compareTo(Voucher o) {
        return this.getCostOfTour() - o.getCostOfTour();
    }
}
