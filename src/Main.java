import java.util.Scanner;
public class Main {
    private final int INCHESPERYARD = 36;
    private final int FEETPERMILE = 5080;
    private final double MILEPERFURLONG = 0.125;
    public static void main(String[] args) {
        displayOptions();
        Scanner scanner = new Scanner(System.in);

        String chosenUnits = getUnits(scanner);
        chosenUnits = validateInput(chosenUnits, scanner);

        double distance = getDistance(chosenUnits, scanner);
        scanner.close();
    }
    public static void displayOptions() {
        System.out.println("Enter one of the following units to convert the distance to:");
        System.out.println("yards");
        System.out.println("miles");
        System.out.println("furlongs");
    }
    public static String getUnits(Scanner scanner) {
        return scanner.next();
    }
    public static String validateInput(String option, Scanner scanner) {
        option = option.toLowerCase();
        boolean isInputValid = false;

        while (!isInputValid) {
            switch (option) {
                case "yards":
                    isInputValid = true;
                    break;
                case "miles":
                    isInputValid = true;
                    break;
                case "furlongs":
                    isInputValid = true;
                    break;
                default:
                    System.out.println("Please enter either 'yards', 'miles', or 'furlongs'");
                    option = scanner.next();
            }
        }

        return option;
    }
    public static double getDistance(String units, Scanner scanner) {
        System.out.printf("Enter the distance you want to convert to %s%n", units);
        return scanner.nextDouble();
    }

}