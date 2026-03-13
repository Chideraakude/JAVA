import java.util.Scanner;

public class TicketSystem {
    private User[] users = new User[10];
    private Event[] events = new Event[3];
    private int userCount = 0;
    private User loggedInUser;
    private Scanner input = new Scanner(System.in);

    public TicketSystem() {
        events[0] = new Event("Rock Night", 5000, 50);
        events[1] = new Event("Jazz Evening", 4000, 40);
        events[2] = new Event("Afrobeats Live", 6000, 60);
    }

    public void signUp() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        users[userCount++] = new User(username, password);
        System.out.println("Registration successful.");
    }

    public void login() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        for (int count = 0; count < userCount; count++) {
            if (users[count].login(username, password)) {
                loggedInUser = users[count];
                System.out.println("Login successful.");
                return;
            }
        }
        System.out.println("Invalid login details.");
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n1. View Events");
            System.out.println("2. Buy Tickets");
            System.out.println("3. Ticket Statistics");
            System.out.println("4. Wallet");
            System.out.println("5. Logout");
            System.out.print("Choose option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> viewEvents();
                case 2 -> buyTickets();
                case 3 -> showStatistics();
                case 4 -> walletMenu();
                case 5 -> loggedInUser = null;
            }
        } while (loggedInUser != null);
    }

    private void viewEvents() {
        for (int count = 0; count < events.length; count++) {
            System.out.println((count + 1) + ". " + events[count].getName()
                    + " | Tickets: " + events[count].getTicketsAvailable()
                    + " | Price: ₦" + events[count].getTicketPrice());
        }
    }

    private void buyTickets() {
        viewEvents();
        System.out.print("Select event: ");
        int eventOne = input.nextInt() - 1;

        System.out.print("Number of tickets: ");
        int qty = input.nextInt();

        double cost = qty * events[eventOne].getTicketPrice();

        if (loggedInUser.getWallet().deductMoney(cost)
                && events[eventOne].sellTickets(qty)) {
            System.out.println("Ticket purchase successful.");
        } else {
            System.out.println("Purchase failed.");
        }
    }

    private void showStatistics() {
        for (Event e : events) {
            System.out.println(e.getName());
            System.out.println("Sold: " + e.getTicketsSold());
            System.out.println("Available: " + e.getTicketsAvailable());
        }
    }

    private void walletMenu() {
        System.out.println("Balance: ₦" + loggedInUser.getWallet().getBalance());
        System.out.print("Enter amount to add: ");
        double amount = input.nextDouble();
        loggedInUser.getWallet().addMoney(amount);
        System.out.println("Wallet updated.");
    }
}
