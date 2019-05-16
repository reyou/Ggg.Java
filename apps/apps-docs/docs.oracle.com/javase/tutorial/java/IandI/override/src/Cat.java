public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        System.out.println("started");
        Cat myCat = new Cat();
        System.out.println("Cat myCat = new Cat();");
        Animal myAnimal = myCat;
        System.out.println("Animal myAnimal = myCat;");
        System.out.println("Animal.testClassMethod();");
        Animal.testClassMethod();
        System.out.println("myAnimal.testInstanceMethod();");
        myAnimal.testInstanceMethod();
        System.out.println("myAnimal.testClassMethod();");
        myAnimal.testClassMethod();
        System.out.println("Cat.testClassMethod();");
        Cat.testClassMethod();
        System.out.println("myCat.testClassMethod();");
        myCat.testClassMethod();
    }
}
