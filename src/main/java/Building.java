public  abstract class Building {

    protected String buildingName;
    protected int numberOfRooms;
    protected String dateOfConstruction;

    public Building(String buildingName, int numberOfRooms, String dateOfConstruction){
        this.buildingName = buildingName;
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
    }


    public abstract void addRooms(int amount);
}
