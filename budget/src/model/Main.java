package model;

public class Main {
	private long id;
	private String balance;
	private int user_id;
	private int tranzaction_id;

	public Main() {
	}
	
	public Main(Main main) {
		this.id = main.id;
		this.balance = main.balance;
		this.user_id = main.user_id;
		this.tranzaction_id = main.tranzaction_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getTranzaction_id() {
		return tranzaction_id;
	}

	public void setTranzaction_id(int tranzaction_id) {
		this.tranzaction_id = tranzaction_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + tranzaction_id;
		result = prime * result + user_id;
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
		Main other = (Main) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (id != other.id)
			return false;
		if (tranzaction_id != other.tranzaction_id)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Main [id=" + id + ", balance=" + balance + ", user_id=" + user_id + ", tranzaction_id=" + tranzaction_id
				+ "]";
	}

	
}