package Java_test.kadai14;

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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object instanceof Account) {
            Account account = (Account) object;
            String accountNumber1 = this.getAccountNumber().trim();
            String accountNumber2 = account.getAccountNumber().trim();

            if (accountNumber1.equals(accountNumber2)) {
                return true;
            }
        }
        return false;
    }
}
