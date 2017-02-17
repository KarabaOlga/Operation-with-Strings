package by.htp.Practics;

public class Task {
	 public static void main(String[] args) {
		  String textString = "Hello world Hello I am Olya I am";
		  
		  String[] arrayString = textString.split(" ");
		  int[] arrayCount = new int[arrayString.length];
		  
		  for (int i = 0; i < arrayString.length; i++) {
		   int count = 0;
		   for (int j = 0; j < arrayString.length; j++) {
		    if (arrayString[i].equals(arrayString[j])){
		     count = count +1;
		     arrayCount[i] = count;
		    } else {
		     arrayCount[i] = count;
		    }
		   }
		  }
		  
		  System.out.println(textString);
		  for (int i = 0; i < arrayCount.length; i++){
		   System.out.println(arrayString[i] + ": " + arrayCount[i]);
		  }
		 }
		}

 
