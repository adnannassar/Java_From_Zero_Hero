package Grundlagen.WrapperKlass;

public class WrapperKlass {
    public static void main(String[] args) {
        float x = 10.10123f;
        float y = 10.10123f;
        int tz = 100;
        // int, byte, long short  %d
        // float , double %f
        // char %c
        // String %s
        String result = String.format("%f  %.1f %d", x, y, tz );
        System.out.printf(result);


    }
}
