import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    private Bungalow bungalow;

    @BeforeEach
    public void setUp(){
        bungalow = new Bungalow("myHouse",2,"20thMay2024",false,true);
    }

    @Test
        public void canAddLoftConversion() {
            boolean result = bungalow.addLoftConversion(true);
            boolean expected = true;
            assertThat(result).isEqualTo(expected);
    }
}
