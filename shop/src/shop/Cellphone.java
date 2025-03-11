package shop;

public class Cellphone extends Product {

    private String carrier;

    public Cellphone(String pname, int price, String carrier) {
        super(pname, price);
        this.carrier = carrier;
    }

    @Override
    public void printExtra() {
        System.out.println("통신사 : " + this.carrier);
    }

}
