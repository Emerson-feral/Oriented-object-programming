public class Book implements Ipublication {
    
    private String title;
    private String author;
    private Integer totalPages;
    private Integer atualPage;
    private Boolean opened;
    private People reader;

    public Book(
        String title,String author,Integer totalPages,People reader){

        this.setTitle(title); 
        this.setAuthor(author);
        this.setTotalPages(totalPages);
        this.setAtualPage(0);
        this.setOpened(false);
        this.setReader(reader);
    }

   
    public String details() {
        return "Title: " + this.title + "\nAuthor: " + this.author + 
        "\nTotal pages: " + this.totalPages + "\nAtual page: " + this.atualPage +
        "\nOpened: " + this.opened + "\nReader: " + this.reader.getName() + ", " + this.reader.getAge() + " ," + this.reader.getGender();
    }

    @Override
    public void open() {
        this.setOpened(true);
        
    }

    @Override
    public void close() {
        this.setOpened(false);
    }

    @Override
    public void browse(Integer page) {
        if(page > this.getTotalPages() || page < 0){
            System.out.println("Your book dont have " + page + " page");
        }else{
            this.setAtualPage(page);
        }
        
    }

    @Override
    public void nextPage() {
        this.setAtualPage(this.getAtualPage() + 1);
    }

    @Override
    public void previousPage() {
        this.setAtualPage(this.getAtualPage() - 1);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getAtualPage() {
        return atualPage;
    }

    public void setAtualPage(Integer atualPage) {
        this.atualPage = atualPage;
    }

    public Boolean getOpened() {
        return opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public People getReader() {
        return reader;
    }

    public void setReader(People reader) {
        this.reader = reader;
    }
}
