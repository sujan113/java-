public class ArrayTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            System.out.println("\nArray Operations - Size: " + size);

            // 1. Read by index (O(1))
            long startTime = System.nanoTime();
            int value = array[size / 2];
            long endTime = System.nanoTime();
            System.out.println("Read by index: " + (endTime - startTime) + " nanoseconds");

            // 2. Read by value (O(n))
            startTime = System.nanoTime();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (array[i] == size - 1) {
                    found = true;
                    break;
                }
            }
            endTime = System.nanoTime();
            System.out.println("Read by value: " + (endTime - startTime) + " nanoseconds");

            // 3. Insert at head (O(n))
            startTime = System.nanoTime();
            int[] newArray = new int[size + 1];
            System.arraycopy(array, 0, newArray, 1, size);
            newArray[0] = -1;  // Insert new element at the start
            endTime = System.nanoTime();
            System.out.println("Insert at head: " + (endTime - startTime) + " nanoseconds");

            // 4. Insert at mid (O(n))
            startTime = System.nanoTime();
            newArray = new int[size + 1];
            int mid = size / 2;
            System.arraycopy(array, 0, newArray, 0, mid);
            System.arraycopy(array, mid, newArray, mid + 1, size - mid);
            newArray[mid] = -1;  // Insert new element in the middle
            endTime = System.nanoTime();
            System.out.println("Insert at mid: " + (endTime - startTime) + " nanoseconds");

            // 5. Insert at tail (O(1) amortized)
            startTime = System.nanoTime();
            newArray = new int[size + 1];
            System.arraycopy(array, 0, newArray, 0, size);
            newArray[size] = -1;  // Insert new element at the end
            endTime = System.nanoTime();
            System.out.println("Insert at tail: " + (endTime - startTime) + " nanoseconds");

            // 6. Delete from head (O(n))
            startTime = System.nanoTime();
            newArray = new int[size - 1];
            System.arraycopy(array, 1, newArray, 0, size - 1);
            endTime = System.nanoTime();
            System.out.println("Delete from head: " + (endTime - startTime) + " nanoseconds");

            // 7. Delete from mid (O(n))
            startTime = System.nanoTime();
            newArray = new int[size - 1];
            System.arraycopy(array, 0, newArray, 0, mid);
            System.arraycopy(array, mid + 1, newArray, mid, size - mid - 1);
            endTime = System.nanoTime();
            System.out.println("Delete from mid: " + (endTime - startTime) + " nanoseconds");

            // 8. Delete from tail (O(1))
            startTime = System.nanoTime();
            newArray = new int[size - 1];
            System.arraycopy(array, 0, newArray, 0, size - 1);
            endTime = System.nanoTime();
            System.out.println("Delete from tail: " + (endTime - startTime) + " nanoseconds");
        }
    }
}
