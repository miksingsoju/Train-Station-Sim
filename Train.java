/**
 * 2. **Trains:**
   - Trains should have:
     - A unique ID.
     - A passenger capacity.
     - A current station.
     - The number of passengers currently onboard.
   - Trains should move sequentially between stations and loop back 
   to the first station after reaching the last.

CONSTRAINTS:
 **Train Capacity:**
   - A train cannot exceed its maximum passenger capacity.
 */

public class Train {
    private static final int CAPACITY = 100;
    private Static int numTrains;
    private int id;
    private int capacity;
    private int currentPassengers
    private Station currentStation;

    public Train(Station startingStation){
        numTrains++;
        id = numTrains;
        currentStation = startingStation;
        capacity = CAPACITY;
        currentPassengers = 0;
    }

    public int getId(){
        return id;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getCurrentPassengers(){
        return currentPassengers;
    }

    public boolean isFull(){
        return currentPassengers >= capacity;
    }
    public void boardPassenger(){
        currentPassengers += 1;
    }
    public void alightPassenger(){
        currentPassengers -= 1;
    }

    public void nextStation(Station s){
        currentStation = s;
    }
}

