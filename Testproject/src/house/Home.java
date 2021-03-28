package house;

public class Home implements Kitchen,Hall{

	

	@Override
	public void sofa() {
		
		
		// TODO Auto-generated method stub
		System.out.println("Soft is present in house");
	}

	@Override
	public int cupboard() {
		// TODO Auto-generated method stub
		int Noofcupboard=2;
		System.out.println(" 2 cupboards are present"+Noofcupboard);
		return Noofcupboard;
		
	}

	@Override
	public int  radio(int fmchannelnumber) {
		// TODO Auto-generated method s
		String country;
		switch(fmchannelnumber)
		{
			case 1:
				country="UK";
				System.out.println("the UKfmchannelnumber is uk92.5: "+country);
			break;	
			case 2:
				country="india";	
		System.out.println("the Indiafmchannelnumber is Radiofm35: "+country);
		     break;
		}			
		return fmchannelnumber;
		
		
	}

	@Override
	public String wallclock(int hr, int minutes, String day) {
		// TODO Auto-generated method stub
		
		System.out.println("the wallclock displsy"+hr + minutes +day);
		return day;
		
	}

	/*
	 * @Override public void tv(int sportchannelnumber, int musicchannelnumber,
	 * String tvname) { // TODO Auto-generated method stub
	 * System.out.println("The tv channel detalils"); return
	 * sportchannelnumber,tvname;
	 */
	

	@Override
	public String gascyclinder(String gasname) {
		// TODO Auto-generated method stub
		System.out.println("The gascyclinder usesd is"+ gasname);
		return gasname;
	}

	
	public int[] stove(int[] hpgasnumber) {
		
		hpgasnumber=new int[3];
	
		// TODO Auto-generated method stub
		return hpgasnumber;
	}

	public String diningtable(String chair) {
		// TODO Auto-generated method stub
		return chair;
	}
   /* @Override
	
	public String kitchenutilities(int numberofsmallplates, float spoonprice, Long Plateprice, char knifes,String waterpurifername) {
		// TODO Auto-generated method stub
		return waterpurifername;*/
		
		public void kitchenutilities(int numberofsmallplates, float spoonprice, Long Plateprice,String waterpurifername) {
			// TODO Auto-generated method stub
			System.out.println("Kitichen utilities"+numberofsmallplates +spoonprice +Plateprice +waterpurifername);
			
			return;
	}
		

	@Override
	public String washbasin(String tapmodel) {
		// TODO Auto-generated method stub
		
		
			
		System.out.println("The Latesttapmodel is in house"+tapmodel);
		return tapmodel;
		
	}

	@Override
	public Class<Boolean> washingmachine(boolean b) {
		// TODO Auto-generated method stub
		
		System.out.println("Washing mchineis avaible in house:"+b);
		return boolean.class;
		
	}
	
	

	@Override
	public String kitchenutilities(int numberofsmallplates, float spoonprice, Long Plateprice, char knifes,
			String waterpurifername) {
		// TODO Auto-generated method stub
		System.out.println(" Kitchen utilities are "+numberofsmallplates +spoonprice  +Plateprice +waterpurifername );
		return null;
	}

	@Override
	
	public void kitchenutilities(int numberofsmallplates, double d, Long Plateprice) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void kitchenutilities(int numberofsmallplates, float spoonprice, Long Plateprice) {
		// TODO Auto-generated method stub
	}
	
	public void closingdoor()
	{
		System.out.println("This is House Door closed");
	}
	
	public void servant()
	{
		System.out.println("Three servants are there in Home");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Home h= new Home();
		h.sofa();
		//h.stove("[3][2][1]");
		h.washbasin("Taplatestmodel");
		
		h.diningtable("Woodenchair");
		h.cupboard();
		h.gascyclinder("hpgas");
		h.kitchenutilities(2,3.0,5l);
		h.radio(1);
		h.wallclock(2, 25, "monday");
	    h.washingmachine(true);
	    h.kitchenutilities(1, 3.5, 15l);
	    h.kitchenutilities(5, 34f, 25l,'A',"kinley");
	    
	    

	}
		
	}

	
		
	
	
	
	

	
	
	
		
		
	

	
		
	

	
		
	

	

	
		
	

	

	
	

	
		
	


