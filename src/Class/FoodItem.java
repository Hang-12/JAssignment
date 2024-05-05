package Class;

import java.io.Serializable;

public class FoodItem {
    private String vendorname;
    private String foodName;
    private String category;
    private String price;

    public FoodItem(String vendorname,String foodName, String category, String price) {
        this.vendorname = vendorname;
        this.foodName = foodName;
        this.category = category;
        this.price = price;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return foodName + "," + category + "," + price;
    }

}
