import org.example.Adder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {
        @Test
        public void testAddition() {
            Adder add = new Adder();
            assertEquals(5, add.add(2, 3), "2 + 3 should equal 5");
        }

         @Test
         public void testAddition2() {
         Adder add = new Adder();
         assertEquals(-90, add.add(-100, 10), "-100 + 10 should equal -90");
        }
        @Test
        public void testAddition3() {
        Adder add = new Adder();
        assertEquals(30, add.add(20, 10), "20+ 10 should equal 30");
    }

}
