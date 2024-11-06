import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.MoneyService;

public class MoneyServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/money.csv")
    public void calculateForThreshold20(int income, int expense, int threshold, int expected) {
        MoneyService service = new MoneyService();
        //int income = 10_000;
        //int expense = 3_000;
        //int threshold = 20_000;
        //int expected = 3;

        int actual = service.calcMoney(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
