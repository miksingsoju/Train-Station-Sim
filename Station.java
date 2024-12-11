/**
 * 1. **Stations:**
   - Represent MRT stations with a name and the number of passengers waiting at each station.
   - The simulation should allow stations to dynamically adjust 
   the number of passengers waiting.

 */

public class Station {
    private String name;
    private int waitingPassengers;

    public Station(String n){
       name = n;
       waitingPassengers = 0;
    }

    public String getName(){
        return name;
    }

    public int getWaitingPassengers(){
        return waitingPassengers;
    }

    public void passengerLeft(){
        waitingPassengers -= 1;
    }

    public void passengerEnter(){
        waitingPassengers += 1;
    }

}