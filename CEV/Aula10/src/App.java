public class App {
    public static void main(String[] args) throws Exception {
        
        People people1 = new People();
        Student people2 = new Student();
        Teacher people3 = new Teacher();
        Employee people4 = new Employee();

        people1.setName("Emerson");
        people1.setAge(28);
        people1.setGender("Male");
        
        people2.setName("Gian");
        people2.setAge(30);
        people2.setGender("Male");
        
        people3.setName("Paola");
        people3.setAge(26);
        people3.setGender("Female");
        people3.setWage(2500.75f);
        
        people4.setName("Pedro");
        people4.setAge(50);
        people4.setGender("Male");

        System.out.println(people1.toString());
        System.out.println(people2.toString());
        System.out.println(people3.toString());
        System.out.println(people4.toString());
    }
}
