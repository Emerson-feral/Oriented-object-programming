public class Scholarship extends Student {
    
    private Float scholarship;

    public void renewScholarship(){
        System.out.println("The scholarship of " + this.getName() + " was renewed");
    }

    @Override
    public void monthlyPay(){
        System.out.println(this.getName() + " is a scholarship holder");
    }


    public Float getScholarship() {
        return this.scholarship;
    }

    public void setScholarship(Float scholarship) {
        this.scholarship = scholarship;
    }

}
