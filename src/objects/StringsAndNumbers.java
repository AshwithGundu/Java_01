/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;
import java.util.Random;
/**
 *
 * @author Ashwith Gundu
 */
public class StringsAndNumbers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1="   Why";
        String string2=" choose ";
        String string3="   Northwest  ";
        String string4="among";
        String string5=" other     ";
        String string6=" Universities ";     
        System.out.println("\n******** String Class ********\n");
        System.out.print("The length of the concatenated string is: ");
        int s;
        s = string1. concat(string2). concat(string3). concat(string4). 
                concat(string5). concat(string6).length();
        System.out.println(s);      
        System.out.println("Whole sentence: "+string1.trim()+" "+string2.trim()+
                " "+string3.trim()+" "+string4.trim()+" "+string5.trim()
                +" "+string6.trim()+"?");    
       String ss;
        ss = (string1.trim()+" "+string2.trim()+" "+string3.trim()+" "
                +string4.trim()+" "+string5.trim()+" "+string6.trim());
        System.out.println("The length of the trimmed string: " +ss.length());    
       String sss=ss.substring(ss.indexOf("U"),ss.indexOf("U")+string6.trim().length());
        System.out.println("Index of first 'i' in Universities is: "+sss.indexOf("i")); 
        String a="computer Applied science Applied Computer science"
        +"science Applied computer Appleid computer Science Applied computer" 
        +" Applied";
         System.out.println("The first occurrence of word Computer is: "+a.indexOf("Computer"));   
         System.out.print("String of strings: "+string3.trim()+" is one "+string4+" the "+string6.trim()+
                 " which provides ");  
            System.out.print((a.substring(a.indexOf("Applied C"), 
                    a.indexOf(" ",a.indexOf(" ",a.indexOf("C"))))));
         System.out.println(" "+a.substring(a.indexOf("S"),a.indexOf(" ",a.indexOf("S"))));
              
          System.out.println("\n******** Math Class ********\n");        
         int value1=27,value2=4;
         System.out.println("27 power 4 is: " + Math.pow(value1, value2));
         double myNumber = 43.35;
         double b,c,d,e,f,aaa,aa,bb;
         c =  (Math.cos(value1));
          d=Math.round(1/c);
        System.out.println("Secant of 27 is: "+Math.round(d));
         b = Math.sqrt(myNumber);
         System.out.println("Square root of 43.35 is: "+b);
         e= Math.ceil(myNumber);
         System.out.println("Ceil Value of 43.35 is: "+e);
         f= Math.floor(myNumber);
         System.out.println("Floor value is: "+f);
        int  myNumber1=30, myNumber2=60;
        System.out.println("Cos(30)-rounded: "+Math.round(Math.cos(myNumber1)));
        System.out.println("Cos(60)-rounded: "+Math.round(Math.cos(myNumber2)));
        System.out.println("Tan(30)-rounded: "+Math.round(Math.tan(myNumber1)));       
        System.out.println("Tan(60)-rounded: "+Math.round(Math.tan(myNumber2)));       
        aaa=Math.sin(value1);        
        aa=1/aaa;
         bb =  (Math.pow(3,2))/(Math.sqrt(Math.pow(4, 2)+5*3*2+3));
          System.out.println("Trigonometry: "+(Math.ceil(aa*bb)));   
          System.out.println("\n******** Random Class ********\n");
          System.out.println("**Without Seed value**\n");
        Random r = new Random();
          System.out.println("First Random value:"+r.nextInt(300));
          System.out.println("Second Random value:"+r.nextInt(300));
          System.out.println("Third Random value:"+r.nextInt(300));
          System.out.println("Fourth Random value:"+r.nextInt(300));
          System.out.println("Fifth Random value:"+r.nextInt());
          System.out.println("Sixth Random value:"+r.nextInt());
          System.out.println("Seventh Random value:"+r.nextInt());
          System.out.println("No, the output is changing.");
          System.out.println("\n**With Seed value**\n");
          Random rs = new Random(20L);
        System.out.println("First Random value:"+rs.nextInt(300));
         System.out.println("Second Random value:"+rs.nextInt(300));
        System.out.println("Third Random value:"+rs.nextInt(300));
        System.out.println("Fourth Random value:"+rs.nextInt(300));
        System.out.println("Fifth Random value:"+rs.nextInt());
        System.out.println("Sixth Random value:"+rs.nextInt());
        System.out.println("Seventh Random value:"+rs.nextInt());
        System.out.println("Yes, the values are constant.");        
        System.out.println("The values of seed are constant and without seed are varying.");               
    }   
}
