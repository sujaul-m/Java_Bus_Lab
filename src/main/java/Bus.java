import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passenger;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passenger = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passenger.size();
    }

    public void addPassenger(Person person) {
        this.passenger.add(person);
    }

    public void ifSpaceAddPassenger(Person person) {
        if (this.passenger.size() < this.capacity ) {
            addPassenger(person);
        }
    }

    public void removePassenger(Person person) {
        this.passenger.remove(person);
    }

    public void pickUpFromBusStop(){}
}
