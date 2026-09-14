import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void viewFlights(ArrayList<Flight> flights){
        for (Flight flight : flights) {
            flight.displayFlight();
        }
    }

    public static void searchFlight(ArrayList<Flight> flights, Scanner scanner){
        scanner.nextLine(); //clear buffer
        System.out.print("Enter Flight Number: ");
        String searchTheFlight = scanner.nextLine();
        boolean find = false;

        for (Flight flight : flights) {

            if (flight.getFlightNumber().equals(searchTheFlight)) {
                System.out.println("Flight Found");
                flight.displayFlight();
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("Flight not Found");
        }
    }

    public static void viewPassengers(ArrayList<Passenger> passengers){
        for (Passenger passenger : passengers) {
            passenger.displayPassenger();
        }
    }

    public static void bookPassenger(ArrayList<Flight> flights, ArrayList<Passenger> passengers, Scanner scanner){
        scanner.nextLine();

        System.out.print("Enter Passenger Name: ");
        String passengerName = scanner.nextLine();
        System.out.print("Enter Flight Number: ");
        String passengerFlightNumber = scanner.nextLine();

        Passenger bookedPassenger = null;
        for (Passenger passenger : passengers) {
            if (passenger.getPassengerName().equals(passengerName)) {
                bookedPassenger = passenger;
                break;
            }
        }
        if (bookedPassenger == null) {
            System.out.println("Passenger Not Found");
            return;
        }

        boolean foundFlight = false;
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(passengerFlightNumber)) {
                flight.bookSeat(bookedPassenger);
                foundFlight = true;
                break;
            }
        }
        if (!foundFlight) {
            System.out.println("Flight Not Found");
        }
    }

    public static void main(String[] args) {

        ArrayList<Flight> flights = new ArrayList<>();
        Flight torontoToVancouver = new Flight(
                "AC102",
                "Toronto",
                "Vancouver",
                120);

        Flight calgaryToMontreal = new Flight(
                "AC225",
                "Calgary",
                "Montreal",
                80
        );

        Flight ottawaToHalifax = new Flight(
                "AC556",
                "Ottawa",
                "Halifax",
                65
        );

        flights.add(new Flight(
                "AC999",
                "Edmonton",
                "Toronto",
                150
            )
        );

        flights.add(torontoToVancouver);
        flights.add(calgaryToMontreal);
        flights.add(ottawaToHalifax);


        //Passenger object
        ArrayList<Passenger> passengers = new ArrayList<>();
        Passenger passenger1 = new Passenger("Subekshya Sunuwar",
                            "NP123456",
                            "subekshya@gmail.com",
                            "Nepal");
        Passenger passenger2 = new Passenger("Emma Wilson",
                                "CA987654",
                                "emma@gmail.com",
                                "Canada");

        passengers.add(passenger1);
        passengers.add(passenger2);


        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while(choice != 5) {
            System.out.println("=====================================");
            System.out.println("       Welcome to AirConnect");
            System.out.println("=====================================");
            System.out.println("1. View Flight");
            System.out.println("2. Search Flight");
            System.out.println("3. View Passengers");
            System.out.println("4. Book Passenger");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    viewFlights(flights);
                    break;

                case 2:
                    searchFlight(flights, scanner);
                    break;

                case 3:
                    viewPassengers(passengers);
                    break;

                case 4:
                    bookPassenger(flights, passengers,scanner);
                    break;

                case 5:
                    System.out.println("Thank you for using AirConnect");
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;


            }
        }









    }
}