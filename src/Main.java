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


        System.out.println("\nTotal Flights: " + flights.size());

        for (Flight flight : flights){
            System.out.println();
            flight.bookSeat();
            System.out.println("Seat available for flight "+ flight.getFlightNumber()+
                                " From "+flight.getOrigin() +
                                " to " + flight.getDestination() +
                                " is: " + flight.getSeatAvailable());
        }



    }
}