package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height1 = 115;
        String result1 = (120 > height1) ? "키가 " +height1+ "이므로 탑승 불가능입니다." : "키가 " +height1+ "이므로 탑승 가능입니다.";
        System.out.println(result1);


        int height2 = 121;
        String result2 = (height2 >= 120) ? "키가 " +height2+ "이므로 탑승 가능입니다." : "키가 " +height2+ "이므로 탑승 불가능입니다.";
        System.out.println(result2);



    }
}
