import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class MaxServiceTest {



    @Test
    public void maxTest() {
        MaxService service = new MaxService();
        int expected = 5;
        int actual = service.maxService(5,3);
        Assertions.assertEquals(expected, actual);

    }
}
