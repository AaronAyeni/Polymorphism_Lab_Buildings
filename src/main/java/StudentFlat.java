public class StudentFlat extends Building {

    private long numberOfPartiesHosted;
    private int numberOfKitchens;

    public StudentFlat(String buildingName, int numberOfRooms,String dateOfConstruction, long numberOfPartiesHosted, int numberOfKitchens){
        super(buildingName, numberOfRooms, dateOfConstruction);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
        this.numberOfKitchens = numberOfKitchens;
    }

    @Override
    public void addRooms(int amount) {
        this.numberOfRooms += amount;
    }

    public boolean throwAnotherParty(boolean trueOrFalse){
        if(trueOrFalse == true){
            numberOfPartiesHosted += 1;
        }else;
        return trueOrFalse;
    }

    public long countNumberOfParties(){
        return this.numberOfPartiesHosted;
    }
}
