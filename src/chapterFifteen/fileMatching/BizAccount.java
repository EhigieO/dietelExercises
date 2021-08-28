package chapterFifteen.fileMatching;

public class BizAccount {
    TransactionRecord transRecord = new TransactionRecord();
    private String firstName;
    private String lastName;
    private double balance;
    private int accNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setBalance(Double amount){
        this.balance = amount;
    }

    public Double getBalance() {
        return balance;
    }

    public void combine(TransactionRecord transRecord) {
        if(transRecord.getAccountNumber() == accNumber){
            this.balance += transRecord.getTransAmount();
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accNumber;
    }
}
