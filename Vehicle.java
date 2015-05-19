public abstract class Vehicle implements Comparable {
	private String make, model;
	private int year;
	private byte numberOfPassengers;
	
	public abstract int compareTo(Object obj);
	public Vehicle() {
		this("Ford", "Mustang", 2003, (byte)5);
	}
	public Vehicle(String make, String model, int year, byte numOfPass) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setNumberOfPassengers(numOfPass);
	}
	public Vehicle(Vehicle other) {
		other.setMake(this.make);
		other.setModel(this.model);
		other.setNumberOfPassengers(numberOfPassengers);
		other.setYear(year);
	}
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) { 
		this.model = model;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public byte getNumberOfPassengers() {
		return this.numberOfPassengers;
	}
	public void setNumberOfPassengers(byte numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	@Override
	public String toString() {
		return year + " " + make + " " + model + " seats " + numberOfPassengers + " people";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + numberOfPassengers;
		result = prime * result + year;
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
		Vehicle other = (Vehicle) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (numberOfPassengers != other.numberOfPassengers)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	public double calculateMichaelTax() {
		double tax = ((.07*numberOfPassengers)/(Math.pow(1+2015-year, .84)))*100;
		return tax;
	}
}
