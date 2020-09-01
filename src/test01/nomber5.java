package test01;

public class nomber5 {
    public static void main(String[] args) {
        int a = 5;
        int res = 1;
        int b = 998;
        int m = 998;
        for (int i = 0; i < b; i++) {
            res *= a;
            res %= m;
        }
        System.out.println(res);
    }
}
