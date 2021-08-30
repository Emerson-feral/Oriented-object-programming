public class App {
    public static void main(String[] args) throws Exception {
        Pen p1 = new Pen();
        p1.model = "Bic cristal";
        // Private  p1.tip = 0.5f; 
        p1.charge = 80; // Protected
        p1.cap();
        p1.status();
    }
}
