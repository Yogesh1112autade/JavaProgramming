package JavaCollectionFramework;

import java.util.ArrayList;

public class FindDuplicateElements {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(34);
		al.add(34);
		al.add(57);
		al.add(60);
		al.add(60);
		al.add(45);
		
		for(int j=0;j<al.size()-1;j++) {
			if(al.get(j)==al.get(j+1)){
				System.out.println(al.get(j));
			}
		}
			ArrayList<String> list=new ArrayList();
	        list.add("Sagio Mane");
	        list.add("Karius");
	        list.add("Mo Salah");
	        list.add("Firmino");
	        list.add("Lovren");
	        list.add("Steven Gerrard");
	        list.add("Karius");
	        list.add("Mo Salah");
System.out.println(list.size());

	    for(int i=0; i < list.size()-1; i++) {
	    	int c=0;
	    	for(int k=1;k<list.size();k++) {
	    		if(list.get(i).equalsIgnoreCase(list.get(k))){
	    			c++;
	    		}
	    	}
	    	//System.out.println(c);
		   	   if(c>=2) {
		   		   System.out.println(list.get(i));
		   	   }
	       }
	  
		}
	

}
