package api.string;

public class StringEx1 {
    public static void main(String[] args) {

        String str1 = new String("hi");
        String str4 = new String("hi");
        String str2 = "hi";
        String str3 = "hi";
        char[] chArr = { 'H', 'e', 'l', 'l', 'o' };
        String str5 = new String(chArr);
        System.out.println("str5" + str5);

        System.out.println(str1 == str4);
        System.out.println(str2 == str3);

        // 문자열 비교 : equals()
        System.out.println(str1.equals(str3));

        // 빈 문자열
        str1 = "";
        System.out.println(str1.length());
        str2 = null;
        System.out.println(str2.length());
    }
}
