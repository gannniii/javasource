package oop;

public class GoodsStockEx {
    public static void main(String[] args) {
        // new GoodsStock() : default 생성자를 호출하면서 인스턴스 생성
        // GoodsStock goodsStock = new GoodsStock();

        // goodsStock.code = "p1013";
        // goodsStock.stockNum = 50;

        GoodsStock goodsStock = new GoodsStock("p1013", 50);

        System.out.println(goodsStock);

        // 판매
        goodsStock.subtractStock(5);
        // 현재 재고 수량 확인
        System.out.println(goodsStock);

        // 제품 입고 10
        goodsStock.addtractStock(10);
        System.out.println(goodsStock);
    }
}
