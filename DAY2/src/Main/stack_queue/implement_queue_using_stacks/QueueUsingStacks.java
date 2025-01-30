package Main.stack_queue.implement_queue_using_stacks;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void enqueue(int val){
        stack1.push(val);
    }

    public int dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        if(stack2.isEmpty()){
            System.out.println("Queue is empty");
        }
        return stack2.pop();
    }
    public int peek() {
        if (stack2.isEmpty()) {
            // If stack2 is empty, move elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
        }

        return stack2.peek();
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }


}
