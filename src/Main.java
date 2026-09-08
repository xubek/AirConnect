import java.util.ArrayList;

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






    }
}