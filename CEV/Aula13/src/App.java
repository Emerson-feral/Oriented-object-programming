public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();
        dog.react("Hello");
        dog.react("Go to the shower");
        dog.react(11, 45);
        dog.react(19, 00);
        dog.react(true);
        dog.react(false);
        dog.react(2, 12.5f);
        dog.react(17, 4.5f);
    }
}
