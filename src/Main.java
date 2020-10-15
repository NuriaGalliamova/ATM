public class Main {
    public static void main(String[] args) {
        ATM client1 = new ATM (50_000, 10_000, 20_000);
        System.out.println(client1.getMoneyAmount());
        System.out.println(client1.moneyInput());
        System.out.println(client1.moneyWithdrawal());


    }
}
