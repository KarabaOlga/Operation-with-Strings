package by.htp.Practics;

public class Task19 {

	public static void main(String[] args) {
		
	String text = "Tanya arrayList Vasya rita arina tom";
	String[] words = text.split("\\s");
	for (String s : words){
		System.out.print(toUp(s)+" ");
	 }
	/*
	 for (String word: words){
	 String first = word.substring(0,1).toUpperCase();
	 String all = word.substring(1);
	 output+=first+all;
	 */
	}
	
    public static String toUp(String s){
    	char[] result =s.toCharArray();
        if (Character.isAlphabetic(result[0]))result[0]=Character.toUpperCase(result[0]);
        String res = ""+result[0];
        for(int i=1;i<result.length;i++){
        	if(Character.isAlphabetic(result[i])&&!Character.isAlphabetic(result[i-1]))result[i]=Character.toUpperCase(result[i]);
        	res+=result[i];
        }
        return res;
    }

}
