import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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

        for(Flight flight : flights){
            flight.displayFlight();
            System.out.println();
        }


        System.out.println("\n------ Available Flights------");
        System.out.println("Total Flights: " + flights.size());

        for (Flight flight : flights){
            flight.bookSeat();
            System.out.println("Seat available for flight "+ flight.getFlightNumber()+
                                " From "+flight.getOrigin() +
                                " to " + flight.getDestination() +
                                " is: " + flight.getSeatAvailable());
        }

        String searchFlight = "AC225";
        boolean found = false;

        for(Flight flight: flights){
            if(flight.getFlightNumber().equals(searchFlight)){
                System.out.println("\nFlight Found!");
                flight.displayFlight();
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Flight Not Found!");
        }


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

        for(Passenger passenger : passengers){
            passenger.displayPassenger();
        }

        System.out.println("\nWelcome aboard AirConnect!");
        System.out.println("Passenger:" + passenger1.getPassengerName());
        System.out.println("Flight: " + calgaryToMontreal.getFlightNumber());
        System.out.println("Route: " + calgaryToMontreal.getOrigin() + " -> " + calgaryToMontreal.getDestination());


        System.out.println("=====================================");
        System.out.println("       Welcome to AirConnect");
        System.out.println("=====================================");
        System.out.println("1. View Flight");
        System.out.println("2. Search Flight");
        System.out.println("3. View Passengers");
        System.out.println("4. Book Passenger");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your choice:");
        int choice = scanner.nextInt();

        switch(choice){

            case 1:
                for(Flight flight : flights) {
                    flight.displayFlight();
                }
                break;

            case 2:
                scanner.nextLine(); //clear buffer
                System.out.println("Enter Flight Number: ");
                String searchTheFlight = scanner.nextLine();
                boolean find = false;

                for(Flight flight : flights){

                    if(flight.getFlightNumber().equals(searchTheFlight)){
                        System.out.println("Flight Found");
                        flight.displayFlight();
                        find = true;
                        break;
                    }
                }
                if(!find){
                    System.out.println("Flight not Found");
                }
                break;

            case 3:
                for(Passenger passenger : passengers){
                    passenger.displayPassenger();
                }
                break;

            case 4:
                scanner.nextLine();
                System.out.print("Enter Flight Number: ");
                String passengerFlightNumber = scanner.nextLine();
                boolean foundFlight = false;
                for(Flight flight : flights){
                    if(flight.getFlightNumber().equals(passengerFlightNumber)){
                        flight.bookSeat();
                        foundFlight = true;
                        break;
                    }
                }
                if(!foundFlight){
                    System.out.println("Flight Not Found");
                }
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