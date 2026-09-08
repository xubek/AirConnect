public class Passenger {
    private String passengerName;
    private String passportNumber;
    private String email;
    private String nationality;


    public Passenger(String PassengerName, String PassportNumber, String Email, String Nationality){
        this.passengerName = PassengerName;
        this.passportNumber = PassportNumber;
        this.email = Email;
        this.nationality = Nationality;
    }

    public String getPassengerName(){
        return passengerName;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getNationality(){
        return nationality;
    }

    public void displayPassenger(){
        System.out.println("\n------ Passenger Information ------" );
        System.out.println("Name: " + getPassengerName());
        System.out.println("Passport Number: " + getPassportNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Nationality: " + getNationality());
        System.out.println();
    }
}
