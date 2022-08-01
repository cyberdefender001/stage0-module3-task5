package lang.print.gaps.task5;

public class TimeConvertor {
    public static void convert(float minutes) {
        int seconds = minutes * 60;
        System.out.println(seconds);
    }
    public static void main(String[] args) {
        convert(3);
    }
}
