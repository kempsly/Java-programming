import java.util.Stack;

public class StackCollection {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack : " + stack);
        //Item that are at the top of the stack
        String topElement = stack.peek();
        System.out.println("Peek :" + topElement);
        //Remove an element
        String removedElement = stack.pop();
        System.out.println("Pop :" + removedElement);

        //Searching for an item
        int position = stack.search("First");
        System.out.println("Position of First :" + position);
    }
}
