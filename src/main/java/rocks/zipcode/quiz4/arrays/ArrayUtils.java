package rocks.zipcode.quiz4.arrays;
/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[(values.length-1)/2];
    }

    public static String[] removeMiddleElement(String[] values) {
       String[] result = new String[values.length-1];
       int counter = 0;
        for (int i = 0; i < values.length; i++) {
            if(!values[i].equals(getMiddleElement(values))){
                result[counter] = values[i];
                counter++;
            }
        }
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] result = new String[values.length-1];
        for (int i = 0; i < values.length-1; i++) {
            result[i] = values[i];
        }
        return result;
    }
}