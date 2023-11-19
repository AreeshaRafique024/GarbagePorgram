public class House {
    String houseOwner;
    String houseNo;
    WasteCategory wasteCategory;

    public House(String houseOwner, String houseNo, WasteCategory wasteCategory) {
        this.houseOwner = houseOwner;
        this.houseNo = houseNo;
        this.wasteCategory = wasteCategory;
    }

    public String getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(String houseOwner) {
        this.houseOwner = houseOwner;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public WasteCategory getWasteCategory() {
        return wasteCategory;
    }

    public void setWasteCategory(WasteCategory wasteCategory) {
        this.wasteCategory = wasteCategory;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseOwner='" + houseOwner + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", wasteCategory=" + wasteCategory +
                '}';
    }
}
