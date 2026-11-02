package practicestring;

public class Reverse {

	public static void main(String[] args) {
		String t="Alan";
		String rev="";
		for(int i=0;i<t.length();i++) {
			char ch=t.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		

	}

}
