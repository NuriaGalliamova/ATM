public class Main {
    public static void main(String[] args) {
        ATM client1 = new ATM (50_000);
        System.out.println(client1.getMoneyAmount());
        System.out.println(client1.moneyInput(2_000));
        System.out.println(client1.moneyWithdrawal(3_000));


    }
}
