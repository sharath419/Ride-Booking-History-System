import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RideHistoryLinkedList history = new RideHistoryLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Ride Booking History System ---");
            System.out.println("1. Add Ride");
            System.out.println("2. Delete Last Ride");
            System.out.println("3. View All Rides");
            System.out.println("4. Search Ride by Location");
            System.out.println("5. Reverse Ride History");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Ride ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Pickup Location: ");
                    String pickup = sc.nextLine();

                    System.out.print("Enter Drop Location: ");
                    String drop = sc.nextLine();

                    System.out.print("Enter Fare: ");
                    double fare = sc.nextDouble();

                    history.addRide(new Ride(id, pickup, drop, fare));
                    break;

                case 2:
                    history.deleteLastRide();
                    break;

                case 3:
                    history.displayRides();
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter location to search: ");
                    String loc = sc.nextLine();
                    history.searchRide(loc);
                    break;

                case 5:
                    history.reverseHistory();
                    System.out.println("Ride history reversed.");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}