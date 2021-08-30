public class App {
    public static void main(String[] args) throws Exception {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.tip = 0.5f;
        p1.capped = false;
        p1.status();
        p1.draw();

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.capped = true;
        p2.draw();
    }
}
