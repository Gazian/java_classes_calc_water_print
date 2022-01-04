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

    @Test
    public void hasCorrectVolumeAfterDrink(){
        assertEquals(90,myWaterBottle.takeDrink());
    }

    @Test
    public void hasBeenEmptied(){
        assertEquals(0,WaterBottle.emptyBottle());
    }

    @Test
    public void hasBeenFilled(){
        assertEquals(100,WaterBottle.fillBottle());
    }
}
