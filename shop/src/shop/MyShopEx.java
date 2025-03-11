package shop;

public class MyShopEx {
    public static void main(String[] args) {
        IShop shop = new MyShop();

        // 상점 이름 지정
        shop.setTitle("MyShop");

        // 고객 생성
        shop.getUser();

        // 제품 생성
        shop.getProduct();

        // 상점 시작
        shop.start();

    }
}
