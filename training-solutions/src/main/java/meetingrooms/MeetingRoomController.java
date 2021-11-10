package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();
    private Scanner sc = new Scanner(System.in);

    public void readOffice() {
        System.out.println("Adja meg a tárgyaló nevét:");
        String name = sc.nextLine();
        System.out.println("Adja meg a tárgyaló hosszát méterben:");
        int length = sc.nextInt();
        System.out.println("Adja meg a tárgyaló szélességét méterben:");
        int width = sc.nextInt();
        sc.nextLine();

        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    public void printMenu() {
        String[] text = {"Tárgyaló rögzítése", "Tárgyalók sorrendben", "Tárgyalók visszafele sorrendben",
        "Minden második tárgyaló", "Területek", "Keresés pontos név alapján", "Keresés névtöredék alapján",
        "Keresés terület alapján", "Kilépés"};
        System.out.println();
        for (int i = 0; i < text.length; i++) {
            System.out.println((i + 1) + ". " + text[i]);
        }
        System.out.println("\nVálassza ki a kívánt menüpontot!");
    }

    public void runMenu() {
        boolean exit = false;
        String option;

        while (!exit) {
            printMenu();
            option = sc.nextLine();

            switch (option) {
                case "1":
                    readOffice();
                    break;
                case "2":
                    office.printNames();
                    break;
                case "3":
                    office.printNamesReverse();
                    break;
                case "4":
                    office.printEvenNames();
                    break;
                case "5":
                    office.printAreas();
                    break;
                case "6":
                    System.out.println("Keresett név:");
                    String search = sc.nextLine();
                    office.printMeetingRoomsWithNames(search);
                    break;
                case "7":
                    System.out.println("Keresett részleges név:");
                    String part = sc.nextLine();
                    office.printMeetingRoomsContains(part);
                    break;
                case "8":
                    System.out.println("A következő területnél nagyobb irodák kiírása:");
                    int area = sc.nextInt();
                    sc.nextLine();
                    office.printAreasLargerThan(area);
                    break;
                case "9":
                    exit = true;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        MeetingRoomController controller = new MeetingRoomController();
        controller.runMenu();
    }
}
