import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedroom;
    Guest guest;

    @Before
    public void before() {
        this.bedroom = new BedRoom (2, 11, BedRoomType.SINGLE, 12.01);
        this.guest = new Guest ("Davina");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacityBedRoom());
    }

    @Test
    public void canGetNights(){
        assertEquals(0, bedroom.getNightsRoom());
    }

    @Test
    public void canGetNumber(){
        assertEquals(12, bedroom.getNumber());
    }

    @Test
    public void canGetType(){
        assertEquals(BedRoomType.SINGLE, bedroom.getType());
    }

    @Test
    public void canGetNightlyRate(){
      assertEquals(12.01, bedroom.getNightlyRate(), 1);
    }

    @Test
    public void canAddGuests(){
        bedroom.addGuests(guest);
        bedroom.addGuests(guest);
        assertEquals(2, bedroom.getGuestList().size());

    }

    @Test
    public void canRemoveGuests(){
        bedroom.addGuests(guest);
        bedroom.addGuests(guest);
        bedroom.removeGuests(guest);
        assertEquals(1, bedroom.getGuestList().size());

    }
}
