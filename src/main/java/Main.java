import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Red = 1");
        System.out.println("Blue = 2");
        System.out.println("Green = 3");
        System.out.println("Yellow = 4");
        System.out.println("Black = 5");

        System.out.println("Select a color!");
        int colorSelection = input.nextInt();
        input.nextLine();

        switch (colorSelection) {
            case 1:
                System.out.println("You selected Red!");
                break;
            case 2:
                System.out.println("You selected Blue!");
                break;
            case 3:
                System.out.println("You selected Green!");
                break;
            case 4:
                System.out.println("You selected Yellow!");
                break;
            case 5:
                System.out.println("You selected Black!");
                break;
            default:
                System.out.println("Invalid Selection!");
        }
    }
}