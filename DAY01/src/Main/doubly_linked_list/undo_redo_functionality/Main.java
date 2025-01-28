package Main.doubly_linked_list.undo_redo_functionality;


public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10); // Limit history to 10 states

        // Simulating actions in the text editor
        editor.addState("Hello");
        editor.addState("Hello, World");
        editor.addState("Hello, World!");

        // Display current state
        editor.displayCurrentState();

        // Perform undo actions
        editor.undo();
        editor.undo();

        // Perform redo action
        editor.redo();

        // Add a new state (clears redo history)
        editor.addState("Hello, Java!");

        // Display the current state
        editor.displayCurrentState();

        // Perform undo actions
        editor.undo();
        editor.undo();
        editor.undo(); // No more undo actions available
    }
}
