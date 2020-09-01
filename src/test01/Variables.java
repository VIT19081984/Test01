package test01;

public class Variables {
    public static void main(String[] args) {
        byte b = 114;
        short s = 23458;
        int x = b + s;
        System.out.println("x равен " + x);

        int i = 234234345;
        int a = 536456465;
        int sum = a / (b+s) * (x - i);

        System.out.println();

        System.out.println("sum равен " + sum);

        System.out.println();

        int g = 345345345;
        long l = 456456546757L;

        System.out.println(l % g);
        System.out.println();
        char c = 'a';
        System.out.println(c);
        System.out.println();
        float f = 12.3435F;
        double d = 34.32434;
        if (f >= d) {
            System.out.println("учение тьма");
        } else { if (f <= d)
            System.out.println("учение свет");
        }

    }
}
