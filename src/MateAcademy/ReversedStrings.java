package MateAcademy;

public class ReversedStrings {

    public static void main(String[] args) {
        String string = "qwer";
        System.out.println(solution(string));

    }

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();

    }

}
