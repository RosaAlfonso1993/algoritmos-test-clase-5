package com.redbee.clase5.ejercicios;


public class Calculator {
    public static Integer calcular(String s) {
        Integer value = 0;
        if(s != null){
            if(s.length() == 0){
                value = 0;
            }else if(s.length() == 1){
                value = Integer.parseInt(s);
            }
            else{
                value = calculateMathematicalOperation(s);

            }
        }
        return value;
    }

    private static Integer calculateMathematicalOperation(String s) {
        Integer value;
        Integer firstValue = Character.getNumericValue(s.charAt(0));
        Integer secondValue = Character.getNumericValue(s.charAt(2));
        if(s.charAt(1) == '+'){
            value = value = firstValue + secondValue;
        }else {
            value = value = firstValue - secondValue;
        }
        return value;
    }
}
