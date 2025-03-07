package extend;

public class CheckingTrafficAccount extends CheckingAccount {

    private boolean hasTrafficCard;

    public CheckingTrafficAccount(String ano, String owner, long balance, String cardNo, boolean hasTrafficCard) {
        super(ano, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    }

    // 교통비 지불
    long payTrafficCard(String cardNo, int amount) throws Exception {
        // 교통카드 기능이 있다면 교통비 지불함
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능 없음");
        }
        // 카드번호, 잔액 확인 후 지불
        // long balance = pay(cardNo, amount);
        // return balance;
        return pay(cardNo, amount);
    }

}
