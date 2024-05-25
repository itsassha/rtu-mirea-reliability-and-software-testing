import org.example.CashBackCounting;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashBackServiceTest {

    @Test
    public void shouldCalculateForAmount900AndGetExtra100() {
        CashBackCounting service = new CashBackCounting();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeZeroForAmount1000() {
        CashBackCounting service = new CashBackCounting();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}
