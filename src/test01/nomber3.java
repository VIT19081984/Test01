package test01;

public class nomber3 {
    public static void main(String[] args) {
        int temp = 13;

        if (temp < 10) {
            System.out.println("jacket");
        } else  if (temp > 10) if (temp < 15)
            for (temp = 10; temp <= 15; temp++) {
                System.out.println("windbreaker");
        } else  if (temp > 16) if (temp < 20)
            for (temp = 16; temp <= 20; temp++) {
            System.out.println("sweater");
        } else if (temp > 21) if (temp < 30)
            for (temp = 21; temp <= 30; temp++) {
            System.out.println("undershirt");
        } else if (temp > 30) {
            System.out.println("nothing");
        }
    }
}
