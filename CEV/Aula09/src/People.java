public class People {
    
    private String name;
    private Integer age;
    private String gender;

    public People(String name, Integer age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public void birthday(){
        this.setAge(this.getAge() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
