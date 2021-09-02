public class RemoteControll implements Icontroll {
    private int volume;
    private boolean on;
    private boolean play;

    public RemoteControll() {
        this.setVolume(50);
        this.setOn(false);
        this.setPlay(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getOn(){
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private boolean getPlay(){
        return play;
    }

    private void setPlay(boolean play) {
        this.play = play;
    }

    @Override
    public void on() {
        this.setOn(true);
        
    }

    @Override
    public void off() {
        this.setOn(false);
        
    }

    @Override
    public void openMenu() {
        System.out.println("--------- MENU ---------");
        System.out.println("Its on? " + this.getOn());
        System.out.println("Its playing? " + this.getPlay());
        System.out.print("Volume: " + this.getVolume() + " ");

        for(int i = 0 ; i < this.getVolume();i+=10){
            System.out.print("|");
            
        }
        
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing Menu...");
        
    }

    @Override
    public void moreVolume() {
        if(this.getOn()){
            this.setVolume(getVolume() + 5);
        }
        
    }

    @Override
    public void lessVolume() {
        if(this.getOn()){
            this.setVolume(getVolume() - 5);
        }
        
    }

    @Override
    public void muteOn() {
        if(this.getOn() && this. getVolume() > 0){
            this.setVolume(0);
        }
        
    }

    @Override
    public void muteOff() {
        if(this.getOn() && this.getVolume() == 0){
            this.setVolume(50);
        }
        
    }

    @Override
    public void play() {
        if (this.getOn() && !(this.getPlay())) {
            this.setPlay(true);
        }
        
    }

    @Override
    public void pause() {
        if(this.getOn() && this.getPlay()){
            this.setPlay(false);
        }
        
    }

}
