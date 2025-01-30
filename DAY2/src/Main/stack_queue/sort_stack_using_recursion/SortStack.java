package Main.stack_queue.sort_stack_using_recursion;

import java.util.Stack;


public class SortStack {

    public static void sortStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }


        int top = stack.pop();

        sortStack(stack);


        insertSorted(stack, top);
    }


    public static void insertSorted(Stack<Integer> stack, int element) {

        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }


        int temp = stack.pop();
        insertSorted(stack, element);

        stack.push(temp);
    }


    public static void printStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
