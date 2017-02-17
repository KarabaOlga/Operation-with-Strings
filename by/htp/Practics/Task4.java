package by.htp.Practics;

public class Task4 {

 public static void main(String[] args){
	 
	 String names=" Anya Arina Misha Katya Masha Vasya Vova";
	 names = names.trim();
	 String a[] = names.split(" ");
	 
	 String s= "Masha";
	 s = s.trim();
	 String c = " clever";
	 for(int j=0; j<a.length; j++){
		 
		      if( a[j].compareToIgnoreCase(s)==0){  
		    	 a[j]=a[j].concat(c);
		      }
		//System.out.println(a[j]);
	 }
	 for(String arg:a){
			if(!arg.isEmpty()){
				System.out.print(arg+" ");
			}	
       }
    }
 }

