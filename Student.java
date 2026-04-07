package project;

public class Student {

	    private int id;
	    private String name;
	    private int age;

	    public Student(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    public int getId() {
	        return id;
	    }

	    public void display() {
	        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
	    }
	}


