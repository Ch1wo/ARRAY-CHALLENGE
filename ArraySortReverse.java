import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
     public static void main(String[] args) {
        String[] studentIDs = {"S22", "S10", "S45", "S01"};

        System.out.println("Sorted IDs:");
        Arrays.sort(studentIDs);
        for (String id : studentIDs) {
            System.out.println("-- " + id);
        }

        System.out.println("\nReversed IDs:");
        List<String> idList = Arrays.asList(studentIDs);
        Collections.reverse(idList);
        for (String id : idList) {
            System.out.println("-- " + id);
        }
    }
}