import org.example.CashBackCounting;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CashBackServiceTest {

    @Test
    public void shouldCalculateForAmount900AndGetExtra100() {
        CashBackCounting service = new CashBackCounting();
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }
}
