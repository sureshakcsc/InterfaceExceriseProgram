package house;

public interface Hall { 
	
	public void sofa();
	public int cupboard();
	public int radio(int fmchannelnumber);
	public String wallclock(int hr,int minutes,String day);
	//public void tv(int sportchannelnumber,int musicchannelnumber, String tvname );
	public String kitchenutilities(int numberofsmallplates, float spoonprice, Long Plateprice, char knifes,String waterpurifername);
	public void kitchenutilities(int numberofsmallplates, float spoonprice, Long Plateprice);
	void kitchenutilities(int numberofsmallplates, double d, Long Plateprice);
    
}
