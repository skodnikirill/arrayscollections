/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tya.arraysandcollection;

import java.util.ArrayList;
import java.util.List;
import org.tya.arraysandcollection.entity.Bird;
import org.tya.arraysandcollection.entity.IAnimal;
import org.tya.arraysandcollection.entity.Snake;

/**
 *
 * @author student
 */
public class ArraysAndCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int[] x = new int[10];
        x[0] = 2;
        x[4] = 5;
        x[9] = 10;
        
        int[] y = new int[12];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
        
        x = null;
        
        for (int currentY : y) {
            System.out.println(currentY);
        }*/
        
        /*for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }*/
        /*for (int currentX : x) {
            System.out.println(currentX);
        }*/
        
        /*int[][] tab = new int[11][11];
        for (int i = 0; i < tab.length; i++) {
            
            tab[i][0] = i;
            tab[0][i] = i;
            //System.out.println(i);
            //System.out.printf("i = %d; val = %s\n", i, tab[i]);
            //System.out.printf("i = %d; val = %s\n", i, tab[i][0]);
            for (int j = 0; j < tab[i].length; j++) {
                //System.out.printf("i = %d; j = %d; val = %s\n", i, j, tab[i][j]);
                if (i != 0 && j != 0) {
                    tab[i][j] = i*j;
                }
               
            }
        }
        
        for (int i = 0; i < tab.length; i++) {
            //System.out.println(i);
            //System.out.printf("i = %d; val = %s\n", i, tab[i]);
            //System.out.printf("i = %d; val = %s\n", i, tab[i][0]);
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%5d", tab[i][j]);
            }
            System.out.println();
        }*/
        
        /*List numbers = new ArrayList();
        numbers.add(2);
        numbers.add(5);
        numbers.add("asd");
        //System.out.println(numbers.get(0));
        
        //Integer x1 = new Integer(2);
        //int x2 = 5;
        
        for (Object number : numbers) {
            //System.out.println((int)number);
            System.out.println(number);
        }
        
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(7);
        numbers2.add(8);
        //numbers2.add("asd");
        
        for (Object number : numbers2) {
            System.out.println(number);
        }*/
        
        //Snake snake = new Snake();
        //Bird bird = new Bird();
        
        IAnimal animal = new Snake();
        IAnimal animal2 = new Bird();
        
        List<IAnimal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);
        
        for (IAnimal animal1 : animals) {
            animal1.go();
        }
    }
    
}
