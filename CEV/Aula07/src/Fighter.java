public class Fighter {
    
    private String name;
    private String nationality;
    private Integer age;
    private double height;
    private double weight;
    private String category;
    private Integer victory;
    private Integer defeat;
    private Integer draw;

    public Fighter(
        String name,String nationality,Integer age,
        double height,double weight,Integer victory,
        Integer defeat,Integer draw
    ) {
        this.setName(name);
        this.setNationality(nationality);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.setVictory(victory);
        this.setDefeat(defeat);
        this.setDraw(draw);
    }

    public void introuce(){
        System.out.println("----------");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Nationatily: " + this.getNationality());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Victories: " + this.getVictory());
        System.out.println("Defeats: " + this.getDefeat());
        System.out.println("Draws: " + this.getDraw());
    }

    public void status(){
        System.out.println(this.getName());
        System.out.println("Weight class: " + this.getCategory());
        System.out.println(this.getVictory() + " Victories");
        System.out.println(this.getDefeat() + " Defeats");
        System.out.println(this.getDraw() + " Draws");
    }

    public void winFight(){
        this.setVictory(this.getVictory() + 1);
    }

    public void loseFight(){
        this.setDefeat(this.getDefeat() + 1);
    }

    public void drawFight(){
        this.setDraw(this.getDraw() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if(weight < 52.2){
            this.category = "Invalid";
        }else if(weight <= 70.3){
            this.category = "Lightweight";
        }else if(weight <= 83.9){
            this.category = "Middleweight";
        }else if(weight <= 120.2){
            this.category = "Heavyweight";
        }else{
            this.category = "Invalid";
        }
    }

    public Integer getVictory() {
        return victory;
    }

    public void setVictory(Integer victory) {
        this.victory = victory;
    }

    public Integer getDefeat() {
        return defeat;
    }

    public void setDefeat(Integer defeat) {
        this.defeat = defeat;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }
}
