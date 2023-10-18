package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("проверка класса Cals \n");


        Cals cals = new Cals();
        System.out.println(cals.sum(4, 4.4));
        System.out.println(cals.sub(5.5, 5));
        System.out.println(cals.del(3, 3.33));
        System.out.println(cals.multiplication(1.1, 1));
        System.out.println(cals.binCod(7, 2)+"\n");

        System.out.println("проверка класса Pair \n");

        Pair pair = new Pair(7.2, 22);
        System.out.println(pair.toString()+"\n");

        System.out.println("проверка метода compareArrays\n");


        Arrays arrays = new Arrays();
        Integer[] arrOne= {2,3,4};
        Double[] arrTwo= {5.4,3.7,1.2};
        System.out.println(arrays.compareArrays(arrOne, arrTwo));
    }
}