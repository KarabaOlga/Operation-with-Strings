package by.htp.Practics;

public class Task1 {
	static int k=13;
	static char n='T';
	
	public static char[] changeMas(char[] nameCharArray,int k,char n){
	     for (int i=0; i<nameCharArray.length-1; i++){
			 if(i==(k-1)){
				 nameCharArray[i]=n;
			 }
	     }
	     return nameCharArray;	
	}
 public static void main(String[] args){
	 String names="Mr Schumer indicated that President Trump's nominee would require 60 votes to be confirmed by the Senate, suggesting that Democrats are planning to filibuster or talk out the vote";
	 names = names.trim();
	 char[] nameCharArray = names.toCharArray();
	 changeMas(nameCharArray,k, n);
	 String Mas = new String(nameCharArray);
	 System.out.println(Mas);
 }
}
