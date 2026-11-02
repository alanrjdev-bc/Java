package practicestring;

public class Task {

	public static void main(String[] args) {
		String a="hello";
		String c="Hello";
		String b="World";
		StringBuffer sd=new StringBuffer("Morning");
		String t="Hai";
		System.out.println(sd.capacity());
		System.out.println(sd.insert(0, t));
		System.out.println(sd.reverse());
		System.out.println(sd.charAt(3));
		System.out.println(sd.length());
		StringBuilder st=new StringBuilder("Democlass");
		System.out.println(st.length());
		System.out.println(st.reverse());
		System.out.println(st.charAt(2));
		System.out.println(a.charAt(2));
		System.out.println(a.substring(1));
		System.out.println(a.replace('e', 'f'));
		System.out.println(a.length());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(a));
		System.out.println(a.concat(b));
		System.out.println(a.substring(1, 3));
		System.out.println(a.intern());
		System.out.println(a.equalsIgnoreCase(c));
   	    System.out.println(a.indexOf(t, 0, 0));
		System.out.println(b.toUpperCase());
		System.out.println(b.charAt(2));
		
		

	}

}
