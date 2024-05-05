package Class;

public class reviewoo {

    private String customerid;
    private String vendorname;
    private String food;
    private String price;
    private String dtd;
    private String review;
    private String quantity;
    private String date;
    private String runner;

    public reviewoo(String customerid, String vendorname, String food, String price, String dtd, String review, String quantity, String date, String runner) {
        this.customerid = customerid;
        this.vendorname = vendorname;
        this.food = food;
        this.price = price;
        this.dtd = dtd;
        this.review = review;
        this.quantity = quantity;
        this.date = date;
        this.runner = runner;
    }

    public String getRunner() {
        return runner;
    }

    public void setRunner(String runner) {
        this.runner = runner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDtd() {
        return dtd;
    }

    public void setDtd(String dtd) {
        this.dtd = dtd;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
