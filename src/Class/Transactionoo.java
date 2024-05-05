package Class;

public class Transactionoo {
    private String username;
    private String price;
    private String time;

    public Transactionoo(String username, String price, String time) {
        this.username = username;
        this.price = price;
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
