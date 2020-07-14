import java.util.*;
public class Main {
    public static void number_sor (int[] number_array){
        int temp;
        fo (int i = 0; i < number_array.length; i++){
            fo (int j = 0; j < number_array.length - i - 1; j++){
                i (number_array[j] > number_array[j + 1]){
                    temp = number_array[j];
                    number_array[j] = number_array[j + 1];
                    number_array[j + 1] = temp;
                }
            }
        }
    }
    
    private static int toOd (int Value)
    {
        int doubleValue = Value * 2;
        if (Value % 2 == 0)
        {
            return Value;
        }
        else
        {
            return doubleValue;
        }
    }
    public static void mai (String[] args) {
        int[] numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        for ( int i = 0; i < numberList.length; i++) {
            numberList[i] = toOd (numberList[i]);
        }
        
        number_sor (numberList);
        for ( int i = 0; i < numberList.length; i++) {
            System.out.printl (numberList[i]);
        }
    }
}
