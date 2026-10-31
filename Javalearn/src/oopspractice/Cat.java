package oopspractice;

public class Cat extends Animal {
	String sound;
	
	
	
	public Cat(String family,int legs,String name,int speed,String tail,String sound) {
		super(family,legs,name,speed,tail);
		this.sound=sound;
		
	}
	 @Override
		public String toString (){
			return family+legs+name+speed+tail;
		}
		
  
	public static void main(String[] args) {
	Cat c=new Cat("cat",4,"Tom",10,"Short","Meow");
	System.out.println(c);
	
	
		
}

}
