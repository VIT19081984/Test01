package test01;

public class nomber4 {
    public static void main(String[] args) {
       double salary1 = 3.3;
       double salary2 = 7.9;
       double salary3 = 1.4;
       double biggest =  (salary1 > salary2) ? ((salary1 > salary3) ? salary1 : salary3) : ((salary2 > salary3) ? salary2 : salary3);
       double smallest = (salary1 < salary2) ? ((salary1 < salary3) ? salary1 : salary3) : ((salary2 < salary3) ? salary2 : salary3);
        System.out.println(biggest);
        System.out.println();
        System.out.println(smallest);

          }
}
