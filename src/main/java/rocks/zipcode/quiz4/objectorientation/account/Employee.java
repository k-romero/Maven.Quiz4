package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{
    BankAccount bankAccount;
    Double nbOfHours;
    Double hourlyWage;

    public Employee() {
        bankAccount = new BankAccount();
        nbOfHours = 0.0;
        hourlyWage = 35.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        nbOfHours = 0.0;
        hourlyWage = 35.0;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        nbOfHours += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return nbOfHours;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage * nbOfHours;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
       return bankAccount.getBalance();
    }
}
