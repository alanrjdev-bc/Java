package oopspractice;

public class Teacher {
	String name;
	int id;
	String subject;
	int classno;

	public void attendence(int attendence) {
		System.out.println("Attendance is : " + attendence + "%");
	}

	public void print() {
		System.out.println("Teacher Name : " + name);
		System.out.println("Teacher id : " + id);
		System.out.println("Teacher class : " + classno + "th Standard classes");
	}

	public void initalize(String name, int id, String subject, int classno) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.classno = classno;
	}

	public Teacher(String name, int id, String subject, int classno) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.classno = classno;
	}

	public Teacher() {

	}

}
