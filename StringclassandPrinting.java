
//printing using system.out.println

package printing;

import java.util.*;

public class Printing {
    public static void main(String[] args) {
        
        /*int a=10;
        float b=12.55f;
        char c='A';
        String str="Hello";
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str);*/
        
        
        int x=10,y=20;
        System.out.println(x+y);
        System.out.println("Number is " +y);
        System.out.println(x+y+" sum");
        System.out.println("sum "+(x+y));
        System.out.println("sum of "+x+" and "+y+" is "+(x+y));
    }
    
}



//====================================================================


package printing1;

public class Printing1 {

    public static void main(String[] args) {
        int x=10;
        float y=12.56f;
        char z='A';
        String str="Java Program";
          
        System.out.printf("%3$s %2$f %1$d",x,y,str);
        //System.out.printf("Hello %d %f %c %s\n",x,y,z,str);
        //%o,%x,%e for float value
        
    }
    
}












