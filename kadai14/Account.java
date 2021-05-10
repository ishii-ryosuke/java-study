package kadai14;

/**
 * 【14-1】
 * toString()とequals()をオーバーライドした銀行口座クラス、Accountクラス
 */
public class Account {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return "¥" + this.getBalance() + "(口座番号：" + this.getAccountNumber() + ")";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Account) {
            Account a = (Account) o;
            String number1 = this.getAccountNumber().trim();
            String number2 = a.getAccountNumber().trim();

            if (number1.equals(number2)) {
                return true;
            }
        }
        return false;
    }
}
