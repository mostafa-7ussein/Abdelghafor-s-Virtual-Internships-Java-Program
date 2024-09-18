
package shopping.cart.system;

public class User {
    private String UserName;
    private String email ;
    private Cart cart;

    public User(String UserName, String email, String addres, Cart cart) {
        this.UserName = UserName;
        this.email = email;
        this.cart = cart;
    }

   
    public Cart getCart() {
        return cart;
    }
   

    
    public String getUserName() {
        return UserName;
    }

   

    public String getEmail() {
        return email;
    }

    
    
    
    
}
