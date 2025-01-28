package Main.singly_linked_list.inventory_management_system;


class InventoryManagement {
    private Item head;

    // Add an item at the beginning
    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add an item at the end
    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add an item at a specific position
    public void addItemAtPosition(int position, String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (position == 0 || head == null) {
            addItemAtBeginning(itemName, itemId, quantity, price);
            return;
        }

        Item temp = head;
        for (int i = 1; i < position && temp.next != null; i++) {
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove an item by Item ID
    public void removeItemById(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    // Update the quantity of an item by Item ID
    public void updateQuantityById(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search for an item by Item ID
    public void searchItemById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Item Found: " + temp.itemName + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search for an item by Item Name
    public void searchItemByName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item Found: ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Calculate total value of inventory
    public void calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    // Sort inventory by Item Name
    public void sortByName() {
        head = mergeSort(head, "name");
    }

    // Sort inventory by Price
    public void sortByPrice() {
        head = mergeSort(head, "price");
    }

    // Merge sort implementation
    private Item mergeSort(Item head, String criterion) {
        if (head == null || head.next == null) {
            return head;
        }

        Item middle = getMiddle(head);
        Item nextToMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, criterion);
        Item right = mergeSort(nextToMiddle, criterion);

        return merge(left, right, criterion);
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Item merge(Item left, Item right, String criterion) {
        if (left == null) return right;
        if (right == null) return left;

        if ((criterion.equals("name") && left.itemName.compareToIgnoreCase(right.itemName) <= 0)
                || (criterion.equals("price") && left.price <= right.price)) {
            left.next = merge(left.next, right, criterion);
            return left;
        } else {
            right.next = merge(left, right.next, criterion);
            return right;
        }
    }

    // Display all items in the inventory
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Item temp = head;
        while (temp != null) {
            System.out.println("Item ID: " + temp.itemId + ", Name: " + temp.itemName +
                    ", Quantity: " + temp.quantity + ", Price: $" + temp.price);
            temp = temp.next;
        }
    }
}
