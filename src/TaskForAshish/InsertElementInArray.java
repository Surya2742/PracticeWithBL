package TaskForAshish;

import java.util.Arrays;

public class InsertElementInArray {

    public String[] insertElement(int index, String value, String[] array) {
        String[] newArray = new String[array.length + 1];
        int i;
        if (index <= array.length && index >= 0) {
            for (i = 0; i <= array.length; i++) {
                if (i < index)
                    newArray[i] = array[i];
                else if (i == index)
                    newArray[i] = value;
                else
                    newArray[i] = array[i - 1];
            }
        }
        else {
            System.out.println("Index is beyond the array limit.");
            return null;
        }
        return newArray;
    }

    public static void main(String[] args) {
        String[] array = {"Ajay", "Abhay", "Raghav", "Mahesh"};
        System.out.println(Arrays.toString(array));
        InsertElementInArray ieia = new InsertElementInArray();
        array = ieia.insertElement(5, "Abhilasha", array);
        System.out.println(Arrays.toString(array));
    }
}
