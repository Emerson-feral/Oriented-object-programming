public class Pen {
    private String model;
    private float tip;
    private boolean capped;

    public Pen(String model, float tip){
        this.model = model;
        this.tip = tip;
        this.cap();
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public void cap(){
        this.capped = true;
    }

    public void uncapping(){
        this.capped = false;
    }

    public void status(){
        System.out.println("Pen specs:");
        System.out.println("Model: " + this.getModel());
        System.out.println("Tip: " + this.getTip());
        System.out.println("Cappped: " + this.capped);
    }
}
