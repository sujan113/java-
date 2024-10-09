import java.util.ArrayList;

public class ArrayListTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            System.out.println("\nArrayList Operations - Size: " + size);

            // 1. Read by index (O(1))
            long startTime = System.nanoTime();
            int value = arrayList.get(size / 2);
            long endTime = System.nanoTime();
            System.out.println("Read by index: " + (endTime - startTime) + " nanoseconds");

            // 2. Read by value (O(n))
            startTime = System.nanoTime();
            boolean found = arrayList.contains(size - 1);  // Searching for the last element
            endTime = System.nanoTime();
            System.out.println("Read by value: " + (endTime - startTime) + " nanoseconds");

            // 3. Insert at head (O(n))
            startTime = System.nanoTime();
            arrayList.add(0, -1);  // Insert new element at the start
            endTime = System.nanoTime();
            System.out.println("Insert at head: " + (endTime - startTime) + " nanoseconds");

            // 4. Insert at mid (O(n))
            startTime = System.nanoTime();
            arrayList.add(size / 2, -1);  // Insert new element in the middle
            endTime = System.nanoTime();
            System.out.println("Insert at mid: " + (endTime - startTime) + " nanoseconds");

            // 5. Insert at tail (O(1) amortized)
            startTime = System.nanoTime();
            arrayList.add(-1);  // Insert new element at the end
            endTime = System.nanoTime();
            System.out.println("Insert at tail: " + (endTime - startTime) + " nanoseconds");

            // 6. Delete from head (O(n))
            startTime = System.nanoTime();
            arrayList.remove(0);  // Delete element from the start
            endTime = System.nanoTime();
            System.out.println("Delete from head: " + (endTime - startTime) + " nanoseconds");

            // 7. Delete from mid (O(n))
            startTime = System.nanoTime();
            arrayList.remove(size / 2);  // Delete element from the middle
            endTime = System.nanoTime();
            System.out.println("Delete from mid: " + (endTime - startTime) + " nanoseconds");

            // 8. Delete from tail (O(1))
            startTime = System.nanoTime();
            arrayList.remove(arrayList.size() - 1);  // Delete element from the end
            endTime = System.nanoTime();
            System.out.println("Delete from tail: " + (endTime - startTime) + " nanoseconds");
        }
    }
}
