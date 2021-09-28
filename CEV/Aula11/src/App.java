public class App {
    public static void main(String[] args) throws Exception {
        
        Visitor visitor1 = new Visitor();
        visitor1.setName("Emerson");
        visitor1.setAge(28);
        visitor1.setGender("Male");
        
        System.out.println(visitor1.toString());

        Student student1 = new Student();
        student1.setName("Gian");
        student1.setRegistration(1111);
        student1.setCourse("Programming");
        student1.setAge(35);
        student1.setGender("Male");
        student1.monthlyPay();

        Scholarship scholarship1 = new Scholarship();
        scholarship1.setRegistration(1112);
        scholarship1.setName("Paola");
        scholarship1.setScholarship(12.5f);
        scholarship1.setGender("Female");
        scholarship1.monthlyPay();
        
        Technician technician1 = new Technician();
        technician1.setName("Josep");
        technician1.setProfessionalRegister(2222);
        technician1.practice();
    }
}
