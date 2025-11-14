import java.util.ArrayList;

public class user {
    private String email;
    private String name;
    private String password;
    private String address;
    private String contact;

    private ArrayList<book> cart = new ArrayList<>();
    private ArrayList<book> wishlist = new ArrayList<>();
    private ArrayList<book> purchased = new ArrayList<>();

    public ArrayList<book> getaddtoCart() { return cart; }
    public ArrayList<book> getwishlist() { return wishlist; }
    public ArrayList<book> gettransaction() { return gettransaction(); }

    public user(String email, String name, String password, String address, String contact) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.address = address;
        this.contact = contact;
    }

    // Getters
    public String getEmail() { 
        return email; 
    }

    public String getName() { 
        return name; 
    }

    public String getPassword() { 
        return password; 
    }

    public String getAddress() { 
        return address; 
    }

    public String getContact() { 
        return contact; 
    }

    // Lists
    public ArrayList<book> getCart() { 
        return cart; 
    }

    public ArrayList<book> getWishlist() { 
        return wishlist; 
    }

    public ArrayList<book> getPurchases() { 
        return purchased; 
    }
}
