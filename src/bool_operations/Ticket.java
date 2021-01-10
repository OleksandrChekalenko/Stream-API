package bool_operations;

public class Ticket {

    private String ticketClass;
    private int price;

    public Ticket(String ticketClass, int price) {
        this.ticketClass = ticketClass;
        this.price = price;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int compare(Ticket t1, Ticket t2) {
        return t1.getPrice() > t2.getPrice() ? 1 : -1;
    }
}
