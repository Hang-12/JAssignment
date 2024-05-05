package Class;

public class Orderoo {
    private String customerid;
    private String vendorname;
    private String food;
    private String price;
    private String quantity;
    private String date;
    private String status;
    private String dtd;
    private String address;
    private String runner;

    public Orderoo(String customerid, String vendorname, String food, String price, String quantity, String date, String status, String dtd, String address, String runner) {
        this.customerid = customerid;
        this.vendorname = vendorname;
        this.food = food;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.status = status;
        this.dtd = dtd;
        this.address = address;
        this.runner = runner;
    }

    public String getRunner() {
        return runner;
    }

    public void setRunner(String runner) {
        this.runner = runner;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDtd() {
        return dtd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDtd(String dtd) {
        this.dtd = dtd;
    }
}
