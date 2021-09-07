import java.util.Random;

public class Fight {
    
    private Fighter challenged;
    private Fighter challenger;
    private Integer rounds;
    private Boolean approved;

    public void matchmaking(Fighter f1, Fighter f2){
        if(f1.getCategory() == f2.getCategory() && f1 != f2){
            this.setApproved(true);
            this.setChallenged(f1);
            this.setChallenger(f2);
        }else{
            this.setApproved(false);
            this.setChallenged(null);
            this.setChallenger(null);
        }
    }

    public void combat(){
        if(this.getApproved()){
            this.challenged.introuce();
            this.challenger.introuce();
            Random random = new Random();
            Integer winner= random.nextInt(3);

            switch (winner) {
                case 0:
                    System.out.println("----------");
                    System.out.println("Draw");
                    this.challenged.drawFight();
                    this.challenger.drawFight();
                    break;
                case 1:
                    System.out.println("----------");
                    System.out.println(this.challenged.getName() + " Won");
                    this.challenged.winFight();
                    this.challenger.loseFight();
                    break;
                case 2:
                    System.out.println("----------");
                    System.out.println(this.challenger.getName() + " Won");
                    this.challenger.winFight();
                    this.challenged.loseFight();
                    break;
            }

        }else{
            System.out.println("The fight can't happen");
        }
    }

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

}
