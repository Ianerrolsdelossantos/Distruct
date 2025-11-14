import java.util.ArrayList;

public class addtocart {
    private ArrayList<book> items = new ArrayList<>();

    public void add(book book) {
        items.add(book);
        System.out.println(book.getTitle() + " added to cart.");
    }

    public void remove(book book) {
        items.remove(book);
    }

    public ArrayList<book> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double getTotal() {
        double total = 0;
        for (book b : items) total += b.getPrice();
        return total;
    }

    public void clear() {
        items.clear();
    }
}
