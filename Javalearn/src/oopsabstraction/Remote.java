package oopsabstraction;

public abstract class Remote {
	String name;

	public abstract void on();

	public abstract void off();

	public Remote(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Remote obj1=new Acremote("Ac Remote");
		System.out.println(obj1.name);
		obj1.on();
		obj1.off();
		Remote obj2=new Tvremote("Tv remote");
		System.out.println(obj2.name);
		obj2.on();
		obj2.off();
        Remote obj3=new Speakerremote("Speaker remote");
        System.out.println(obj3.name);
        obj3.on();
        obj3.off();
        	
        
		
		
		
	}

}
