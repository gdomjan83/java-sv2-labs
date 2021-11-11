package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("Tárgyalók:");

        for (MeetingRoom room : meetingRooms) {
            System.out.println(room.getName());
        }
    }

    public void printNamesReverse() {
        System.out.println("Tárgyalók fordított sorrendben:");

        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        System.out.println("Minden második tárgyaló:");

        for (int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        System.out.println("Tárgyalók adatai:\n");

        for (MeetingRoom room : meetingRooms) {
            System.out.printf("Név: %s - hosszúság: %d, szélesség: %d, terület: %d%n",
            room.getName(), room.getLength(), room.getWidth(), room.getArea());
        }
    }

    public void printMeetingRoomsWithNames(String name) {
        System.out.println(name + " nevű tárgyalók:");

        for (MeetingRoom room : meetingRooms) {
            if (name.equals(room.getName())) {
                System.out.printf("Hosszúság: %d, szélesség: %d, terület: %d%n",
                room.getLength(), room.getWidth(), room.getArea());
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        System.out.println("Tárgyalók, melyben szerepel a következő: " + part + "");
        String search = part.toLowerCase();

        for (MeetingRoom room : meetingRooms) {
            String roomLowerCase = room.getName().toLowerCase();
            if (roomLowerCase.contains(search)) {
                System.out.printf("Név: %s - hosszúság: %d, szélesség: %d, terület: %d%n",
                room.getName(), room.getLength(), room.getWidth(), room.getArea());
            }
        }
    }

    public void printAreasLargerThan(int area) {
        System.out.println(area + " négyzetméternél nagyobb tárgyalók adatai:");

        for (MeetingRoom room : meetingRooms) {
            if (room.getArea() > area) {
                System.out.printf("Név: %s - hosszúság: %d, szélesség: %d, terület: %d%n",
                room.getName(), room.getLength(), room.getWidth(), room.getArea());
            }
        }
    }
}
