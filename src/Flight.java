import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int seatAvailable;

    private ArrayList<Passenger> passengers;


    public Flight(String FlightNumber, String Origin, String Destination, int SeatAvailable){

        this.flightNumber = FlightNumber;
        this.origin = Origin;
        this.destination = Destination;
        this.seatAvailable = SeatAvailable;
        this.passengers = new ArrayList<>();
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getOrigin(){
        return origin;
    }

    public String getDestination(){
        return destination;
    }

    public int getSeatAvailable(){
        return seatAvailable;
    }


    public void displayFlight(){
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Numbers of seat available: " + seatAvailable);
    }

    public void bookSeat(Passenger passenger){
        System.out.println("\n------Booking Seats ------");
        if(seatAvailable > 0){
            seatAvailable --;
            addPassenger(passenger);
            System.out.println("Seat booked Sucessfully");
        } else {
            System.out.println("Sorry, flight is full");
        }
    }
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public boolean isFlightFull(){
        if(seatAvailable == 0)
            return true;
        else
            return false;
    }
}
