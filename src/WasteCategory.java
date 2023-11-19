import java.util.ArrayList;

public class WasteCategory {
    RecycleAble_Waste recycleAbleWastes;
    NonRecycleAble_Waste nonRecycleAbleWastes;
    double weight;
   public WasteCategory(){

   }

    public WasteCategory(RecycleAble_Waste recycleAbleWastes,double weight, NonRecycleAble_Waste nonRecycleAbleWastes) {
        this.recycleAbleWastes = recycleAbleWastes;
        this.nonRecycleAbleWastes = nonRecycleAbleWastes;
        this.weight=weight;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public RecycleAble_Waste getRecycleAbleWastes() {
        return recycleAbleWastes;
    }

    public void setRecycleAbleWastes(RecycleAble_Waste recycleAbleWastes) {
        this.recycleAbleWastes = recycleAbleWastes;
    }

    public NonRecycleAble_Waste getNonRecycleAbleWastes() {
        return nonRecycleAbleWastes;
    }

    public void setNonRecycleAbleWastes(NonRecycleAble_Waste nonRecycleAbleWastes) {
        this.nonRecycleAbleWastes = nonRecycleAbleWastes;
    }

    @Override
    public String toString() {
        return "WasteCategory{" +
                "recycleAbleWastes=" + recycleAbleWastes +
                ", nonRecycleAbleWastes=" + nonRecycleAbleWastes +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WasteCategory that)) return false;
        return Double.compare(getWeight(), that.getWeight()) == 0 && getRecycleAbleWastes() == that.getRecycleAbleWastes() && getNonRecycleAbleWastes() == that.getNonRecycleAbleWastes();
    }

}
