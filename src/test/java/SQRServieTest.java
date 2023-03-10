
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServieTest {

    @Test

    public void testServiceWhenResultEqualsTwo() {
        SQRService service = new SQRService();
        int expected = 2;
        int result = service.calcSqrt(300, 500);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testServiceWhenResultEqualsFive() {
        SQRService service = new SQRService();
        int expected = 5;
        int result = service.calcSqrt(300, 500);
        Assertions.assertEquals(expected, result);
    }
}
