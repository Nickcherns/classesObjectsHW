package classesObjectsHW;

public class petClass {

	private String name;
	private int age;
	private String location;
	private String type;
	
	public static void main(String[] args) {
		
	}
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getType() {
		return type;
	}
	
	public petClass() {
		
	}
	
	public void setPet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public void setFoundPet(int age, String type) {
		this.age = age;
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

}

