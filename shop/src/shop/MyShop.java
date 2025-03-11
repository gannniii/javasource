package shop;

import java.util.Scanner;

import extend.Tv;

public class MyShop implements IShop {

    private String title;

    // 고객 5명 저장 가능한 배열 생성
    private User[] users = new User[5];

    // 제품 10개 저장 가능한 배열 생성
    Product[] products = new Product[10];

    // cart (제품 저장 가능한 배열)
    Product[] cart = new Product[10];

    Scanner sc = new Scanner(System.in);

    // strat() 에서 선택된 유저 보관 변수
    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void getUser() {
        // 2명의 유저 생성 후 저장
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);
    }

    @Override
    public void getProduct() {
        // 5개 제품 생성 후 배열 객체에 담기(tv 2개, cellphone 3개)
        products[0] = new Cellphone("갤럭시1", 1000000, "sk");
        products[1] = new Cellphone("아이폰1", 2000000, "lg");
        products[2] = new TV("삼성1", 3000000, "4k");
        products[3] = new TV("엘지1", 4000000, "4k");
        products[4] = new Cellphone("아이폰2", 5000000, "kt");
    }

    @Override
    public void start() {
        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("===================================");
        int i = 0;
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d] %s(%s)\n", i++, user.getName(), user.getPayType());
            }
        }
        System.out.println("[X] 종료");
        System.out.println("===================================");
        System.out.println("선택 : "); // 0 or 1 or X

        String input = sc.nextLine();
        switch (input) {
            case "x":
            case "X":
                System.exit(0);
                break;
            case "0":
            case "1":
                // 사용자가 선택한 유저 정보 담기(check() 메소드 필요)
                selUser = input;
                productList();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }
    }

    public void productList() {
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("===================================");
        int i = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d]", i++);
                product.printDetail();
            }

        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("===================================");
        System.out.println("선택 : ");

        // 0~4 or h or c
        String input = sc.nextLine();

        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // cart 배열에 선택한 제품 담기
                for (int j = 0; j < cart.length; j++) {
                    // cart 빈 곳 찾기
                    if (cart[j] == null) {
                        // 사용자가 선택한 제품 담기
                        cart[j] = products[Integer.parseInt(input)];
                        break;
                    }
                }

                productList();
                break;
            case "h":
                start();
                break;
            case "c":
                checkout();
                break;
            default:
                break;
        }

    }

    public void checkout() {
        System.out.println(title + " : " + users[Integer.parseInt(selUser)].getName() + "체크아웃");
        System.out.println("===================================");
        int i = 0, sum = 0;
        for (Product product : cart)
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();

            }
        System.out.println("결제 방법 : " + users[Integer.parseInt(selUser)].getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("===================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.println("선택 : ");

        String input = sc.nextLine();
        switch (input) {
            case "p":
                productList();
                break;
            case "q":
                System.exit(0);
            default:
                break;
        }
    }

}
