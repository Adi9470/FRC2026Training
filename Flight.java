public class Flight {
    private String flightNumber;
    private String placeNow;
    private String endingPlace;
    private int maxPeople;
    private Passenger[] passenger;
    private int travelNowPeople;


    public Flight(String flightNumber, String placeNow, String endingPlace, int maxPeople, int travelNowPeople) {
    this.flightNumber = flightNumber;
    this.placeNow = placeNow;
    this.endingPlace = endingPlace;
    this.maxPeople = maxPeople;

    passenger = new Passenger[maxPeople];
    this.travelNowPeople = travelNowPeople;
}
    public String getFlightNumber(){
        return this.flightNumber;
    }
    public String getEnding(){
        return this.endingPlace;
    }
    public int getmax(){
        return this.maxPeople;
    }

    public boolean addPassanger(Passenger p){
        if(maxPeople == travelNowPeople){
            return false;
        }
        for(int i = 0; i < travelNowPeople; i++){
        if(p.getPsportNumber() == passenger[i].getPsportNumber()){
            return false;
        }
        }
        return true;
    }

    public Passenger findPassenger(String passportId) {
        for(int i = 0; i < travelNowPeople; i++){
            if(passportId == passenger[i].getPsportNumber()){
                return passenger[i];
            }
        }
        return null;
    }

    public boolean isFull() {
        return maxPeople == travelNowPeople;
    }

    public int getOccupancyPercent() {
        int percent = 0;
        percent = (travelNowPeople / maxPeople) * 100;
        return percent;
    }
    public void removePassenger(String passportId) {
        int indexi = 0;
        for(int i = 0; i<travelNowPeople; i++){
            if(passportId == passenger[i].getPsportNumber()){ 
                indexi = i; break;
            } 
        }
        if(indexi != travelNowPeople) {
            for(int j = indexi; j < travelNowPeople -1; j++){
                passenger[j] = passenger[j+1];
            }
            passenger[travelNowPeople-1] = null;
        }
    }

    public double getTotalLuggageWeight() {
        double t = 0.0;
        for(int i = 0; i< travelNowPeople; i++){
            t += passenger[i].getLouge();
        }
        return t;
    }

    @Override public String toString() {
        return flightNumber + placeNow + endingPlace + travelNowPeople;
     }
}

