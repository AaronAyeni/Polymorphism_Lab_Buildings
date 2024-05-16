public class Bungalow extends Building {

    private boolean hasLoftConversion;
    private boolean central_heating;

    public Bungalow(String buildingName, int numberOfRooms,String dateOfConstruction, boolean hasLoftConversion, boolean central_heating){
        super(buildingName, numberOfRooms, dateOfConstruction);
        this.hasLoftConversion = hasLoftConversion;
        this.central_heating = central_heating;
    }


    @Override
    public void addRooms(int amount) {
        this.numberOfRooms += amount;
    }

    public boolean addLoftConversion(boolean trueOrFalse){
        if(hasLoftConversion == true){
            this.hasLoftConversion = true;

        }else if((hasLoftConversion == false) && (trueOrFalse == true)){
            this.hasLoftConversion = true;

        }else{
            this.hasLoftConversion = false;
        }
        return trueOrFalse;
    }
}
