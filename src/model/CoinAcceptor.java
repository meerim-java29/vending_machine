package model;

public class CoinAcceptor implements MoneyAcceptor {
    private int balance;

    public CoinAcceptor(int balance) {
        this.balance = balance;
    }


    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
    }

    @Override
    public boolean pay(int price) {
        if(balance >= price) {
            balance -= price;
            return true;
        }
        return false;
    }
}
