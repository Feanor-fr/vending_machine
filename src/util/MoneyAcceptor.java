package util;

public interface MoneyAcceptor {
    int getAmount();
    void setAmount(int amount);
    boolean acceptBalance();
}
