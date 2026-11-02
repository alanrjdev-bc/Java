package practicestring;

public class Star {

	public static void main(String[] args) {
		StringBuilder ge=new StringBuilder("orange");
		
		for(int i=0;i<ge.length();i++) {
			char df=ge.charAt(i);
			if(df=='a'||df=='e'||df=='i'||df=='o'||df=='u') {
                System.out.println("*");
			}
		}

	}

}
