import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void RupeeObj1NotSameAsRupeeObj2() {
        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(10);

        assertNotSame(rupee1, rupee2);
    }

    @Test
    void RupeeObj1ValueEqualsRupeeObj2() {

        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(10);

        assertEquals(rupee1, rupee2);


    }

    @Test
    void RupeeObj1ValueNotEqualsRupeeObj2() {

        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(5);

        assertNotEquals(rupee1, rupee2);

    }
}
