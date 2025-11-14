import java.util.ArrayList;

public class wishlist {
    private ArrayList<book> items = new ArrayList<>();

    public void add(book book) {
        items.add(book);
        System.out.println(book.getTitle() + " added to wishlist.");
    }

    public void remove(book book) {
        items.remove(book);
    }

    public ArrayList<book> getItems() {
        return items;
    }
}