package tj.playground.java.datastructure.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> plateStack = new Stack<>();

        plateStack.push("Plate-1");
        plateStack.push("Plate-2");
        plateStack.push("Plate-3");
        plateStack.push("Plate-4");
        plateStack.push("Plate-5");
        plateStack.push("Plate-6");
        plateStack.push("Plate-7");

        plateStack.add("Plate-8");
        plateStack.push("Plate-9");

        plateStack.add(2, "Posh-Plate");
        plateStack.add(2, "Crazy-Plate");

        System.out.println("Peeking the top of the stack " + plateStack.peek());
        System.out.println("Popping the top of the stack " + plateStack.pop());
        System.out.println("Searching for Posh-Plate : " + plateStack.search("Posh-Plate"));
        System.out.println(plateStack);

    }
}
