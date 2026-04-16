package model;

public interface MoneyAcceptor {
        int getBalance();
        void addMoney(int amount);
        boolean pay(int price);

}

