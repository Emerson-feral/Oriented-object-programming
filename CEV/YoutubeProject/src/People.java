public abstract class People {
    
    protected String name;
    protected Integer age;
    protected String gender;
    protected Float experience;

    public People(String name,Integer age,String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setExperience(0f);
    }

    protected void gainExperience(){

    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Float getExperience() {
        return this.experience;
    }

    public void setExperience(Float experience) {
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", gender='" + getGender() + "'" +
            ", experience='" + getExperience() + "'" ;
    }



}
