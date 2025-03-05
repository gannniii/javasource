package oop;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("110-11", "홍길동", 1000000);

        // 200,00만원 입금
        account.deposit(200000);
        System.out.println("현재 잔액 : " + account.balance);

        // 150,00만원 입금
        account.withdraw(150000);
        System.out.println("현재 잔액 : " + account.balance);

    }
}
