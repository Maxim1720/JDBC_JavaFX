package ru.trankwilizator.jdbc_project.util;

public class NumberChecker {

    public static boolean isNumber(String text){
        boolean isNumber;
        try {
            Integer.parseInt(text);
            isNumber = true;
        }
        catch (NumberFormatException e){
            isNumber = false;
        }
        isNumber = !text.isEmpty() && isNumber;
        return isNumber;
    }

}
