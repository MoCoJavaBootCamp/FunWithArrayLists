import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Lists.");
        int ID;

        do {
            System.out.println("Enter a number to select program or enter 0 to exit.\n" +
                    "0 - Exit\n" +
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
        ArrayList<String> colors = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int ID;
        String color;
        for (int i = 0; i < 3; i += 1) {
            System.out.println("Add a color: ");
            color = input.nextLine();
            colors.add(color);
            System.out.println(colors);
        }

        do {
            System.out.println("Enter another color or type '0' to continue.");
            ID = input.nextInt();
            color = input.nextLine();
            colors.add(color);
            System.out.println(colors);
        } while (ID != 0);

        do {
            System.out.println("Enter a number to select a program:\n" +
                    "0 - Quit\n" +
                    "1 - Print color at index 1\n" +
                    "2 - Add new color\n");
            ID = input.nextInt();

            switch (ID) {
                case 1:
                    System.out.println("The color at index 1 is " + colors.get(1));
                    break;
                case 2:
                    System.out.println("Enter a color:");
                    color = input.nextLine();
                    colors.add(color);
                    System.out.println(colors);
                    break;
                default:
                    System.out.println("Goodbye!");
                    System.exit(1);
            }
        } while (ID != 0);

        System.out.println("Your color list:\n" + colors);
    }
}


