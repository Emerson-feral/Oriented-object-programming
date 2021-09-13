public class Teacher extends People {
    
    private String expertise;
    private Float salary;

    public void salatyRaise(Integer raise){
        this.setSalary(this.getSalary() + raise);
    }

    public String getExpertise() {
        return this.expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public Float getSalary() {
        return this.salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

}
