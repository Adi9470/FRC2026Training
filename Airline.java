public class Airline {
    private String airLineName;
    private Flight[] flightArr;
    private int flightCount;

    public void addFlight(Flight f){
        int indexI = 0;
        for(int i = 0; i< flightArr.length; i++){
            if(f.getFlightNumber() == flightArr[i].getFlightNumber()){
                indexI = i;
                break;
            }
        }
        for(int i = indexI +1 ; i <flightArr.length; i++){
            if(flightArr[i] == null){
                flightArr[i] = f;
            }
        }
    }
    public Flight getFlightByNumber(String number){
        for(int i = 0; i<flightArr.length; i++){
        if(flightArr[i].getFlightNumber()== number){
            return flightArr[i];
            }
        }
        return null;
    }
    public void printFlightsTo(String destination){
        for(int i = 0; i < flightArr.length; i++){
            if(destination == flightArr[i].getEnding()){
                System.out.println(flightArr[i].getFlightNumber());
            }
        }
    }

    public String getFullestFlight(){
        int maxnumber = flightArr[0].getOccupancyPercent();
        String returnStringOfNumber= "";
        for(int j = 1; j < flightArr.length; j++){
            if(maxnumber < flightArr[j].getOccupancyPercent()){
                maxnumber= flightArr[j].getOccupancyPercent();
                returnStringOfNumber = flightArr[j].getFlightNumber();
            }
        }
        return returnStringOfNumber;
    }

    public void movePassenger(String passportId, String fromFlight, String toFlight){
        Flight fromBegingFlight = getFlightByNumber(fromFlight);
        Flight toDestFlight = getFlightByNumber(toFlight);

        if(fromBegingFlight == null || toDestFlight == null){
            return;
        }
        Passenger thePassengerOn = fromBegingFlight.findPassenger(passportId);
        if (thePassengerOn == null) {
            return;
        }

        if(toDestFlight.isFull()){
            return;
        }

        toDestFlight.addPassanger(thePassengerOn);
        fromBegingFlight.removePassenger(passportId);
    }
    
}
