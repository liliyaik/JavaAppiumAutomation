import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int expectedValue = 14;
        int actualValue = mainClass.getLocalNumber();
        Assertions.assertEquals(expectedValue, actualValue, "Метод должен возвращать 14");
    }
}