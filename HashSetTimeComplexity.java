import java.util.HashSet;

public class HashSetTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of HashSet
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>(size);

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            System.out.println("\nHashSet Operations - Size: " + size);

            // 1. Read by value (O(1) average)
            long startTime = System.nanoTime();
            boolean found = hashSet.contains(size - 1);
            long endTime = System.nanoTime();
            System.out.println("Read by value: " + (endTime - startTime) + " nanoseconds");

            // 2. Insert at head (simulated as regular insert) (O(1) average)
            startTime = System.nanoTime();
            hashSet.add(-1);
            endTime = System.nanoTime();
            System.out.println("Insert at head: " + (endTime - startTime) + " nanoseconds");

            // 3. Insert at mid (simulated) (O(1) average)
            startTime = System.nanoTime();
            hashSet.add(size / 2);
            endTime = System.nanoTime();
            System.out.println("Insert at mid: " + (endTime - startTime) + " nanoseconds");

            // 4. Insert at tail (simulated as regular insert) (O(1) average)
            startTime = System.nanoTime();
            hashSet.add(size + 1);
            endTime = System.nanoTime();
            System.out.println("Insert at tail: " + (endTime - startTime) + " nanoseconds");

            // 5. Delete from head (simulated as remove) (O(1) average)
            startTime = System.nanoTime();
            hashSet.remove(size - 1); // Remove the head element
            endTime = System.nanoTime();
            System.out.println("Delete from head: " + (endTime - startTime) + " nanoseconds");

            // 6. Delete from mid (simulated) (O(1) average)
            startTime = System.nanoTime();
            hashSet.remove(size / 2); // Removing the mid element
            endTime = System.nanoTime();
            System.out.println("Delete from mid: " + (endTime - startTime) + " nanoseconds");

            // 7. Delete from tail (simulated as remove) (O(1) average)
            startTime = System.nanoTime();
            hashSet.remove(-1); // Removing the tail element
            endTime = System.nanoTime();
            System.out.println("Delete from tail: " + (endTime - startTime) + " nanoseconds");
        }
    }
}