public class App {
    public static void main(String[] args) throws Exception {
        
        People[] people = new People[3];
        Book[] book = new Book[3];

        people[0] = new People("Emerson", 28, "Male");
        people[1] = new People("Paola", 26, "Female");
        people[2] = new People("Gian", 31, "Male");

        book[0] = new Book("Harry Potter", "J.K Rowling", 300, people[1]);
        book[1] = new Book("Vagabond", "Takehiko Inoue", 500, people[0]);
        book[2] = new Book("20th Century Boys", "Naoki Urasawa", 200, people[2]);

        book[1].open();
        book[1].browse(100);
        book[1].nextPage();
        System.out.println(book[1].details());
    }
}
