public class Office extends Building {

    private String companyName;
    private int numberOfMeetingRooms;

    public Office(String buildingName, int numberOfRooms,String dateOfConstruction, String companyName,int numberOfMeetingRooms){
        super(buildingName, numberOfRooms, dateOfConstruction);
        this.companyName = companyName;
        this.numberOfMeetingRooms = numberOfMeetingRooms;

    }

    @Override
    public void addRooms(int amount) {
        this.numberOfRooms += amount;
    }

    public int designateMeetingRooms(int amount){
        this.numberOfMeetingRooms = amount;
        return amount;
    }

}
