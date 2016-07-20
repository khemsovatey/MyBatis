package pojo.entity;

public class User {
	private int id;
	private String name;
	private String gender;
	private String email;
	
	public User(){}
	public User(int id, String name, String gender, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + "]";
	}
	
}
