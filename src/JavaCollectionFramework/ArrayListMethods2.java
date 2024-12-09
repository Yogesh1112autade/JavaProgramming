package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods2 {
          public static void main(String[] args) {
			
        	  ArrayList al=new ArrayList();
        	  
        	  al.add("A");
        	  al.add("B");
        	  al.add("C");
        	  al.add("Y");
        	  al.add("X");
        	  al.add("Z");
        	  
        	  //addAll method used
        	  ArrayList Dupli_Al=new ArrayList();
        	  Dupli_Al.addAll(al);
        	  System.out.println(Dupli_Al);
        	  
        	  // sort Arraylist 
        	  Collections.sort(al);
        	  System.out.println("Sort ArrayList:");
        	  System.out.println(al);
        	  
        	  //print reverse order
        	  Collections.sort(al,Collections.reverseOrder());
        	  System.out.println("Reverse order String:");
        	  System.out.println(al);
		}
}
