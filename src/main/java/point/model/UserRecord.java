package point.model;

import jakarta.persistence.*;

@Entity
public class UserRecord {
	
	@Id
	private int Id;
	private String name;
	private String email;
	
	public UserRecord () {}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
