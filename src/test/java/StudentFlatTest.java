import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    private StudentFlat studentFlat;

    @BeforeEach
    public void setUp(){
        studentFlat = new StudentFlat("myFlat",3,"15thMay2024",10,2);
    }

    @Test
    public void canCountNumberOfParties(){
        int expected = 10;
        long result = studentFlat.countNumberOfParties();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canThrowAnotherParty(){
         boolean result = studentFlat.throwAnotherParty(true);
         boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

}
