import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle myWaterBottle;

    @Before
    public void before(){
        myWaterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100,myWaterBottle.getVolume());
    }
}
