
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


// =====================================================================

package stringpractice;

public class StringPractice {

    public static void main(String[] args) {
        
        /*
        String str1="Java Program";
        System.out.println(str1);
        
        String str2=new String("JAVA");
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        //String str3=new String(c);
        String str3=new String(c,1,3);
        System.out.println(str3);
        
        byte b[]={65,66,67,68};
        //String str4=new String(b);
        String str4=new String(b,1,2);
        System.out.println(str4);
        */
        
        String str1="Java";
        //String str2="Java";
        String str2=new String("Java");
        System.out.println(str1==str2);
    }
    
}


//==================================================================


package stringpractice2;

public class StringPractice2 {

    public static void main(String[] args) {
        
        /*
        String str1="Mr. Shahrukh Khan";
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Shah" , 4));
        System.out.println(str1.endsWith("Khan"));
        System.out.println(str1.charAt(4));
        
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i));
        */
        
        String str1="www.udemy.co.in";
        System.out.println(str1.indexOf("."));
        System.out.println(str1.indexOf(".",4));
        System.out.println(str1.indexOf("udemy"));
        System.out.println(str1.lastIndexOf("."));
    }
    
}


//========================================================================



package stringpractice3;

public class StringPractice3 {

    public static void main(String[] args) {
        
        /*
        String str1="Pyramid";
        String str2="pyramid";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //System.out.println(str1==str2);
        */
        
        /*
        //String str1="pyramid";
        
        String str1="china wall";
        String str2=new String("china tall");
        
        //System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        */
        
        
        String str1="the great wall ";
        String str2="of china";
        System.out.println(str1.contains("wall"));
        System.out.println(str1.concat(str2));//System.out.println(str1 + str2);
        
    }
    
}




//============================================================================




package scstring;


public class Scstring {

    
    public static void main(String[] args) 
    {
      String str="programmer@gmail.com";
      //String str="programmer@hotmail.com";
      
      int i=str.indexOf("@");
      String uname=str.substring(0,i);
      String domain=str.substring(i+1, str.length());
      
      System.out.println("Username :"+uname);
      System.out.println("Domain :"+domain);
      
      int j=domain.indexOf(".");
      String name=domain.substring(0, j);
      System.out.println(name.equals("gmail"));
    }
    
}

//=================================================================================






















