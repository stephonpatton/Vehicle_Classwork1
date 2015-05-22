public abstract class Vehicle implements Comparable {
	private String make, model;
	private int year;
	private byte numberOfPassengers;
	
	public abstract int compareTo(Object obj);
	/**
	 * Default constructor. <br>
	 * Sets the value by default to Ford Mustang 2003 5.
	 */
	public Vehicle() {
		this("Ford", "Mustang", 2003, (byte)5);
	}
	/**
	 * Overloading constructor that sets the make, model, <br>
	 * and the number of passengers of a Vehicle object.
	 * @param make
	 * @param model
	 * @param year
	 * @param numOfPass
	 */
	public Vehicle(String make, String model, int year, byte numOfPass) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setNumberOfPassengers(numOfPass);
	}
	/**
	 * Copy constructor
	 * @param other
	 */
	public Vehicle(Vehicle other) {
		other.setMake(this.make);
		other.setModel(this.model);
		other.setNumberOfPassengers(numberOfPassengers);
		other.setYear(year);
	}
	/**
	 * Gets the make from the Vehicle object
	 * @return Make of the Vehicle object
	 */
	public String getMake() {
		return this.make;
	}
	/**
	 * Sets the make of the Vehicle object
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * Gets the model of the Vehicle object
	 * @return Model of the Vehicle object
	 */
	public String getModel() {
		return this.model;
	}
	/**
	 * Sets the model of the Vehicle object
	 * @param model
	 */
	public void setModel(String model) { 
		this.model = model;
	}
	/**
	 * Gets the year of the Vehicle object
	 * @return Year of the Vehicle object
	 */
	public int getYear() {
		return this.year;
	}
	/**
	 * Sets the year of the Vehicle object
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * Gets the number of passengers of the Vehicle object
	 * @return numberOfPassengers
	 */
	public byte getNumberOfPassengers() {
		return this.numberOfPassengers;
	}
	/**
	 * Sets numberOfPassengers of the Vehicle object
	 * @param numberOfPassengers
	 */
	public void setNumberOfPassengers(byte numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	/**
	 * String representation of the Vehicle object. <br>
	 * Prints out the year, make, mode, and numberOfPassengers of Vehicle object
	 */
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
	/**
	 * Checks to see if two Vehicle objects are equal.
	 * @return true or false
	 */
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
	/**
	 * Calculates the tax of a Vehicle object based on <br>
	 * the type of Vehicle. 
	 * @return tax
	 */
	public double calculateMichaelTax() {
		double tax = ((.07*numberOfPassengers)/(Math.pow(1+2015-year, .84)))*100;
		return tax;
	}
}
