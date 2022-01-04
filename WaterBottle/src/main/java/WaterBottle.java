public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int takeDrink(){
        int drinkVolume = 10;
        int newVolume = this.volume - drinkVolume;
        return newVolume;
    }

    public static int emptyBottle(){
        int volume = 0;
        return volume;
    }
}
