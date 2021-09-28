public class Vizualization {
    
    private Spectator spectator;
    private Video movie;


    public Vizualization(Spectator spectator, Video movie) {
        this.spectator = spectator;
        this.movie = movie;
        this.spectator.setTotalWatched(this.spectator.getTotalWatched() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public void evaluation(){
        this.movie.setEvaluation(5);
    }

    public void evaluation(Integer grade ){
        this.movie.setEvaluation(grade);
    }

    public void evaluation(Float percentage){
        Integer total = 0;
        if(percentage <= 20){
            total = 3;
        }else if(percentage <= 50){
            total =5;
        }else if( percentage <= 90){
            total = 8;
        }else{
            total = 10;
        }

        this.movie.setEvaluation(total);
    }

    public Spectator getSpectator() {
        return this.spectator;
    }

    public void setSpectator(Spectator spectator) {
        this.spectator = spectator;
    }

    public Video getMovie() {
        return this.movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }


    @Override
    public String toString() {
        return "{" +
            " Spectator='" + getSpectator() + "'" +
            "\nMovie='" + getMovie() + "'" +
            "}";
    }


    
}
