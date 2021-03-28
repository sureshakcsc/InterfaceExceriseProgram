package house;

public class ParkingArea extends Home {
	
	public void bikeparking()
	{
		System.out.println("The bike is Parked");
	}
	
	public void carparking(String sportscar)
	{
		System.out.println("The sports car is Parked:"  +sportscar);
	}
	
	public void carparking(String manualcar,String Automaticar)
	{
		System.out.println("The manualcar is:"+ manualcar  + Automaticar);
	} 
	

	public void closingdoor()
	{
		
		System.out.println("This is carparking area Door closed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParkingArea park=new ParkingArea();
		park.bikeparking();
		park.carparking("Ferrariportscar");
		park.carparking("alto", "i20");
        park.closingdoor();
        park.servant();
	}

}
