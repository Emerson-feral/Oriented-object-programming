public class Pen {
    public String model;
    public String color;
    private float tip;
    protected int charge;
    private boolean capped;

    public void status(){
        System.out.println("The pen color is: " + this.color);
        System.out.println("The pen tip is: " + this.tip);
        System.out.println("The pen charge is: " + this.charge);
    }

    public void draw(){
        if(this.capped == true){
            System.out.println("Error!");
        }else{
            System.out.println("Drawing");
        }
    }

    public void cap(){
        //Only the own class can modify private attributes
        this.capped = true;
    }
    
    public void uncapping(){
        this.capped = false;
    }
}
