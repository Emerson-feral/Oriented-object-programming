public class Pen {
    String model;
    String color;
    float tip;
    int charge;
    boolean capped;

    void status(){
        System.out.println("The pen color is: " + this.color);
        System.out.println("The pen tip is: " + this.tip);
    }

    void draw(){
        if(this.capped == true){
            System.out.println("Error!");
        }else{
            System.out.println("Drawing");
        }
    }

    void cap(){
        this.capped = true;
    }
    
    void uncapping(){
        this.capped = false;
    }
}
