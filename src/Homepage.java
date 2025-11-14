import java.util.Scanner;

public class Homepage {

    public static void show(user currentUser, search search, Scanner input) {
        while (true) {
            System.out.println("\n==== Bookbarkada ====");
            System.out.println("Your Personal Book Collection");
            System.out.println("Welcome, " + currentUser.getName() + "!");
            System.out.println("1. Search");
            System.out.println("2. View Cart / Checkout");
            System.out.println("3. Wishlist");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> search.searchBooks(currentUser); 
                case 2 -> transaction.checkout(currentUser, input); 
                case 3 -> System.out.println("Wishlist feature coming soon!");
                case 4 -> {
                    System.out.println("Logging out...");
                    return; 
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
