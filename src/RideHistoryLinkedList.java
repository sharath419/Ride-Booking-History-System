public class RideHistoryLinkedList {
    private Node head;


    public void addRide(Ride ride) {
        Node newNode = new Node(ride);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    public void deleteLastRide() {
        if (head == null) {
            System.out.println("No rides to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void displayRides() {
        if (head == null) {
            System.out.println("No ride history.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.ride);
            temp = temp.next;
        }
    }

    public void searchRide(String location) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.ride.pickup.equalsIgnoreCase(location) ||
                temp.ride.drop.equalsIgnoreCase(location)) {

                System.out.println(temp.ride);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No rides found for location: " + location);
        }
    }


    public void reverseHistory() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }
}