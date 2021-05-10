package kadai14;

public class Main1 {
    public static void main(String[] args) {
        Account a = new Account();

        a.setAccountNumber("4649");
        a.setBalance(1592);

        System.out.println(a);

        Account aSub = new Account();

        aSub.setAccountNumber("4649");
        aSub.setBalance(500000);

        if (a.equals(aSub)) {
            System.out.println("同じ銀行口座です");
        } else {
            System.out.println("違う講座です");
        }
    }
}
