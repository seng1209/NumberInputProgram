import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        do {
            System.out.println("Options:");
            System.out.println("1. Input numbers");
            System.out.println("2. View entered numbers");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    count = inputNumbers(scanner, numbers, count);
                    break;
                case 2:
                    viewEnteredNumbers(numbers, count);
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }

            System.out.println();
        } while (option != 0);

        scanner.close();
    }

    private static int inputNumbers(Scanner scanner, int[] numbers, int count) {
        System.out.print("Enter numbers (separated by spaces): ");
        scanner.nextLine(); // Consume the newline character
        String input = scanner.nextLine();

        String[] numberStrings = input.split(" ");
        for (String numString : numberStrings) {
            if (count >= numbers.length) {
                System.out.println("Maximum number of elements reached!");
                break;
            }
            int number = Integer.parseInt(numString);
            numbers[count++] = number;
        }

        System.out.println("Numbers entered successfully!");
        return count;
    }

    private static void viewEnteredNumbers(int[] numbers, int count) {
        System.out.print("Entered numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}