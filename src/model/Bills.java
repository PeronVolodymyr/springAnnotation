package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 3/15/18.
 */
public class Bills {
    private List<Bill> bills = new ArrayList<>();


    public Bills(List<Bill> bills) {
        this.bills = bills;
    }

    public Bills() {
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public String toString() {
        return "Bills{" +
                "bills=" + bills +
                '}';
    }
}
