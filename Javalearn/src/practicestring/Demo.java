package practicestring;

public class Demo {
	
	public static void main(String[] args) {
		String text="apple";
		int vowels=0;
		int constant=0;
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			
			if( ch >='a' && ch<='z') {
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u') {
					vowels++;
					
				}
				else {
					constant++;
				}
				
			}
			}
		System.out.println("Vowels : " + vowels);
		System.out.println("Constant : " + constant);


	}

}
