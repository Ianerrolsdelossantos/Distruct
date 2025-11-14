import java.util.Scanner;

public class search {
    private Scanner input;

    public search(Scanner input) {
        this.input = input;
    }

    
    public void searchBooks(user currentUser) {
        while (true) {
            System.out.println("\n=== SEARCH MENU ===");
            System.out.println("1. Book Name");
            System.out.println("2. Author");
            System.out.println("3. Book Category");
            System.out.println("4. Back");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> searchByTitle(currentUser);
                case 2 -> searchByAuthor(currentUser);
                case 3 -> searchByCategory(currentUser);
                case 4 -> { return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

   
    private void showBookActions(user user, book book) {
        System.out.println("\nFound: " + book);
        System.out.println("1. Add to Cart");
        System.out.println("2. Add to Wishlist");
        System.out.println("3. Back");
        System.out.print("Choose: ");

        int choice = Integer.parseInt(input.nextLine());

        switch (choice) {
            case 1 -> {
                user.getCart().add(book);
                System.out.println("Added to Cart.");
            }
            case 2 -> {
                user.getWishlist().add(book);
                System.out.println("Added to Wishlist.");
            }
            case 3 -> {}
            default -> System.out.println("Invalid choice.");
        }
    }

   
    private void searchByTitle(user user) {
        System.out.print("Enter book title: ");
        String title = input.nextLine().toLowerCase();

        for (book b : bookcategory.books) {
            if (b.getTitle().toLowerCase().contains(title)) {
                showBookActions(user, b);
                return;
            }
        }
        System.out.println("No matching title found.");
    }

    private void searchByAuthor(user user) {
        System.out.print("Enter author: ");
        String author = input.nextLine().toLowerCase();

        for (book b : bookcategory.books) {
            if (b.getAuthor().toLowerCase().contains(author)) {
                showBookActions(user, b);
                return;
            }
        }
        System.out.println("No matching author found.");
    }

   
    private void searchByCategory(user user) {
        System.out.print("Enter category: ");
        String category = input.nextLine().toLowerCase();

        for (book b : bookcategory.books) {
            if (b.getCategory().toLowerCase().contains(category)) {
                showBookActions(user, b);
                return;
            }
        }
        System.out.println("No matching category found.");
    }
}
