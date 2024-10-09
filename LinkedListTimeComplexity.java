import java.util.LinkedList;

public class LinkedListTimeComplexity {
    
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        int[] sizes = {1000, 10000, 100000, 1000000}; // Using specified sizes

        for (int size : sizes) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            performLinkedListOperations(linkedList, size);
        }
    }

    // Method for LinkedList Operations
    private static void performLinkedListOperations(LinkedList<Integer> linkedList, int size) {
        System.out.println("\nLinkedList Operations - Size: " + size);

        // 1. Read by index (O(n))
        long startTime = System.nanoTime();
        int value = linkedList.get(size / 2);
        long endTime = System.nanoTime();
        System.out.println("Read by index: " + (endTime - startTime) + " nanoseconds");

        // 2. Read by value (O(n))
        startTime = System.nanoTime();
        boolean found = linkedList.contains(size - 1);
        endTime = System.nanoTime();
        System.out.println("Read by value: " + (endTime - startTime) + " nanoseconds");

        // 3. Insert at head (O(1))
        startTime = System.nanoTime();
        linkedList.addFirst(-1);
        endTime = System.nanoTime();
        System.out.println("Insert at head: " + (endTime - startTime) + " nanoseconds");

        // 4. Insert at mid (O(n))
        startTime = System.nanoTime();
        linkedList.add(size / 2, -1);
        endTime = System.nanoTime();
        System.out.println("Insert at mid: " + (endTime - startTime) + " nanoseconds");

        // 5. Insert at tail (O(1))
        startTime = System.nanoTime();
        linkedList.addLast(-1);
        endTime = System.nanoTime();
        System.out.println("Insert at tail: " + (endTime - startTime) + " nanoseconds");

        // 6. Delete from head (O(1))
        startTime = System.nanoTime();
        linkedList.removeFirst();
        endTime = System.nanoTime();
        System.out.println("Delete from head: " + (endTime - startTime) + " nanoseconds");

        // 7. Delete from mid (O(n))
        startTime = System.nanoTime();
        linkedList.remove(size / 2);
        endTime = System.nanoTime();
        System.out.println("Delete from mid: " + (endTime - startTime) + " nanoseconds");

        // 8. Delete from tail (O(1))
        startTime = System.nanoTime();
        linkedList.removeLast();
        endTime = System.nanoTime();
        System.out.println("Delete from tail: " + (endTime - startTime) + " nanoseconds");
    }
}
