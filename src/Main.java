import model.CoinAcceptor;
import util.MoneyAcceptor;

public class Main {
    public static void main(String[] args) {
        MoneyAcceptor moneyAcceptor = new CoinAcceptor();
        moneyAcceptor.setAmount(100);
        AppRunner.run(moneyAcceptor);
    }
}