public abstract class Animal {
    
    protected Float weight;
    protected Integer age;
    protected Integer members;

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
