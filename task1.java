/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author komal
 */
import java.util.Scanner;

public class OnlineResevationSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static String loggedInUserId = null;

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Welcome to the Online Reservation System!");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = readIntInput(); // Handle integer input

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static int readIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // Consume the invalid input
        }
        return scanner.nextInt();
    }

    private static void login() {
        System.out.print("Enter Login ID: ");
        String loginId = scanner.next();
        System.out.print("Enter Password: ");
        String password = scanner.next();

        // Dummy authentication logic (always return true for any input)
        if (authenticateUser(loginId, password)) {
            loggedInUserId = loginId;
            System.out.println("Login successful. Welcome, " + loginId + "!");
            showMainMenu();
        } else {
            System.out.println("Invalid login credentials. Please try again.");
        }
    }

    private static boolean authenticateUser(String loginId, String password) {
        // Dummy authentication logic (always return true for any input)
        return true;
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Make a Reservation");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");

            int choice = readIntInput(); // Handle integer input

            switch (choice) {
                case 1:
                    makeReservation();
                    break;
                case 2:
                    cancelReservation();
                    break;
                case 3:
                    System.out.println("Logout successful. Goodbye!");
                    loggedInUserId = null;
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void makeReservation() {
        if (loggedInUserId == null) {
            System.out.println("Please log in first.");
            return;
        }

        System.out.println("Reservation Form:");
        System.out.print("Enter Train Number: ");
        String trainNumber = scanner.next();
        System.out.print("Enter Train Name: ");
        String trainName = scanner.next();
        System.out.print("Enter Class Type: ");
        String classType = scanner.next();
        System.out.print("Enter Date of Journey: ");
        String dateOfJourney = scanner.next();
        System.out.print("Enter From (Place): ");
        String fromPlace = scanner.next();
        System.out.print("Enter To (Destination): ");
        String toDestination = scanner.next();

        // Perform reservation (replace this with actual reservation logic)
        System.out.println("Reservation successful for user: " + loggedInUserId);
    }

    private static void cancelReservation() {
        if (loggedInUserId == null) {
            System.out.println("Please log in first.");
            return;
        }

        System.out.println("Cancellation Form:");
        System.out.print("Enter PNR Number to cancel reservation: ");
        String pnrNumber = scanner.next();

        // Perform cancellation (replace this with actual cancellation logic)
        System.out.println("Cancellation successful for PNR: " + pnrNumber);
    }
}


