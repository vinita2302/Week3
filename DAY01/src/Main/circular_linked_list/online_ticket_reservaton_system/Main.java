package Main.circular_linked_list.online_ticket_reservaton_system;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Add tickets
        system.addTicket(1, "Alice", "Avatar 2", "A1", "10:00 AM");
        system.addTicket(2, "Bob", "Avatar 2", "A2", "10:00 AM");
        system.addTicket(3, "Charlie", "Inception", "B1", "12:00 PM");

        // Display tickets
        system.displayTickets();

        // Search for a ticket
        System.out.println("Searching for tickets:");
        system.searchTicket("Avatar 2");
        system.searchTicket("Alice");

        // Remove a ticket
        System.out.println("Removing a ticket:");
        system.removeTicket(2);

        // Display tickets after removal
        system.displayTickets();

        // Total tickets
        System.out.println("Total tickets booked: " + system.getTotalTickets());
    }
}
