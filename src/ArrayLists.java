import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Lists.");
        int ID;

        do {
            System.out.println("Enter a number to select program or enter 0 to exit.\n" +
                    "1 - Color List");
            ID = input.nextInt();
            switch (ID) {
                case 1:
                    colorList();
                    break;
                default:
                    System.out.println("Goodbye!");
                    System.exit(1);
            }
        } while (ID != 0);
    }

    public static void colorList() {

    }
}
