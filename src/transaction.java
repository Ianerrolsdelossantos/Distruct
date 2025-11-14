import java.util.Scanner;

public class transaction {

    public static void checkout(user user, Scanner input) {
        if (user.getCart().isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("\n=== CHECKOUT ===");
        double total = 0;

        for (book b : user.getaddtoCart()) {
            System.out.println("- " + b);
            total += b.getPrice();
        }

        System.out.println("TOTAL: ₱" + total);

       
        String paymentMethod = "";
        while (true) {
            System.out.print("Choose payment method (1. Gcash, 2. Cash on Delivery): ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                paymentMethod = "Gcash";
                break;
            } else if (choice.equals("2")) {
                paymentMethod = "Cash on Delivery";
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

        
        System.out.print("Confirm purchase? (y/n): ");
        String confirm = input.nextLine().toLowerCase();

        if (confirm.equals("y")) {
            user.getPurchases().addAll(user.getCart());
            user.getCart().clear();
            System.out.println("Purchase successful using " + paymentMethod + "! Thank you!");
        } else {
            System.out.println("Purchase canceled.");
        }
    }
}
