package model;

public class CategoriesPlanned {
	private long id;
	private String categories;
	
	public CategoriesPlanned() {
	}
	
	public CategoriesPlanned(CategoriesPlanned categoriesPlanned) {
		this.id = categoriesPlanned.id;
		this.categories = categoriesPlanned.categories;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		CategoriesPlanned other = (CategoriesPlanned) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CategoriesPlanned [id=" + id + ", categories=" + categories + "]";
	}
	
	

}
