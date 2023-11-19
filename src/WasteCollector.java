import java.util.ArrayList;
import java.util.Objects;

public class WasteCollector {
    String name;
    String VehicleNo;
    double monthlyPay;
    double dailyFuelExpense;
    House house;


    public WasteCollector(String name,double dailyFuelExpense, String vehicleNo, double monthlyPay, House house) {
        this.name = name;
        this.VehicleNo = vehicleNo;
        this.monthlyPay = monthlyPay;
        this.house = house;
        this.dailyFuelExpense=dailyFuelExpense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleNo() {
        return VehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        VehicleNo = vehicleNo;
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public double getDailyFuelExpense() {
        return dailyFuelExpense;
    }

    public void setDailyFuelExpense(double dailyFuelExpense) {
        this.dailyFuelExpense = dailyFuelExpense;
    }

    @Override
    public boolean equals(Object o) {
        return this.equals(o);
    }


    @Override
    public String toString() {
        return "WasteCollector{" +
                "name='" + name + '\'' +
                ", VehicleNo='" + VehicleNo + '\'' +
                ", monthlyPay=" + monthlyPay +
                ", dailyFuelExpense=" + dailyFuelExpense +
                ", house=" + house +
                '}';
    }


}