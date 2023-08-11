package kyu8.grasshopperdebugsayhello.test;

import kyu8.grasshopperdebugsayhello.GrasshopperDebugSayHello;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GrasshopperDebugSayHelloTest {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                GrasshopperDebugSayHello.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                GrasshopperDebugSayHello.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                GrasshopperDebugSayHello.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                GrasshopperDebugSayHello.sayHello("Dr. McCoy"));
    }
}