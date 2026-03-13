public class Event {
    private String name;
    private double ticketPrice;
    private int ticketsAvailable;
    private int ticketsSold;

    public Event(String name, double price, int tickets) {
        this.name = name;
        this.ticketPrice = price;
        this.ticketsAvailable = tickets;
        this.ticketsSold = 0;
    }

    public boolean sellTickets(int quantity) {
        if (quantity <= ticketsAvailable) {
            ticketsAvailable -= quantity;
            ticketsSold += quantity;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
