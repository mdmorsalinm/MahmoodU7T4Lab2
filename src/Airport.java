import java.util.ArrayList;

public class Airport  {
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights) {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights() {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue() {
        double total = 0;
        for (Flight flight : allFlights) {
            if (flight.getNumPassengers() >= flight.getCapacity()) {
                total += flight.getCapacity() * flight.getPrice();
            } else {
                total += flight.getNumPassengers() * flight.getPrice();
            }
        }
        return total;
    }

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights() {
        int count = 0;
        for (int i = allFlights.size() - 1; i >= 0; i--) {
            if (allFlights.get(i).getNumPassengers() < (0.2 * allFlights.get(i).getCapacity())) {
                count += allFlights.get(i).getNumPassengers();
                allFlights.remove(i);
            }
        }
        return count;
    }
}