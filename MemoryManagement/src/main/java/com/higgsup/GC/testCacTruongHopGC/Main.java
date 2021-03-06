package com.higgsup.GC.testCacTruongHopGC;/*
  By Chi Can Em  27-03-2018
 */

public class Main {
    public static void main(String[] args) {
        testCungMotMethod();
    }

    public static void testCungMotMethod() {
        Student student = new Student(1);
        student = null;

        Student student1 = new Student(2);
        student1 = null;

       /* Student student2 = new Student(3);
        student2 = null;*/


        System.gc();
    }

    public static void test2TestKhacMethod1() {
        test2TestKhacMethod1Path2();
        System.gc();
    }

    public static void test2TestKhacMethod1Path2() {
        Student student = new Student(1);
        Student student1 = new Student(2);
    }

    public static void testObjectDuocGanBangObjectKhac() {
        Student student = new Student(1);
        Student student1 = new Student(2);
        student = student1;
        System.gc();
    }

    public static void testHuyBoThamChieu() {
        Student student = new Student(1);
        System.gc();
        System.out.println("thu gom lần 1");
        student = null;
        System.gc();

    }

    public static void testTaoObjectNhungKhongThamChieu() {
        new Student(1);
        Runtime.getRuntime().gc();

    }

    public static void testNewRuntime() {
        new Student(1);
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
    }

    public static void testCheckMemory() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Student student = new Student(1);
        Runtime.getRuntime().gc();
        System.out.println(Runtime.getRuntime().freeMemory());;
        Student student2 = new Student(1);
        Runtime.getRuntime().gc();
        System.out.println(Runtime.getRuntime().freeMemory());;
        Student student3 = new Student(1);
        Runtime.getRuntime().gc();
        System.out.println(Runtime.getRuntime().freeMemory());



    }


}
