
public class Automobile extends Vehicle {
	private byte numberOfDoors;
	/**
	 * Default constructor that sets the Automobile <br>
	 * object to a 2003 Ford Focus 2 door that seats 5 people
	 */
	public Automobile () {
		this("Ford", "Focus", 2003, (byte)5, (byte)2);
	}
	/**
	 * Overloading constructor that sets the make, <br>
	 * model, year, number of passengers, and the <br>
	 * number of doors in a Automobile object.
	 * @param make
	 * @param model
	 * @param year
	 * @param numOfPass
	 * @param numberOfDoors
	 */
	public Automobile(String make, String model, int year,
			byte numOfPass, byte numberOfDoors) {
		super();
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setNumberOfPassengers(numOfPass);
		this.setNumberOfDoors(numberOfDoors);
	}
	/**
	 * Copy constructor for Automobile 
	 * @param other
	 */
	public Automobile(Automobile other) {
		this(other.getMake(), other.getModel(),	other.getYear(),
			other.getNumberOfPassengers(), other.getNumberOfDoors());
	}
	/**
	 * Gets the numberOfDoors from the object
	 * @return numberOfDoors
	 */
	public byte getNumberOfDoors() {
		return numberOfDoors;
	}
	/**
	 * Sets the numberOfDoors for the object
	 * @param numberOfDoors
	 */
	public void setNumberOfDoors (byte numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	/**
	 * Prints the object in the format: <br>
	 * year/make/model/numOfDoors/numOfPassengers
	 */
	@Override
	public String toString() {
		return this.getYear() + " " + this.getMake() + " " + this.getModel() + " " + numberOfDoors + " door "
				+ "seats " + this.getNumberOfPassengers() + " people";
	}
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfDoors;
		return result;
	}
	/**
	 *Checks to see if two Automobile objects <br>
	 *are equivalent <br>
	 *@return true or false 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automobile other = (Automobile) obj;
		if (numberOfDoors != other.numberOfDoors)
			return false;
		return true;
	}
	/**
	 * Calculates the taxes on Automobile objects <br>
	 * at a 2% rate.
	 */
	@Override
	public double calculateMichaelTax() {
		double tax = ((.02*getNumberOfPassengers())/(Math.pow(1+2015-getYear(), 1.25)))*(numberOfDoors*100);
		return tax;
	}
	/**
	 * Compares two Automobile objects <br>
	 * based on the year <br>
	 * @return 1, 0, -1
	 */
	@Override
	public int compareTo(Object obj) {
		Vehicle otherVehicle = (Vehicle) obj;
		if(this.getYear() > otherVehicle.getYear())
			return -1;
		else if(this.getYear() < otherVehicle.getYear())
			return 1;
		else
			return 0;
	}
}
