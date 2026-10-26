package oopsinterface;

public interface Vehicle {
	
	
	public abstract void speed();
	
	 public default void fuleffiecency() {
		 System.out.println("Low");
	 }
	 

}
