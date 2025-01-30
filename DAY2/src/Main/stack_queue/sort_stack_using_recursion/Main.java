package Main.stack_queue.sort_stack_using_recursion;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the stack
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack:");
        SortStack.printStack(stack);

        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        // Sorting the stack
        SortStack.sortStack(stack);

        System.out.println("Sorted Stack:");
        SortStack.printStack(stack);
    }
}
