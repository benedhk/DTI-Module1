package Day11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //No.1
        /*DynamicStack stack = new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.peek()); // Output: 20*/

        //No.2
        /*DynamicQueue queue = new DynamicQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.peek()); // Output: 20*/

        //No.3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();

        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int data = scanner.nextInt();
            bst.insert(data);
        }

        while (true) {
            System.out.print("Enter a number to search (or 'quit' to exit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            int searchValue = Integer.parseInt(input);
            if (bst.search(searchValue)) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }
        }
    }
}

