import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room room;
    Room room1;
    Room room2;
    Guest guest;

    @Before
    public void before (){
        this.hotel = new Hotel ();
        this.room = new BedRoom (2, 12,  BedRoomType.SINGLE, 12.01);
        this.room1 = new BedRoom (4, 13,  BedRoomType.DOUBLE, 24.02);
        this.room2 = new BedRoom (4, 14,  BedRoomType.DOUBLE, 23.02);
        this.guest = new Guest ("Davina");
    }

    @Test
    public void canGetRoomList(){
        hotel.AddRooms(room);
        hotel.AddRooms(room);
        assertEquals(2, hotel.getRoomList().size());

    }

    @Test
    public void canCheckInGuests() {
        hotel.checkInGuests(room, guest);
        hotel.checkInGuests(room, guest);
        assertEquals(2, room.getGuestList().size());
    }

    @Test
    public void canCheckGuestsInRoom() {
        hotel.checkInGuests(room, guest);
        hotel.checkInGuests(room, guest);
        assertEquals(2, hotel.guestsInRoom(room).size());
    }

    @Test
    public void canCheckOutGuests(){
        hotel.checkInGuests(room, guest);
        hotel.checkInGuests(room, guest);
        hotel.checkOutGuests(room, guest);
        assertEquals(1, room.getGuestList().size());

    }

    @Test
    public void canAddRooms(){
        hotel.AddRooms(room);
        assertEquals(1, hotel.getRoomList().size());
    }

    @Test
    public void getEmptyRooms() {
        hotel.AddRooms(room);
        hotel.AddRooms(room1);
        hotel.AddRooms(room2);
        hotel.checkInGuests(room1, guest);
        assertEquals(2, hotel.emptyRooms().size());
    }

}
