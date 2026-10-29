package oopsinterface;

public class Area implements Constant {
	
	
	public void Calculatearea(int radious) {
		System.out.println(pie*radious*radious);
	}
	

	public static void main(String[] args) {
		Area obj=new Area();
	    obj.Calculatearea(7);
	
		
		
		
	}

}
