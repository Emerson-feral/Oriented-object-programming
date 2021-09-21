public class Bird extends Animal {
    
    private String featherColour;

    @Override
    public void walk() {
        System.out.println("Flying");

    }

    @Override
    public void feed() {
        System.out.println("Eating seeds");
        
    }

    @Override
    public void sound() {
        System.out.println("Bird sounds");
        
    }

    public String getFeatherColour() {
        return this.featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }
}
