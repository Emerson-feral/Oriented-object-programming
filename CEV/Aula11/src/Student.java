public class Student extends People{
    
    private Integer registration;
    private String course;

    public void monthlyPay(){
        System.out.println(this.getName() + " Student debt payed");
    }


    public Integer getRegistration() {
        return this.registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
