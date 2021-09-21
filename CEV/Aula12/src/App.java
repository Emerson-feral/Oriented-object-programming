public class App {
    public static void main(String[] args) throws Exception {
        
        Mammal m = new Mammal();
        Repitile r = new Repitile();
        Fish f = new Fish();
        Bird b = new Bird();

        System.out.println(" ----- Mammals -----");
        m.feed();
        m.walk();
        m.sound();

        System.out.println(" --- Dog ---");
        Dog dog = new Dog();
        dog.sound();
        dog.walk();

        System.out.println("--- Kangaroo ---");
        Kangaroo kangaroo = new Kangaroo();
        kangaroo.sound();
        kangaroo.walk();
        System.out.println(" ----- Mammals -----");

    }
}
