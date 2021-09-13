public class Student extends People {
    
    private String registration;
    private String course;

    public void cancelRegister(){
        System.out.println("Registration cancelled");
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
