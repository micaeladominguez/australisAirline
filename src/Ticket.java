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

/*
yo creo que el sistema tiene que tener una lista de comprobantes para contabilizar ganancias, y saber que venden, etc
 */
