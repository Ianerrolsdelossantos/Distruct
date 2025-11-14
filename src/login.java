import java.util.Scanner;

public class login {
    private Scanner input;

    public login(Scanner input) {
        this.input = input;
    }

    public user logIn() {
        System.out.println("=== LOG IN ===");
        System.out.print("Email: ");
        String email = input.nextLine();

        if (!userdatabase.userDatabase.containsKey(email)) {
            System.out.println("Email not found. Please sign up first.");
            return null;
        }

        System.out.print("Password: ");
        String password = input.nextLine();

        user user = userdatabase.userDatabase.get(email);

        if (user.getPassword().equals(password)) {
            System.out.println("Login successful! Welcome, " + user.getName() + ".");
            return user;
        } else {
            System.out.println("Incorrect password. Please try again.");
            return null;
        }
    }
}
