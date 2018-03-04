public class Dog implements Comparable<Dog> {
	private String veisle;
	private String name;
	private int age;

	public Dog(String veisle, String name, int age) {
		this.veisle = veisle;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Dog other) {
		return this.age - other.age;
	}

	public int getAge() {
		return this.age;
	}

	public String getVeisle() {
		return this.veisle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((veisle == null) ? 0 : veisle.hashCode());
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
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (veisle == null) {
			if (other.veisle != null)
				return false;
		} else if (!veisle.equals(other.veisle))
			return false;
		return true;
	}

	public String toString() {
		return veisle + ", " + name + ", " + age;

	}

}
