public class Pegasus extends Horse implements Flyer, Mythical {
    public static void main(String... args) {
        System.out.println("Start...");
        Pegasus myApp = new Pegasus();
        String identifyMyself = myApp.identifyMyself();
        System.out.println(identifyMyself);
        System.out.println("End...");
    }
}
