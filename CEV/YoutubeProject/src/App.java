public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[2];

        v[0] = new Video("OOP class");
        v[1] = new Video("Linkin Park - numb");

        Spectator spec0 = new Spectator("Emerson", 28, "Male", "Emer");
        Spectator spec1 = new Spectator("Gian", 31, "Male", "Hario");


        Vizualization vizu[] = new Vizualization[5];
        vizu[0] = new Vizualization(spec0, v[1]);
        vizu[0].evaluation();
        vizu[1] = new Vizualization(spec0, v[0]);
        vizu[0].evaluation(35.0f);
        System.out.println(vizu[0].toString());

    }
}
