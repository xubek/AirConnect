public class Main {
    public static void main(String[] args) {

        Flight f1 = new Flight(
                "AC102",
                "Toronto",
                "Vancouver",
                120);

        Flight f2 = new Flight(
                "AC225",
                "Calgary",
                "Montreal",
                80
        );

        Flight f3 = new Flight(
                "AC556",
                "Ottawa",
                "Halifax",
                65
        );

        f1.displayFlight();
        System.out.println();
        f2.displayFlight();

        System.out.println();
        f1.bookSeat();
        f1.displayFlight();

        System.out.println();
        f1.bookSeat();
        f1.displayFlight();
        System.out.println (f1.isFlightFull() );
    }
}