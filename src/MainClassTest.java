import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainClassTest {
    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int r = mainClass.getClassNumber();

        assertTrue(r > 45, "Метод должен возвращать число больше 45");
    }
}