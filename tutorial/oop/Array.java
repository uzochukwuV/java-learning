package array;

// system arraycopy
// java.utils Array.copyOfRange

public class Array{
    public static void main(String[] args){
        int[] anArray = new int[10];
        int[] inArray = {
            100,200,300,400,500,600,700
        };
        System.out.println(inArray.length);
         System.out.println(inArray[0]);
           System.out.println(inArray.length);
        System.arraycopy(inArray, 0, anArray, 0, 7);

        int[] copyto = java.util.Arrays.copyOfRange(inArray, 0, 7);
        
        System.out.println(java.util.Arrays.toString(inArray));

        for(int item : copyto){
             System.out.println(item);
        }
    }
}