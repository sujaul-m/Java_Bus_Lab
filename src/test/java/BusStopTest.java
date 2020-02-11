import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private ArrayList<Person> queue;
    private Person person;
    private Bus bus;

    @Before
    public void before(){
        busStop = new BusStop("Stop A");
        queue = new ArrayList<Person>();
        bus = new Bus("Codeclan", 3);
    }

    @Test
    public void queueStartsAtZero(){
        assertEquals(0, busStop.queueSize());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPassengerToQueue(person);
        assertEquals(1, busStop.queueSize());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPassengerToQueue(person);
        busStop.addPassengerToQueue(person);
        busStop.addPassengerToQueue(person);
        busStop.removePassengerFromQueue(person);
        assertEquals(2, busStop.queueSize());
    }




}
