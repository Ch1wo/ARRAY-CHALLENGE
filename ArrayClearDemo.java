import java.util.Arrays;

public class ArrayClearDemo {
     public static void main(String[] args) {
        String[] taskIDs = {"T1", "T2", "T3", "T4", "T5"};

        System.out.println("Before Clearing:");
        for (String task : taskIDs) {
            System.out.println("-- " + task);
        }

        Arrays.fill(taskIDs, 0, 3, null); // Clear indices 0-2

        System.out.println("\nAfter Clearing:");
        for (String task : taskIDs) {
            System.out.println("-- " + (task == null ? "null" : task));
        }
    }
}