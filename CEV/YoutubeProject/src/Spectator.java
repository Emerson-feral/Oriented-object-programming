public class Spectator extends People {
    
    private String login;
    private Integer totalWatched;

    public void oneMoreVideoWatched(){

    }

    public Spectator(String name, Integer age, String gender,String login) {
        super(name, age, gender);
        this.setLogin(login);
        this.setTotalWatched(0);
    }


    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotalWatched() {
        return this.totalWatched;
    }

    public void setTotalWatched(Integer totalWatched) {
        this.totalWatched = totalWatched;
    }
    

    @Override
    public String toString() {
        return  super.toString()  + " login='" + getLogin() + "'" +
            ", totalWatched='" + getTotalWatched() + "'" +
            "}";
    }
    
}