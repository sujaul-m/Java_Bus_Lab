import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop stop;

    @Before
    public void before(){
        bus = new Bus("Codeclan", 3);
        person = new Person();
        stop = new BusStop("Stop A");

    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengerToBus(){
        bus.ifSpaceAddPassenger(person);
        bus.ifSpaceAddPassenger(person);
        bus.ifSpaceAddPassenger(person);
        bus.ifSpaceAddPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.ifSpaceAddPassenger(person);
        bus.ifSpaceAddPassenger(person);
        bus.ifSpaceAddPassenger(person);
        bus.removePassenger(person);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canPickUpPassenger(){
        stop.addPassengerToQueue(person);
        stop.addPassengerToQueue(person);
        stop.addPassengerToQueue(person);
        stop.removePassengerFromQueue(person);

        assertEquals(2, stop.queueSize());
        assertEquals(3, bus.passengerCount());

    }

}
