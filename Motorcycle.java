
public class Motorcycle extends Vehicle{
	private BikeType bikeType;
	
	public Motorcycle() {
		this("Ducati", "1299 Panigale", 2015, BikeType.SUPER);
	}
	public Motorcycle(String make, String model, int year, 
			BikeType bikeType) {
		super();
		super.setMake(make);
		super.setModel(model);
		super.setYear(year);
		this.setBikeType(bikeType);
	}
	public Motorcycle(Motorcycle otherBike) {
		this(otherBike.getMake(), otherBike.getModel(), otherBike.getYear(),
				otherBike.getBikeType());
	}
	public BikeType getBikeType() {
		return bikeType;
	}
	public void setBikeType(BikeType bikeType) {
		this.bikeType = bikeType;
	}
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
	
	@Override
	public String toString() {
		return this.getYear() + " " + this.getMake() + " " + this.getModel()
				+ " " + this.bikeType.toString();
	}
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
