public class book {
    private String title;
    private String author;
    private String category;
    private double price;

    public book(String title, String author, String category, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return title + " by " + author + " | " + category + " | ₱" + price;
    }
}