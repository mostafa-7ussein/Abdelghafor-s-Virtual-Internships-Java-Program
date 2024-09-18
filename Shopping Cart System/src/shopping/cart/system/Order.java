
package shopping.cart.system;

import java.util.List;

public class Order {
    private User user;
    private List<Product> products;
    private List<Integer> quantities;
    private String paymentStatus;
    private String shippingDetails;

    public Order(User user, List<Product> products, List<Integer> quantities, String paymentStatus, String shippingDetails) {
        this.user = user;
        this.products = products;
        this.quantities = quantities;
        this.paymentStatus = paymentStatus;
        this.shippingDetails = shippingDetails;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getShippingDetails() {
        return shippingDetails;
    }
    
    
    
    
    

    
    
}
