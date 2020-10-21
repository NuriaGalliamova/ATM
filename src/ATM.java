public class ATM {
    private int moneyAmount;
    private int moneyATM = 1_000_000;

    public ATM(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public int moneyInput(int cashAdd) {
        moneyAmount = moneyAmount + cashAdd;
        return moneyAmount;
    }

    public int moneyWithdrawal(int cashWithdraw) {
        if (cashWithdraw > moneyATM) {
            cashWithdraw = 0;
            return cashWithdraw;
        }
        moneyAmount = moneyAmount - cashWithdraw;
        return moneyAmount;
    }

}



