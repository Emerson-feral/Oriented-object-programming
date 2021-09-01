import service.BankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccount people1 = new BankAccount();
        people1.setAccountNumber(1111);
        people1.setOwner("Emerson");
        people1.openAccount("CC");
        

        BankAccount people2 = new BankAccount();
        people2.setAccountNumber(2222);
        people2.setOwner("Mary");
        people2.openAccount("CP");
        
        people1.deposit(100f);
        people2.deposit(500f);
        people2.withdraw(300f);
        
        people1.currentState();
        people2.currentState();

    }
}
