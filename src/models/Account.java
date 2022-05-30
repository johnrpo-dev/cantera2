package models;

public class Account {

    private int accountNumber;
    private boolean isActivated = false;

    public Account(int accountNumber, boolean isActivated) {
        this.accountNumber = accountNumber;
        this.isActivated = isActivated;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }


}
