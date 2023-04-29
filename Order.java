
package InventorySystem;


public class Order {
    
    private int orderID;
    private String productName;
    private int quantity;
    private double unitprice;
    private String date;

    public Order(int orderID, String productName, int quantity, double unitprice, String date) {
        setOrderID(orderID);
        setProductName(productName);
        setQuantity(quantity);
        setUnitprice(unitprice);
        setDate(date);
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public String getDate() {
        return date;
    }

   
}
