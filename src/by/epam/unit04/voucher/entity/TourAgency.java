package by.epam.unit04.voucher.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TourAgency {

    private String title; //название агенства
    private List<Voucher> vouchers;

    public TourAgency(String title, List<Voucher> vouchers) {
        this.title = title;
        this.vouchers = vouchers;
    }

    public TourAgency() {
        this("no title", new ArrayList<>());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }
    public void addVoucher (Voucher voucher){
        this.vouchers.add(voucher);
    }
    public void  addVoucher(int index, Voucher voucher){
        this.vouchers.add(index,voucher);
    }
    public Voucher getVoucher (Voucher voucher){
        for (Voucher v: this.vouchers){
            if (voucher.equals(v)){
                return voucher;
            }
        }return new Voucher();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourAgency that = (TourAgency) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(vouchers, that.vouchers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, vouchers);
    }

    @Override
    public String toString() {
        return "TourAgency{" +
                "title='" + title + '\'' +
                ", vouchers=" + vouchers +
                '}' + "\n";
    }
}
