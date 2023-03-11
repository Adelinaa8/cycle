
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServieTest {

    @Test

    public void testService() {
        SQRService service = new SQRService();
        int expected = 3;
        int result = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testServiceNo() {
        SQRService service = new SQRService();
        int expected = 0;
        int result = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, result);
    }
}
