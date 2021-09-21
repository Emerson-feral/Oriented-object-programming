public class Fish extends Animal {
    
    private String scaleColour;

    @Override
    public void walk() {
        System.out.println("Swimming");
        
    }

    @Override
    public void feed() {
        System.out.println("Eating plankton");
        
    }

    @Override
    public void sound() {
        System.out.println("Fish sounds");
        
    }


    public String getScaleColour() {
        return this.scaleColour;
    }

    public void setScaleColour(String scaleColour) {
        this.scaleColour = scaleColour;
    }
}
