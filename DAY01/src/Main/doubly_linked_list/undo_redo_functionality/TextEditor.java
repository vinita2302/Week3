package Main.doubly_linked_list.undo_redo_functionality;

class TextEditor {
    private class TextNode {
        String textState;
        TextNode prev;
        TextNode next;

        public TextNode(String textState) {
            this.textState = textState;
            this.prev = null;
            this.next = null;
        }
    }

    private TextNode head;
    private TextNode current;
    private int historyLimit;
    private int size;

    public TextEditor(int historyLimit) {
        this.head = null;
        this.current = null;
        this.historyLimit = historyLimit;
        this.size = 0;
    }

    // Add a new text state
    public void addState(String text) {
        TextNode newNode = new TextNode(text);

        // If it's the first state
        if (head == null) {
            head = newNode;
            current = newNode;
        } else {
            // Add the new state after the current state
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }

        // Clear any redo history
        current.next = null;

        // Ensure the history does not exceed the limit
        if (size == historyLimit) {
            head = head.next;
            head.prev = null;
        } else {
            size++;
        }

        System.out.println("New state added: \"" + text + "\"");
    }

    // Undo functionality
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("No more undo actions available.");
            return;
        }
        current = current.prev;
        System.out.println("Undo performed. Current state: \"" + current.textState + "\"");
    }

    // Redo functionality
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("No more redo actions available.");
            return;
        }
        current = current.next;
        System.out.println("Redo performed. Current state: \"" + current.textState + "\"");
    }

    // Display the current state
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Text editor is empty.");
        } else {
            System.out.println("Current state: \"" + current.textState + "\"");
        }
    }
}