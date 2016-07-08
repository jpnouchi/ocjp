package com.jpn;

/**
 * Created by jpnouchi on 11/06/16.
 */
abstract class  A {
    int x = 5;

    public int getX() {
        return x;
    }
}
class B extends A {
    int x = 6;
    public int getX() {
        return x;
    }
}
class CovariantTest {
    public static void main(String[] args) {
        A o1 = new B();
        System.out.println(o1.x);
        System.out.println(o1.getX());
    }
}
