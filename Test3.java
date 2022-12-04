import java.util.Arrays;

class MyClass {
    public static void main(String[] args) {
        
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        for (int i : array) 
        {
            if (i % 3 == 0)
            {
                System.out.println(i);
            }
        } 
    }
}