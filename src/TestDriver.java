import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by Summer on 10/27/14.
 */
public class TestDriver {
    private static Restaurant restaurant;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the restaurant reservation system!");
        System.out.println("Please provide a list of integer representing the capacity of tables.");
        String tableCapacityString = br.readLine();
        List<Integer> tableCapacities = parseTableCapacity(tableCapacityString);
        restaurant = new Restaurant(tableCapacities);
        System.out.println("Your restaurant is set up successfully!");
        System.out.println("This is your menu:");
        restaurant.printMenu();
        System.out.println("This is your tables:");
        restaurant.printTables();
        System.out.println("Available commands: update dish names; add n; check n;");

        while (true) {
            String command = br.readLine();
            if (command.length() > 6 && command.substring(0, 6).equals("update")) {
                update(command.substring(6, command.length()));
            }
            else if (command.length() > 3 && command.substring(0, 3).equals("add")) {

            }
            else if (command.length() > 5 && command.substring(0, 5).equals("check")) {

            }
            else {
                System.out.println("The command " + command + "is invalid. Please re-enter your command.");
            }
        }
    }

    private static List<Integer> parseTableCapacity(String s) {
        List<Integer> tableCapacities = new LinkedList<Integer>();
        int cap = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) cap = cap * 10 + Character.getNumericValue(c);
            else if (cap != 0) {
                tableCapacities.add(cap);
                cap = 0;
            }
        }
        if (cap != 0) tableCapacities.add(cap);
        return tableCapacities;
    }

    private static void update(String dishNames) {
        
    }

    private static void add(String peopleInGroup) {

    }

    private static void estimateWaitingTime (String peopleInGroup) {

    }

    private static void printCurrentState() {

    }
}
