package Main.singly_linked_list.inventory_management_system;

public class Main {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        // Adding items
        inventory.addItemAtBeginning("Item A", 1, 5, 10.0);
        inventory.addItemAtEnd("Item B", 2, 3, 15.0);
        inventory.addItemAtEnd("Item C", 3, 10, 8.0);

        // Display inventory
        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        // Update quantity
        inventory.updateQuantityById(2, 5);

        // Search for items
        inventory.searchItemById(1);
        inventory.searchItemByName("Item C");

        // Remove an item
        inventory.removeItemById(3);

        // Calculate total value
        inventory.calculateTotalValue();

        // Sort inventory by name
        inventory.sortByName();
        System.out.println("Inventory sorted by name:");
        inventory.displayInventory();

        // Sort inventory by price
        inventory.sortByPrice();
        System.out.println("Inventory sorted by price:");
        inventory.displayInventory();
    }
}
