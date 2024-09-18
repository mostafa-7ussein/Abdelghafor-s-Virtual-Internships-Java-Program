
package shopping.cart.system;

public class Product {
  private String name;
  private String  description ;
  private double price;
  private int stock_quantity;

    public Product(String name, String description, double price, int stock_quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock_quantity = stock_quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

  
  
}
