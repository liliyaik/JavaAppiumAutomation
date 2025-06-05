import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainClassTest {
    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        String r = mainClass.getClassString();

        assertTrue(r.contains("hello") || r.contains("Hello"),
                "Строка должна содержать hello");
    }
}