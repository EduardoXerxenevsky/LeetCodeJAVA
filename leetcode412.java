import java.util.Scanner;
import java.util.*;
class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fizzbuzz(n);
    }
    public static List<String> fizzBuzz(int n) {
        
List<String> a =new ArrayList<String>();        
for(int i = 0; i < n; i++){
            if(i/3 == 0 && i/5 == 0 )
            {
                a.add("FizzBuzz");
            }else if(i/3 == 0)
            {
                a.add("Fizz");
            }else if(i/5 == 0)
            {
                a.add("Buzz");
            }else
            {
                a.add(Integer.toString(i));
            }       
        }
        return a;
    }
 
    }
    
