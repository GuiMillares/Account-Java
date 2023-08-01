package accountbank;

public class Account {

    private int acnumber;
    private String acholder;
    private double balance;

    public Account(int acnumber, String acholder) {
        this.acnumber = acnumber;
        this.acholder = acholder;
        this.balance = 0.0;
    }

    public Account(int acnumber, String acholder, double initialDeposit) {
        this.acnumber = acnumber;
        this.acholder = acholder;
        deposit(initialDeposit);
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value + 5.0;
    }

    public void updateAcholder(String newAcholder) {
        acholder = newAcholder;
        System.out.println("Titular da conta atualizado com sucesso.");
    }

    public double getBalance() {
        return balance;
    }

    public int getAcnumber() {
        return acnumber;
    }

    public void setAcnumber(int acnumber) {
        this.acnumber = acnumber;
    }

    public String getAcholder() {
        return acholder;
    }

    public void setAcholder(String acholder) {
        this.acholder = acholder;
    }

    public String toString() {
        return "Account "
                + acnumber
                + ", Holder: "
                + acholder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}