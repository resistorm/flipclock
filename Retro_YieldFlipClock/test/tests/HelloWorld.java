/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;




/**
 *
 * @author daan-
 */
public class HelloWorld {

    public static void main(String[] penis) {
        System.out.println("Hello World");
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i += 5) {
            System.out.println("time = " + (System.currentTimeMillis() - time));
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
            }
        }

    }
}

