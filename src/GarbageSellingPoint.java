import java.util.ArrayList;

public class GarbageSellingPoint extends WasteCategory {

    WasteCollector[] wasteCollectors;

    public void display() {
        for (WasteCollector wasteCollector : wasteCollectors) {
            System.out.println(wasteCollectors);
        }
    }
    public void separation_of_RecycleAbleWaste(WasteCollector[] wasteCollectors) {
        for (WasteCollector wasteCollector1 : wasteCollectors) {
            wasteCollector1.house.wasteCategory.nonRecycleAbleWastes = null;
        }
    }

    public double RecycleAble_Waste_Profit() {
        double Total = 0;
        double paper_price_perKG = 20;
        double leather_price_perKG = 50;
        double cardboard_price_perKG = 25;
        double steel_price_perKG = 40;
        double plastic_price_perKG = 35;
        double clothes_price_perKG = 100;
        double wood_price_perKG = 70;


        if (recycleAbleWastes.equals(RecycleAble_Waste.PAPER)) {
            Total = paper_price_perKG * weight;
        }
        if (recycleAbleWastes.equals(RecycleAble_Waste.LEATHER)) {
            Total = leather_price_perKG * weight;
        }
        if (recycleAbleWastes.equals(RecycleAble_Waste.CARD_BOARD)) {
            Total = cardboard_price_perKG * weight;
        }
        if (recycleAbleWastes.equals(RecycleAble_Waste.STEEL)) {
            Total = steel_price_perKG * weight;
        }
        if (recycleAbleWastes.equals(RecycleAble_Waste.PLASTIC)) {
            Total = plastic_price_perKG * weight;
        }
        if (recycleAbleWastes.equals(RecycleAble_Waste.CLOTHES)) {
            Total = clothes_price_perKG * weight;
        }
        if (recycleAbleWastes.equals(RecycleAble_Waste.WOOD)) {
            Total = wood_price_perKG * weight;
        }
        return Total;
    }

    public void total_monthly_income(WasteCollector[] wasteCollectors)throws Exception {
        double total=0;
        for (WasteCollector wasteCollector1 : wasteCollectors) {
            total +=( wasteCollector1.monthlyPay - (wasteCollector1.dailyFuelExpense * 30) + (RecycleAble_Waste_Profit() * 30));
            System.out.printf("The Total monthly income after receiving pay & sell products is %.2f ", total);
        }
    }

}
