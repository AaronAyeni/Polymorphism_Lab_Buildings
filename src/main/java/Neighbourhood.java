import java.util.ArrayList;

public class Neighbourhood {

    private ArrayList<Building> buildings;

    public Neighbourhood(){
        this.buildings = new ArrayList<>();
    }

    public int countBuildings(){
        return this.buildings.size();
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }

}
