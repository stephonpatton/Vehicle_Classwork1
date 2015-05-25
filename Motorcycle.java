
public class Motorcycle extends Vehicle{
	private BikeType bikeType;
	/**
	 * Default constructor that assigns the <br>
	 * motorcycle to a 2015 Ducati 1299 Panigale Super bike.
	 */
	public Motorcycle() {
		this("Ducati", "1299 Panigale", 2015, BikeType.SUPER);
	}
	/**
	 * Overloading constructor that sets the make, model, <br>
	 * year, and bike type.
	 * @param make
	 * @param model
	 * @param year
	 * @param bikeType
	 */
	public Motorcycle(String make, String model, int year, 
			BikeType bikeType) {
		super();
		super.setMake(make);
		super.setModel(model);
		super.setYear(year);
		this.setBikeType(bikeType);
	}
	/**
	 * Copy constructor 
	 * @param otherBike
	 */
	public Motorcycle(Motorcycle otherBike) {
		this(otherBike.getMake(), otherBike.getModel(), otherBike.getYear(),
				otherBike.getBikeType());
	}
	/**
	 * 
	 * @return bikeType of the Motorcycle
	 */
	public BikeType getBikeType() {
		return bikeType;
	}
	/**
	 * Sets the bikeType of a Motorcycle object
	 * @param bikeType
	 */
	public void setBikeType(BikeType bikeType) {
		this.bikeType = bikeType;
	}
	/**
	 * Calculates the taxes of a Motorcycle <br>
	 * based on the type of bike that it is.
	 */
	@Override
	public double calculateMichaelTax() {
		double taxRate=0;
		if(bikeType.equals(BikeType.SUPER))
			taxRate = .11;
		else if(bikeType.equals(BikeType.SPORT))
			taxRate = .09;
		else if(bikeType.equals(BikeType.TOURING))
			taxRate = .065;
		else if(bikeType.equals(BikeType.CRUISER))
			taxRate = .055;
		
		double tax = ((taxRate*getNumberOfPassengers())/
				(Math.pow(1+2015-getYear(), .65)))*100;
		
		return tax;
	}
	/**
	 * @return String representation of the Motorcycle object
	 */
	@Override
	public String toString() {
		return this.getYear() + " " + this.getMake() + " " + this.getModel()
				+ " " + this.bikeType.toString();
	}
	/**
	 * Compares the objects based on the year
	 * @return 1, 0, -1
	 */
	@Override
	public int compareTo(Object obj) {
		Vehicle otherVehicle = (Vehicle) obj;
		if(this.getYear() > otherVehicle.getYear())
			return 1;
		else if(this.getYear() < otherVehicle.getYear())
			return -1;
		else
			return 0;
	}
	
}
