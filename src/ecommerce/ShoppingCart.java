package ecommerce;

public class ShoppingCart {
    private String quantity = ("9");
    private String totalPrice = ("NGN9000");
    private String cart = ("Items added");

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void updateCart(String cart) {
        this.cart = cart;
    }

    public String getUpdateCart() {
        return cart;
    }
}
