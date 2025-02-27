package condition;

// switch : 조건문 if ~ else if ~ else 대체

public class Switchtest3 {
    public static void main(String[] args) {
        String position = "과장";

        switch (position) {
            case "부장":
            
                System.out.println("700만원");
                break;
            case "과장":
           
                System.out.println("500만원");
                break;

            default:
            System.out.println("300 만원");
                break;
        }

    }
}
