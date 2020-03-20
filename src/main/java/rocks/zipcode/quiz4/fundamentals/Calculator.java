package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value*value;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] result = value;
        for (int i = 0; i < result.length; i++) {
            result[i] = squareRoot(value[i]);
        }
        return result;
    }

    public static Double[] squares(Double... values) {
        Double[] result = values;
        for (int i = 0; i < result.length; i++) {
            result[i] = square(values[i]);
        }
        return result;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
