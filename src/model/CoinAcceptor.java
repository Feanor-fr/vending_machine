package model;

import util.MoneyAcceptor;

public class CoinAcceptor implements MoneyAcceptor {
    private int amount;

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean acceptBalance() {
        amount += 25;
        System.out.println("Текущий баланс : " + amount);
        return true;
    }


}
