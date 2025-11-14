import java.util.Scanner;

public class mainmenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        signup signup = new signup(input);
        login login = new login(input);
        search search = new search(input);

        user currentUser = null;

        while (true) {
            if (currentUser == null) {
                System.out.println("\n==== Welcome To bookbarkadacollection ====");
                System.out.println("Kaibigan Handa ka na ba? Mag-sign up at simulan ang iyong book adventure!");
                System.out.println("1. Sign Up");
                System.out.println("2. Log In");
                System.out.print("Choose an option: ");

                int choice;
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                switch (choice) {
                    case 1 -> signup.signUp();
                    case 2 -> {
                        currentUser = login.logIn();
                        if (currentUser != null) {
                            
                            Homepage.show(currentUser, search, input);
                            currentUser = null;
                        }
                    }
                    
                    
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
