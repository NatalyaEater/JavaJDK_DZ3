package org.example;

public class Cals  {

    public <T extends Number, M extends Number> double sum (T itemsOne,M itemsTwo){
        var sum=itemsOne.doubleValue() + itemsTwo.doubleValue();
        return sum;
    }
    public <T extends Number, M extends Number> double sub (T itemsOne,M itemsTwo){
        var sub=itemsOne.doubleValue() - itemsTwo.doubleValue();
        return sub;
    }

    public <T extends Number, M extends Number> double del (T itemsOne,M itemsTwo ){
        var del1=itemsOne.doubleValue() / itemsTwo.doubleValue();
        return del1;
    }

    public <T extends Number, M extends Number> double multiplication (T itemsOne, M itemsTwo) {

        var mul=itemsOne.doubleValue() * itemsTwo.doubleValue();

        return mul;
    }
    public <T extends Number, M extends Number> String binCod(T itemsOne, M itemsTwo){

        return "Значение первого числа = "+Integer.toBinaryString((Integer) itemsOne)+"  ;  "+"\n"+
                "Значение второго числа = "+Integer.toBinaryString((Integer) itemsTwo);
    }
}
