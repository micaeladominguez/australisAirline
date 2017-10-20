/**
 * Author: micaeladominguez
 * Date: 17/10/17
 */
public class Ticket {

    private final double balance;
    private final String ticketNumber;

    Ticket(String ticketNumber) {
        balance = 0;
        this.ticketNumber = ticketNumber;
    }

    double getBalance() {
        return balance;
    }
    String getTicketNumber() {
        return ticketNumber;
    }
}
