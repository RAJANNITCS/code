package corejava;

class TicketBooking {
    private int availableTickets = 20;

    // Synchronized method to ensure only one thread can book a ticket at a time
    public synchronized void bookTicket(String customerName, int numberOfTickets) {
        if (availableTickets >= numberOfTickets) {
            System.out.println(customerName + " booked " + numberOfTickets + " tickets.");
            availableTickets -= numberOfTickets;
        } else {
            System.out.println("Not enough tickets available for " + customerName);
        }
    }

}

class CustomerThread extends Thread {
    private TicketBooking booking;
    private String customerName;
    private int numberOfTickets;

    public CustomerThread(TicketBooking booking, String customerName, int numberOfTickets) {
        this.booking = booking;
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        booking.bookTicket(customerName, numberOfTickets);
    }
}

public class BookMyShow {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        CustomerThread t1 = new CustomerThread(booking, "Alice", 2);
        CustomerThread t2 = new CustomerThread(booking, "Bob", 3);
        CustomerThread t3 = new CustomerThread(booking, "Charlie", 1);

        t1.start();
        t2.start();
        t3.start();
    }
}
