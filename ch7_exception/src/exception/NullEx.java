package exception;

public class NullEx {
    public static void main(String[] args) {

        String str = null;
        // System.out.println(str.length());

        Account accounts[] = new Account[5];
        // 널 확인 후 처리하기 : NullPointerException 피하기
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.getAno());
            }
        }

        // if를 사용하지 않는다면 널포인터가 발생할 때 처리 필요
        try {
            for (Account account : accounts) {
                System.out.println(account.getAno());
            }
        } catch (NullPointerException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("입력 확인 해");
        }

    }
}
