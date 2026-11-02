package practicestring;

public class Specialchar {

	public static void main(String[] args) {
		String text="@1234$#&";
		int special=0;
		int count=0;
		for(int i=0;i<text.length();i++) {
			char df=text.charAt(i);
			if(df=='@'|| df=='#'||df=='$'||df=='%'||df=='&'||df=='*') {
				special++;
			}
			else {
				count++;
			}
		}
		System.out.println(special);
        System.out.println(count);
	}

}
