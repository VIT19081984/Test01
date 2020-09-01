package test01;

public class nomber2 {
    public static void main(String[] args) {

        int r = 353; //r - радиус окружности
        double pi = 3.14;//pi - constant
        double s = pi * (r * r); //вычисляем площадь круга
        double l = 2 * pi * r;//вычисляем длину круга

        if (r < 0 ) {
            System.out.println("входные данные невалидны");
        } else {
            System.out.println("Площадь круга равна " + s);
            System.out.println();
            System.out.println("Длина круга равна " + l);

        }
    }
}
