public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    @Schedule(dayOfMonth="last")
    @Schedule(dayOfWeek="Fri", hour=23)
    public void doPeriodicCleanup() {
        System.out.println("doPeriodicCleanup!");
    }
}

