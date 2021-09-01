package service;

public class BankAccount {
    
    public Integer accountNumber;
    protected String typeAccount;
    private String owner;
    private Float accountBalance;
    private Boolean status;

    public void currentState(){
        System.out.println("-----------------------------------");
        System.out.println("Account: " + this.getAccountNumber());
        System.out.println("Account type: " + this.getTypeAccount());
        System.out.println("Owner: " + this.getOwner());
        System.out.println("Balance: " + this.getAccountBalance());
        System.out.println("Status: " + this.getStatus());
    }

    public BankAccount(){
        this.setAccountBalance(0f);
        this.setStatus(false);
    }
    
    public void openAccount(String typeAccount){
        this.setTypeAccount(typeAccount);
        this.setStatus(true);
        if(typeAccount == "CC"){
            this.setAccountBalance(50f);
        }else if(typeAccount == "CP"){
            this.setAccountBalance(150f);
        }
        System.out.println("Account successfully opened");
    }

    public void closeAccount(){
        if(this.getAccountBalance() > 0){
            System.out.println("You cant close account that have money!");
        }else if(this.getAccountBalance() < 0){
            System.out.println("You have a debit");
        }else{
            this.setStatus(false);
            System.out.println("Account successfully closed");
        }
    }

    public void deposit(Float money){
        if( this.getStatus()){
            this.setAccountBalance(this.getAccountBalance() + money);
            System.out.println("Deposit made successfully in the " + this.getOwner() + " account");
        }else{
            System.out.println("Error");
        }
    }

    public void withdraw(Float money){
        if( this.getStatus()){
            if(this.getAccountBalance() >= money){
                this.setAccountBalance(this.getAccountBalance() - money);
                System.out.println("Withdraw made successfully in the " + this.getOwner() + " account");
            }else{
                System.out.println("Insufficient funds");
            }
        }else{
            System.out.println("You have to open the account");
        }
    }

    public void fee(){
        Float monthlyFee = 0f;
        if( this.getTypeAccount() == "CC"){
            monthlyFee = 12f;
        }else if( this.getTypeAccount() == "CP"){
            monthlyFee = 20f;
        }
        if( this.getStatus() == true){
           this.setAccountBalance(this.getAccountBalance() - monthlyFee);
           System.out.println("Monthly fee paid successfully by " + this.getOwner());
        }else{
            System.out.println("Impossible to pay");
        }
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
