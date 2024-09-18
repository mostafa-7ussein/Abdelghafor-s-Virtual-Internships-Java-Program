
package shopping.cart.system;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<Product> products;
    private List<Integer> quantities;
    
    
    
     public Cart() {
        this.products = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }
    public void additem(Product product, int quantity){
        int index = products.indexOf(product);
        if (index >= 0) {
            quantities.set(index, quantities.get(index) + quantity);
        } else {
            products.add(product);
            quantities.add(quantity);
        }
    } 
    
    public void removeitem(Product product){
        int index = products.indexOf(product);
        if (index >= 0) {
            products.remove(index);
            quantities.remove(index);
        }
    }
    
    public void  updateQuantity(Product product, int quantity){
        int index = products.indexOf(product);
        if (index >= 0) {
            quantities.set(index, quantity);
        }
    }
    
    public double calculateTotal(){
       double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice() * quantities.get(i);
        }
        return total; 
    }
}
