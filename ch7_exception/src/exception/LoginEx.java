package exception;

public class LoginEx {
    public static void main(String[] args) {

        try {
            login("white", "1234");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void login(String id, String pwd) throws NotExitsIdException, WrongExitsIdException {
        if (!id.equals("blue")) {
            throw new NotExitsIdException("아이디가 존재하지 않습니다");

        }

        if (!pwd.equals("12345")) {
            throw new WrongExitsIdException("비밀번호가 존재하지 않습니다");

        }
    }
}
