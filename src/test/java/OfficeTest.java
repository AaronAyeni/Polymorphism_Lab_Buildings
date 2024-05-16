import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    private Office office;

    @BeforeEach
    public void setUp(){
        office = new Office("myOffice",5, "10thMay2024", "JavaInc",2);
    }

    @Test
    public void canDesignateMeetingRooms(){
        int expected = 3;
        int result = office.designateMeetingRooms(3);
        assertThat(result).isEqualTo(expected);
    }
}
