package kadai14;

public class Main1 {
    public static void main(String[] args) {
        Account account = new Account();

        account.setAccountNumber("4649");
        account.setBalance(1592);

        System.out.println(account);

        Account accountSub = new Account();

        accountSub.setAccountNumber("4649");
        accountSub.setBalance(500000);

        if (account.equals(accountSub)) {
            System.out.println("同じ銀行口座です");
        } else {
            System.out.println("違う講座です");
        }
    }
}
