package loop;

// 반복문 - for, while, do-while
// 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class WhileEx2 {
    public static void main(String[] args) {

        
        // for (int i = 1; i < 11; i++) {
        //     System.out.print(i + "   ");
        // }
        // System.out.println();


        int i = 1;
        while (i < 11) {
            System.out.print(i + "   ");
            i++;
        }
        System.out.println();




        // 10~1


        i = 10;
        while (i > 0) {
            
                System.out.print(i + "   ");
            
            i--;

        }
        System.out.println();


        

        // 짝수만 출력 1~10

        i = 1;
        while (i < 11) {
            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }
            i++;

        }
        System.out.println();




   

        i = 2;
        while (i < 11) {
            
                System.out.print(i + "   ");
            
            i+=2;

        }
        System.out.println();

    }
}
