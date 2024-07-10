package operators;

public class Operators {
    public static void main(String[] args){
        System.out.println("Operators ....");
        int x= 7;
        int y = 6;
        int z = 2;

        System.out.println("x + y = "+ (x+y));
        System.out.println("x - y = "+ (x-y));
        System.out.println("x * y = "+ (x*y));
        System.out.println("x / y = "+ (x/y));
        System.out.println("x % y = "+ (x%y));
        x++;
        System.out.println("x incremented "+ (x));
        y--;
        System.out.println("y decremented "+ (y));
        System.out.println("x is equalto y = "+ (x==y));
        System.out.println("x is not equal to y = "+ (x!=y));
        System.out.println("x greater than y = "+ (x>y));
        System.out.println("x less than y = "+ (x<y));
        System.out.println("x greater than y or y greater than z = "+ (x>y|| y>z));
        System.out.println("x less than y and y greater than z  = "+ (x<y&& y>z));

        // ?: tenary
        // instanceof class/class

        if(x>y){
            //
        }else {
            //
        }

        switch (x){
            case 1:     System.out.println("x = 1 ....");
                        break;
            case 2:     System.out.println("x = 2 ....");
                        break;
            default:    System.out.println("no switch");
                        break;
        }

        while(z<x){
            System.out.println(z);
            z++;
        }

        for(int i=0; i<z; i++){
            System.out.println("for loop");
        }

        int[] numbs = {100,200, 300};
        for(int i: numbs){
            System.out.println("list for"+ i);
        }

        //with label
        search:
        for(int i: numbs){
            if(i==200){
                break search;
            }
            System.out.println("list for"+ i);
        }

        
    }
}
