
package myutils;
import static myutils.MyUtils.*;

public class Test {

  
    public static void main(String[] args) {
        
        System.out.println(inverteix("Hola"));//aloH
        System.out.println(inverteix(null));//null

        System.out.println(edat(7, 3, 1996));//26
        System.out.println(edat(7, 3, 1000));//-1
        System.out.println(edat(7, 3, 2060));//-2

        System.out.println(factorial(3));//6
        System.out.println(factorial(0));//1
        System.out.println(factorial(-5));//-1
       
    }
    
}
