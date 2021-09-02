public class App {
    public static void main(String[] args) throws Exception {
        RemoteControll controll1 = new RemoteControll();

        controll1.on();
        controll1.moreVolume();
        controll1.play();
        controll1.openMenu();
    }
}
