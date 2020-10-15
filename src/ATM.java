public class ATM {
    private int moneyAmount;
    private int cashAdd;
    private int cashWithdraw;
    private int moneyATM = 1_000_000;

    public ATM(int moneyAmount, int cashAdd, int cashWithdraw) {
        this.moneyAmount = moneyAmount;
        this.cashAdd = cashAdd;
        this.cashWithdraw = cashWithdraw;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public int moneyInput() {
        moneyAmount = moneyAmount + cashAdd;
        return moneyAmount;
    }

    public int moneyWithdrawal() {
        if (cashWithdraw > moneyATM) {
            cashWithdraw = 0;
            return cashWithdraw;
        }
        moneyAmount = moneyAmount - cashWithdraw;
        return moneyAmount;
    }

}


