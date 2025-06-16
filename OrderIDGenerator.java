import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] ticketIDs = new String[3];

        for (int i = 0; i < ticketIDs.length; i++) {
            int number = random.nextInt(9000) + 1000; // Range: 1000-9999
            ticketIDs[i] = "T" + number;
        }

        System.out.println("Generated Tickets:");
        for (String ticket : ticketIDs) {
            System.out.println(ticket);
        }
    }
}