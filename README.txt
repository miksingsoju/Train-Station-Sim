Got it! Here’s a **specification document** for your MRT simulation project in Java. Use this as a guide for your coding exercise.

---

### **MRT Simulation Specification**

#### **1. Overview**
You are tasked with building a simulation of the Metro Rail Transit (MRT) system in Java. 
The simulation models the movement of trains across stations, passenger boarding and alighting, 
and train capacity management.

---

#### **2. Features**
1. **Stations:**
   - Represent MRT stations with a name and the number of passengers waiting at each station.
   - The simulation should allow stations to dynamically adjust 
   the number of passengers waiting.

2. **Trains:**
   - Trains should have:
     - A unique ID.
     - A passenger capacity.
     - A current station.
     - The number of passengers currently onboard.
   - Trains should move sequentially between stations and loop back 
   to the first station after reaching the last.

3. **Passengers:**
   - Simulate passengers waiting at each station.
   - When a train arrives at a station, passengers should:
     - Board if there is available capacity.
     - Stay at the station if the train is full.

4. **Schedules:**
   - Simulate trains stopping at each station for a set duration.
   - Introduce random delays to mimic real-world scenarios.

5. **Passenger Flow:**
   - Generate a random number of passengers arriving at each station during the simulation.
   - Passengers should alight at random or predefined stations.

---

#### **3. Constraints**
1. **Train Capacity:**
   - A train cannot exceed its maximum passenger capacity.
2. **Passenger Behavior:**
   - Passengers will wait indefinitely at stations until they can board a train.
3. **Time Management:**
   - Each station stop should last a defined number of seconds (e.g., 3 seconds).
   - Delays should occur randomly with a probability (e.g., 20% chance of delay).

---

#### **4. Functional Requirements**
1. **Initialization:**
   - Define a fixed number of stations.
   - Create one or more trains with specified capacities.
   - Populate stations with an initial random number of passengers.

2. **Train Movement:**
   - Trains should move sequentially between stations, updating their current station.

3. **Boarding/Alighting Logic:**
   - When a train arrives at a station:
     - Passengers waiting at the station should board, up to the train’s capacity.
     - Some passengers on the train should alight.

4. **Passenger Generation:**
   - Generate new passengers at stations during the simulation.

5. **Display Information:**
   - Print or log the following during the simulation:
     - Current train location.
     - Number of passengers onboard the train.
     - Number of passengers waiting at each station.

6. **Simulation Loop:**
   - Run the simulation in a loop until manually stopped or for a fixed duration.

---

#### **5. Optional Enhancements**
1. **Multithreading:**
   - Simulate multiple trains moving simultaneously.

2. **Interactive Input:**
   - Allow the user to add/remove passengers, start/stop trains, or introduce 
   delays during the simulation.

3. **Visual Representation:**
   - Use a simple ASCII-based display or JavaFX for a graphical interface.

4. **Advanced Passenger Behavior:**
   - Add features like:
     - Passengers with destinations.
     - Priority boarding (e.g., elderly or disabled passengers).

5. **Error Handling:**
   - Handle edge cases, such as:
     - Train arriving at an empty station.
     - Passengers attempting to board a full train.

---

#### **6. Non-Functional Requirements**
1. **Performance:**
   - Ensure the simulation handles a large number of passengers and stations efficiently.

2. **Scalability:**
   - The program should support adding more trains and stations without significant
    changes to the core logic.

3. **Code Quality:**
   - Follow object-oriented principles (encapsulation, inheritance, etc.).
   - Write clean, modular, and reusable code.

4. **Testing:**
   - Write unit tests for individual components (e.g., train, station).
   - Test the simulation with edge cases like:
     - Full trains.
     - Stations with no waiting passengers.

---

### **Deliverables**
1. **Source Code:** Fully functional simulation adhering to the requirements.
2. **Documentation:**
   - Include a short guide explaining how to run the simulation.
   - Describe how each feature works.
3. **Logs/Output:** Show sample outputs of the simulation.

---

### **Milestones**
1. Define the class structure (e.g., `Train`, `Station`, `Passenger`).
2. Implement basic train movement between stations.
3. Add passenger boarding and alighting logic.
4. Integrate random passenger generation.
5. Refine simulation with delays and logging.

---

