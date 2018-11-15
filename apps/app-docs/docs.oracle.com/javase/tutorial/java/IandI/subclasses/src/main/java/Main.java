// https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
public class Main {

    public static void main(String[] args) {
        int startHeight = 12;
        int startCadence = 14;
        int startSpeed = 10;
        int startGear = 20;
        MountainBike mountainBike = new MountainBike(startHeight,
                startCadence,
                startSpeed,
                startGear);
        mountainBike.setHeight(20);
        GggTestUtilities.println(mountainBike);
    }
}
