/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Runner;

/**
 *
 * @author Zong Hang
 */
public class Review {
    private String customerID;
    private String date;
    private String reviewText;
    
    public Review(String customerID, String date, String reviewText) {
        this.customerID = customerID;
        this.date = date;
        this.reviewText = reviewText;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
    
    public String toString() {
        return "Review{" + "customerID='" + customerID + '\'' + ", date='" + date + '\'' + ", reviewText='" + reviewText + '\'' + '}';
    }
}