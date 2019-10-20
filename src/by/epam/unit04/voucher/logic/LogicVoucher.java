package by.epam.unit04.voucher.logic;

import by.epam.unit04.voucher.entity.TourAgency;
import by.epam.unit04.voucher.entity.Voucher;
import by.epam.unit04.voucher.enums.Food;
import by.epam.unit04.voucher.enums.SeasonOfTour;
import by.epam.unit04.voucher.enums.Transport;
import by.epam.unit04.voucher.enums.TypeOfTour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicVoucher {

    public List<Voucher> findVouchersByFood(TourAgency tourAgency, Food food) {
        List<Voucher> vouchersResult = new ArrayList<>();
        for (Voucher v : tourAgency.getVouchers()) {
            if (v.getFood() == food) {
                vouchersResult.add(v);
            }
        }
        return vouchersResult;
    }
    public List<Voucher> findVouchersByTypeOfTour(TourAgency tourAgency, SeasonOfTour seasonOfTour) {
        List<Voucher> vouchersResult = new ArrayList<>();
        for (Voucher v : tourAgency.getVouchers()) {
            if (v.getSeasonOfTour() == seasonOfTour) {
                vouchersResult.add(v);
            }
        }
        return vouchersResult;
    }
    public List<Voucher> findVouchersByTransport(TourAgency tourAgency, Transport transport) {
        List<Voucher> vouchersResult = new ArrayList<>();
        for (Voucher v : tourAgency.getVouchers()) {
            if (v.getTransport() == transport) {
                vouchersResult.add(v);
            }
        }
        return vouchersResult;
    }

    public List<Voucher> findVouchersByTypeOfTour(TourAgency tourAgency, TypeOfTour typeOfTour) {
        List<Voucher> vouchersResult = new ArrayList<>();
        for (Voucher v : tourAgency.getVouchers()) {
            if (v.getTypeOfTour() == typeOfTour) {
                vouchersResult.add(v);
            }
        }
        return vouchersResult;
    }
    public List<Voucher> findVouchersByCostOfTour(TourAgency tourAgency, int cost) { //будем возвращать путевки которые не выше заявленной цены в методе
        List<Voucher> vouchersResult = new ArrayList<>();
        for (Voucher v : tourAgency.getVouchers()) {
            if (v.getCostOfTour() <= cost) {
                vouchersResult.add(v);
            }
        }
        return vouchersResult;
    }
    public List<Voucher> findVouchersByTourDuration(TourAgency tourAgency, int durationOfTour) { //будем возвращать путевки которые не выше заявленной цены в методе
        List<Voucher> vouchersResult = new ArrayList<>();
        for (Voucher v : tourAgency.getVouchers()) {
            if (v.getTourDuration() <= durationOfTour) {
                vouchersResult.add(v);
            }
        }
        return vouchersResult;
    }

    public List<Voucher> findByAllParameter (TourAgency tourAgency, Food food, Transport transport,
                                             TypeOfTour typeOfTour,SeasonOfTour seasonOfTour,
                                             int cost, int durationOfTour ){
        List<Voucher> vouchersResult = new ArrayList<>();
        for (Voucher v : tourAgency.getVouchers()) {
            if (v.getSeasonOfTour() == seasonOfTour &&
                    v.getFood() == food &&
                    v.getTransport() == transport &&
                    v.getTypeOfTour() == typeOfTour &&
                    v.getCostOfTour()<=cost &&
                    v.getTourDuration()<=durationOfTour) {
                vouchersResult.add(v);
            }
        }
        return vouchersResult;
    }
    public void sortByCost (TourAgency tourAgency){
        Collections.sort(tourAgency.getVouchers());
    }

}