package by.htp.Practics;

public class Task7 {
	
	public static void main( String[] args){
	
		StringBuffer sb = new StringBuffer("Mis45ha Va7ya Ko@@lya Oly*&a");
		
		if(sb.length()!=0){
		System.out.println(sb);
		   
		while (!Character.isLetter(sb.charAt(0))){
			sb.deleteCharAt(0);
		}
		for (int i=0;i<sb.length();i++){
			if(!Character.isLetter(sb.charAt(i))&&!Character.isWhitespace(sb.charAt(i))){
				sb.setCharAt(i,' ');
			}
		}
		System.out.println(sb);
		}
		else {
			System.out.println(" Text not found ");
		}
	}

}