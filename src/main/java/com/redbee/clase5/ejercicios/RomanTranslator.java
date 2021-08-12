package com.redbee.clase5.ejercicios;

import java.util.HashMap;

public class RomanTranslator {
 /*
* | Símbolo | Valor |
* | I       | 1     |
* | V       | 5     |
* | X       | 10    |
* | L       | 50    |
* | C       | 100   |
* | D       | 500   |
* | M       | 1000  |
  */
    private static HashMap<String, Integer> list = new HashMap<>();


    public static Integer romanToDecimal(String number) {
        fillHashMap();
        Integer value = 0;

            if(number.length() == 1){
                value += list.get(String.valueOf(number.charAt(0)));
            }
            /*if(number.length() == 2) {
                value += list.get(String.valueOf(number.charAt(0))) + list.get(String.valueOf(number.charAt(1)));
            }
            if(number.length() == 3){
                value = list.get(String.valueOf(number.charAt(0))) +  list.get(String.valueOf(number.charAt(1))) +list.get(String.valueOf(number.charAt(2)));
            }
            if(number.length() == 7){
                Integer IV = list.get(String.valueOf(number.charAt(6))) -  list.get(String.valueOf(number.charAt(5)));
                Integer XL = list.get(String.valueOf(number.charAt(4))) -  list.get(String.valueOf(number.charAt(3)));
                Integer CM = list.get(String.valueOf(number.charAt(2))) -  list.get(String.valueOf(number.charAt(1)));
                value = list.get(String.valueOf(number.charAt(0)))
                + CM + XL + IV;
            }
             */
            if(number.length() > 1){
                for(int i = number.length() -1; i >= 0; i--){
                    Integer valorI = list.get(String.valueOf(number.charAt(i)));
                    if(i < 1){
                        value += valorI;
                    }else {
                        Integer valorII = list.get(String.valueOf(number.charAt(i-1)));
                        if( valorII < valorI){
                            value += valorI - valorII;
                            i--;
                        }else {
                            value += valorI;
                        }
                    }

                }
            }


        return value;
    }

    private static void fillHashMap() {
        list.put("I",1);
        list.put("V",5);
        list.put("X",10);
        list.put("L",50);
        list.put("C",100);
        list.put("D",500);
        list.put("M",1000);
    }
}
