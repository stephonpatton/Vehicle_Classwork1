
public class Automobile extends Vehicle {
	private byte numberOfDoors;
	
	public Automobile () {
		this("Ford", "Focus", 2003, (byte)5, (byte)2);
	}
	public Automobile (String make, String model, Integer year,
			byte numOfPass, byte numberOfDoors) {
		super();
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setNumberOfPassengers(numOfPass);
		this.setNumberOfDoors(numberOfDoors);
	}
	public Automobile (Automobile other) {
		this(other.getMake(), other.getModel(),	other.getYear(),
			other.getNumberOfPassengers(), other.getNumberOfDoors());
	}
	public byte getNumberOfDoors () {
		return numberOfDoors;
	}
	public void setNumberOfDoors (byte numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
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
	@Override
	public double calculateMichaelTax() {
		double tax = ((.02*getNumberOfPassengers())/(Math.pow(1+2015-getYear(), 1.25)))*(numberOfDoors*100);
		return tax;
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
