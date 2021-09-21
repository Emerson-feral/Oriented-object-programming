public class Mammal extends Animal {
    
    private String furColour;

    @Override
    public void walk() {
        System.out.println("Run");
        
    }

    @Override
    public void feed() {
        System.out.println("Breastfeed");
        
    }

    @Override
    public void sound() {
        System.out.println("Mammal sounds");
        
    }


    public String getFurColour() {
        return this.furColour;
    }

    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }

}
