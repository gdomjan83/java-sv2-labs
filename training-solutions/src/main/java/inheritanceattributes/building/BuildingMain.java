package inheritanceattributes.building;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("Pannon Egyetem", 2510.4, 4);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Pannon Egyetem", 2510.4, 4, 150);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
