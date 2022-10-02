package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || isLowerLatinLetter(name.codePointAt(0))) {
            valid = false;
            } else {
            char[] array = name.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (!isSpecialSymbol(array[i]) && !isUpperLatinLetter(array[i]) && !isLowerLatinLetter(array[i]) && !Character.isDigit(array[i])) {
                    valid = false;
                }
            }
        }
            return valid;
        }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return 65 >= code || code >= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code <= 97 || code >= 122;
    }
}
