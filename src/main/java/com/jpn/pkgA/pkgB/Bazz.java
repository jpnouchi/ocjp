package com.jpn.pkgA.pkgB;
import com.jpn.pkgA.*;
public class Bazz extends Foo{


    public static void asd(){
        System.out.println("bazz");
    }


    public static void main(String[] args) {
        Bazz f = new Bazz();
        System.out.print(" " + f.b);
        System.out.println(" " + f.c);
        Foo.asd();
        Bazz.asd();
    }
}