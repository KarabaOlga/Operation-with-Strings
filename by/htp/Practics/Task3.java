package by.htp.Practics;

public class Task3 {
	static int k=13;
	
 public static void main(String[] args){
	 String names="Mr Schumer indicated that President Trump's nominee would require 60 votes to be confirmed by the Senate, suggesting that Democrats are planning to filibuster or talk out the vote";
	 names = names.trim();
	 char[] nameCharArray = names.toCharArray();
	 String s= "KUKU";
	 s=s.trim();
	 char[] sCharArray = s.toCharArray();
	 
	 
	 char[] m = new char[k];
	 for (int i=0; i<k; i++){
			 m[i]=nameCharArray[i];
			 }
	
	 String partOne = new String(m);
	 String partTwo= partOne.concat(s);
	
	 System.out.println(partTwo);
	 
	 char[] b = new char[nameCharArray.length-k];
	 for (int i=k+sCharArray.length; i<nameCharArray.length+sCharArray.length; i++){
			 b[i]=nameCharArray[i];
			 }
	 String partThree = new String(b);
	 String partTotal= partThree.concat(partThree);
	 
	 
 }
}
