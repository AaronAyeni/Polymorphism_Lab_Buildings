import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NeighbourhoodTest {

    Neighbourhood neighbourhood;

    @BeforeEach
    void setUp(){
        neighbourhood = new Neighbourhood();
    }

    @Test
    void canCountBuildings(){
        int expected = 0;
        int result = neighbourhood.countBuildings();
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canAddBuilding() {
        Bungalow bungalow = new Bungalow("myHouse",2,"20thMay2024",true,true );
        neighbourhood.addBuilding(bungalow);
        int expected = 1;
        int result = neighbourhood.countBuildings();
        assertThat(result).isEqualTo(expected);
    }
}
