package by.epam.unit04.voucher;

        import by.epam.unit04.voucher.entity.TourAgency;
        import by.epam.unit04.voucher.entity.Voucher;
        import by.epam.unit04.voucher.enums.Food;
        import by.epam.unit04.voucher.enums.SeasonOfTour;
        import by.epam.unit04.voucher.enums.Transport;
        import by.epam.unit04.voucher.enums.TypeOfTour;
        import by.epam.unit04.voucher.logic.LogicVoucher;

        import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;

public class Main {

    void displayTour(TourAgency tourAgency) {
        List<Voucher> voucherList = tourAgency.getVouchers();
        Iterator<Voucher> iterator = voucherList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Voucher v1 = new Voucher(Food.BREAKFAST, Transport.BUS, TypeOfTour.GASTRO_TOUR, SeasonOfTour.AUTUMN, 500,
                6);
        Voucher v2 = new Voucher(Food.BREAKFAST_DINNER, Transport.PLANE, TypeOfTour.WEDDING_TOUR, SeasonOfTour.SUMMER, 1000,
                10);
        Voucher v3 = new Voucher(Food.ALL_INCLUSIVE, Transport.SHIP, TypeOfTour.CRUISE, SeasonOfTour.WINTER, 750,
                12);
        Voucher v4 = new Voucher(Food.ULTRA_ALL_INCLUSIVE, Transport.CAR, TypeOfTour.SHOPPING, SeasonOfTour.SPRING, 100,
                3);
        Voucher v5 = new Voucher();
        Voucher v6 = new Voucher(Food.BREAKFAST, Transport.TRAIN, TypeOfTour.EXCURSION, SeasonOfTour.SUMMER, 400,
                10);
        Voucher v7 = new Voucher(Food.BREAKFAST_DINNER, Transport.BUS, TypeOfTour.GASTRO_TOUR, SeasonOfTour.SPRING, 350,
                7);
        Voucher v8 = new Voucher(Food.ALL_INCLUSIVE, Transport.PLANE, TypeOfTour.SKI_RESORT, SeasonOfTour.SUMMER, 2000,
                8);
        Voucher v9 = new Voucher(Food.ULTRA_ALL_INCLUSIVE, Transport.SHIP, TypeOfTour.RECREATION, SeasonOfTour.AUTUMN, 600,
                9);
        Voucher v10 = new Voucher(Food.ULTRA_ALL_INCLUSIVE, Transport.BUS, TypeOfTour.RECREATION, SeasonOfTour.WINTER, 450,
                10);

        List<Voucher> vouchers = new ArrayList<>();
        vouchers.add(v1);
        vouchers.add(v2);
        vouchers.add(v3);
        vouchers.add(v4);
        vouchers.add(v5);
        vouchers.add(v6);
        vouchers.add(v7);
        vouchers.add(v8);
        vouchers.add(v9);
        vouchers.add(v10);

        TourAgency coral = new TourAgency("Coral", vouchers);
        LogicVoucher logicVoucher = new LogicVoucher();
        Main main = new Main();
        main.displayTour(coral);
        System.out.println(logicVoucher.findVouchersByTypeOfTour(coral, TypeOfTour.RECREATION));
        System.out.println(logicVoucher.findVouchersByFood(coral, Food.BREAKFAST));
        System.out.println(logicVoucher.findVouchersByCostOfTour(coral, 500));
        System.out.println(logicVoucher.findVouchersByTourDuration(coral, 10));
        System.out.println(logicVoucher.findVouchersByTransport(coral, Transport.PLANE));
        System.out.println(logicVoucher.findByAllParameter(coral, Food.BREAKFAST, Transport.SHIP, TypeOfTour.RECREATION,
                SeasonOfTour.SUMMER, 500, 6));
        logicVoucher.sortByCost(coral);
        main.displayTour(coral);


    }


}
