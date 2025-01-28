package Main.circular_linked_list.online_ticket_reservaton_system;


class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;
    private int ticketCount = 0;

    // Add a new ticket reservation at the end
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newTicket;
            tail = newTicket;
            newTicket.next = head; // Circular link
        } else {
            tail.next = newTicket;
            newTicket.next = head;
            tail = newTicket;
        }
        ticketCount++;
        System.out.println("Ticket reserved successfully for " + customerName + "!");
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets available to remove.");
            return;
        }

        Ticket current = head;
        Ticket prev = null;

        // Search for the ticket to remove
        do {
            if (current.ticketId == ticketId) {
                if (current == head) { // Removing the head node
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) { // Removing the tail node
                    tail = prev;
                    tail.next = head;
                } else { // Removing a middle node
                    prev.next = current.next;
                }
                ticketCount--;
                System.out.println("Ticket with ID " + ticketId + " has been removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display the current tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket current = head;
        System.out.println("Current ticket reservations:");
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber +
                    ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets available to search.");
            return;
        }

        Ticket current = head;
        boolean found = false;

        do {
            if (current.customerName.equalsIgnoreCase(keyword) || current.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Found Ticket - ID: " + current.ticketId + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber +
                        ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for keyword: " + keyword);
        }
    }

    // Calculate the total number of booked tickets
    public int getTotalTickets() {
        return ticketCount;
    }
}

