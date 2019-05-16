public class Bicycle {
    private String gear;
    private String cadence;
    private String speed;

    public Bicycle(int startCadence, int startSpeed, int startGear) {

    }

    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
                + " with a cadence of " + this.cadence +
                " and travelling at a speed of " + this.speed + ". ");
    }

}
