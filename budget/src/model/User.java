package model;

public class User {
	private long id;
	private long login;
	
	public User() {
		
	}
	
	public User(User user) {
		this.id = user.id;
		this.login = user.login;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getLogin() {
		return login;
	}

	public void setLogin(long login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (login ^ (login >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (login != other.login)
			return false;
		return true;
	}
	

}
