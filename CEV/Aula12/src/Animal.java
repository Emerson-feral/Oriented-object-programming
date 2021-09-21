public abstract class Animal {
    private Float weight;
    private Integer age;
    private Integer members;

    public abstract void walk();
    public abstract void feed();
    public abstract void sound();


    public Float getWeight() {
        return this.weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMembers() {
        return this.members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

}
