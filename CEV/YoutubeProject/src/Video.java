public class Video implements IvideoActions {

    private String title;
    private Integer evaluation;
    private Integer views;
    private Integer likes;
    private Boolean reproduce;

    public Video(String title){
        this.setTitle(title);
        this.evaluation = 1;
        this.setViews(0);
        this.setLikes(0);
        this.setReproduce(false);
    }
    
    @Override
    public void play() {
        this.setReproduce(true);
        
    }

    @Override
    public void pause() {
        this.setReproduce(false);
        
    }

    @Override
    public void like() {
        this.setLikes(this.getLikes() + 1);
        
    }
    

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEvaluation() {
        return this.evaluation;
    }

    public void setEvaluation(Integer evaluation) {
        Integer newEva;
        newEva = (Integer) ((this.evaluation + evaluation)/this.views);
        this.evaluation = newEva;
    }

    public Integer getViews() {
        return this.views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Boolean isReproduce() {
        return this.reproduce;
    }

    public Boolean getReproduce() {
        return this.reproduce;
    }

    public void setReproduce(Boolean reproduce) {
        this.reproduce = reproduce;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }


    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", evaluation='" + getEvaluation() + "'" +
            ", views='" + getViews() + "'" +
            ", likes='" + getLikes() + "'" +
            ", reproduce='" + isReproduce() + "'" +
            "}";
    }


}
