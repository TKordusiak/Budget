package model;

public class Savings {
	private long id;
	private String description;
	private String categories;
	private int categories_id;
	private int transaction_id;
	
	public Savings() {
	}
	
	public Savings(Savings savings) {
		this.id = savings.id;
		this.description = savings.description;
		this.categories = savings.categories;
		this.categories_id = savings.categories_id;
		this.transaction_id = savings.transaction_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public int getCategories_id() {
		return categories_id;
	}

	public void setCategories_id(int categories_id) {
		this.categories_id = categories_id;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + categories_id;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + transaction_id;
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
		Savings other = (Savings) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (categories_id != other.categories_id)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (transaction_id != other.transaction_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Savings [id=" + id + ", description=" + description + ", categories=" + categories + ", categories_id="
				+ categories_id + ", transaction_id=" + transaction_id + "]";
	}
	
	

}
