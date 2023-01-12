import java.util.Scanner;
public class Main {
    private final int INCHESPERYARD = 36;
    private final int FEETPERMILE = 5080;
    private final double MILEPERFURLONG = 0.125;
    public static void main(String[] args) {
        displayOptions();
        String chosenUnits = getUnits();
        validateInput(chosenUnits);

        double distance = getDistance(chosenUnits);
    }
    public static void displayOptions() {
        System.out.println("Enter one of the following units to convert the distance to:");
        System.out.println("yards");
        System.out.println("miles");
        System.out.println("furlongs");
    }
    public static String getUnits() {
        // Get units from the user
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static void validateInput(String option) {
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
                case "furlough":
                    isInputValid = true;
                    break;
                default:
                    System.out.println("Please enter either \\'yards\\', \\'miles\\', or \\'furlongs\\'");
                    Scanner scanner = new Scanner(System.in);
                    option = scanner.next();
            }
        }
    }
    public static double getDistance(String units) {
        System.out.printf("Enter the distance you want to convert to %s%n", units);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}