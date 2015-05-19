
public class Program {
	public static void main(String[] args) {
		Automobile v = new Automobile();
		System.out.println(v.toString());
		Automobile v1 = new Automobile("Ford", "Focus", 2003, (byte)5, (byte)2);
		
		Automobile a = new Automobile();
		System.out.println(a.toString());
		
		Motorcycle m = new Motorcycle();
		System.out.println(m.toString());
		System.out.println(v.equals(v1));
		m.setBikeType(BikeType.SPORT);
		System.out.println(m.toString());
	}
}
