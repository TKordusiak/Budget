package model;

public class Planned {

	private long id;
	private String description;
	private String categories;
	private int categories_planned_id;
	private int transaction_id;
	
	public Planned() {
		
	}
	
	public Planned(Planned planned) {
		this.id = planned.id;
		this.description = planned.description;
		this.categories = planned.categories;
		this.categories_planned_id = planned.categories_planned_id;
		this.transaction_id = planned.transaction_id;
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

	public int getCategories_planned_id() {
		return categories_planned_id;
	}

	public void setCategories_planned_id(int categories_planned_id) {
		this.categories_planned_id = categories_planned_id;
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
		result = prime * result + categories_planned_id;
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
		Planned other = (Planned) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (categories_planned_id != other.categories_planned_id)
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
		return "Planned [id=" + id + ", description=" + description + ", categories=" + categories
				+ ", categories_planned_id=" + categories_planned_id + ", transaction_id=" + transaction_id + "]";
	}
	
	
}
