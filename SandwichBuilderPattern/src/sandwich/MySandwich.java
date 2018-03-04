package sandwich;

public class MySandwich {
	private String bread;
	private String ham;
	private String cheese;
	private String veg;

	private MySandwich(Builder builder) {
		this.bread = builder.bread;
		this.ham = builder.ham;
		this.cheese = builder.cheese;
		this.veg = builder.veg;
	}
		
	public String toString() {
		return "Sandwich with "+ this.bread +", "+ this.ham +" ham, "+ this.cheese +" cheese, "+ this.veg;
	}


	public static class Builder {
		private String bread;
		private String ham;
		private String cheese;
		private String veg;

		public Builder(String bread) {
			this.bread = bread;
		}

		public Builder ham(String ham) {
			this.ham = ham;
			return this;
		}

		public Builder cheese(String cheese) {
			this.cheese = cheese;
			return this;
		}

		public Builder veg(String veg) {
			this.veg = veg;
			return this;
		}

		public MySandwich build() {
			return new MySandwich(this);

		}
	}
}
