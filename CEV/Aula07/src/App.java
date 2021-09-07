public class App {
    public static void main(String[] args) throws Exception {
       Fighter[] fighters = new Fighter[5];
       fighters[0] = new Fighter("Gian", "France", 31, 1.75, 68.9, 11, 3, 1);
       fighters[1] = new Fighter("Emerson", "Brazil", 29, 1.68, 57.8, 14, 2, 3);
       fighters[2] = new Fighter("Max", "EUA", 35, 1.65, 80.9, 12, 2, 1);
       fighters[3] = new Fighter("Nakamura", "Japan", 28, 1.93, 81.6, 13, 0, 2);
       fighters[4] = new Fighter("Josep", "Italy", 40, 1.70, 100.5, 20, 10, 5);

       Fight ufc = new Fight();

       ufc.matchmaking(fighters[0], fighters[1]);
       ufc.combat();
       fighters[0].status();
       fighters[1].status();
    }
}
