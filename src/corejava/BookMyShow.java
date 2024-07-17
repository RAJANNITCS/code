package DeadlockExample;

class TicketBooking {
    private static int availableTickets = 20;

    // Synchronized static method to ensure only one thread can book a ticket at a time
    public static synchronized void bookTicket(String customerName, int numberOfTickets) {
        if (TicketBooking.availableTickets >= numberOfTickets) {
            System.out.println(customerName + " booked " + numberOfTickets + " tickets.");
            TicketBooking.availableTickets -= numberOfTickets;
        } else {
            System.out.println("Not enough tickets available for " + customerName);
        }
    }
}

class CustomerThread extends Thread {
    private String customerName;
    private int numberOfTickets;

    public CustomerThread(String customerName, int numberOfTickets) {
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        TicketBooking.bookTicket(customerName, numberOfTickets);
    }
}

class GroupCustomerThread extends Thread {
    private String groupName;
    private int numberOfTickets;

    public GroupCustomerThread(String groupName, int numberOfTickets) {
        this.groupName = groupName;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        TicketBooking.bookTicket(groupName, numberOfTickets);
    }
}

public class BookMyShow {
    public static void main(String[] args) {
        CustomerThread t1 = new CustomerThread("Alice", 2);
        CustomerThread t2 = new CustomerThread("Bob", 3);
        GroupCustomerThread g1 = new GroupCustomerThread("Group 1", 10);

        t1.start();
        t2.start();
        g1.start();
    }
}
