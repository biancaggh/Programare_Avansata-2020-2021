package lab12_compulsory;

import org.junit.Test;

public class App {

    @Test
    public static void m1() { }
    public static void m2() { }
    @Test public static void m3() {
        throw new RuntimeException("It is not good..");
    }
    public static void m4() { }
    @Test public static void m5() { }
    public static void m6() { }
    @Test public static void m7() {
        throw new RuntimeException("Im so sorry");
    }
    public static void m8() { }

}
