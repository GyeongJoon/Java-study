package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "장경준";
        int hour = 15;

        System.out.println(name +"님 배송이 시작됩니다."+ hour +"시에 방문 예정입니다.");
        System.out.println(name +"님, 배송이 완료되었습니다.");

        double score = 100;
        char grade = 'A';
        name = "강백호";

        System.out.println(name+"님의 평균점수는 "+ score +"점입니다.");
        System.out.println("학점은 "+ grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; /* 소수점6자리수 까지 정확 */
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; /* +-1억 초과는 long 사용 */
        l = 1_000_000_000_000L;
        System.out.println(l);

        /*
        int, long 정수
        float, double 실수
        char 하나의 문자열로 표현
        String 여러의 문자열로 표현
        boolean 참과 거짓
         */
    }
}
