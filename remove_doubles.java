package achievers;

import java.util.Scanner;

public class remove_doubles {
	
	static String removeUtil(String str, char last_removed) 
    { 
		int n=str.length();
         if ( n== 0 || n == 1) 
               return str; 

         
           if (str.charAt(0) == str.charAt(1)) 
           { 
               last_removed = str.charAt(0); 
               while (str.length() > 1 && str.charAt(0) == str.charAt(1)) 
                     str = str.substring(1, str.length()); 
               str = str.substring(1, str.length()); 
               return removeUtil(str, last_removed);  
           } 

          
           String rem_str = removeUtil(str.substring(1,str.length()), last_removed); 

           if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)) 
           { 
              last_removed = str.charAt(0); 
              return rem_str.substring(1,rem_str.length()); // Remove first character 
           }  


           if (rem_str.length() == 0 && last_removed == str.charAt(0)) 
               return rem_str; 

           return (str.charAt(0) + rem_str); 
    } 
 
    static String remove(String str)   
    { 
           char last_removed = '\0'; 
           return removeUtil(str, last_removed);        
    } 
	
	public static void main(String[] args) {
		
		remove_doubles obj=new remove_doubles();
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println(str);
		
		String s=obj.remove(str);
		System.out.println(s);
	}

}
