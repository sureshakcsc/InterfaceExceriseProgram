package house;

public interface Kitchen {
	
	public String gascyclinder(String gasname);
	public int[] stove(int[] hpgasnumber);
	public String diningtable(String chair);
	public void kitchenutilities(int numberofsmallplates,float spoonprice,Long Plateprice  );
	public String kitchenutilities(int numberofsmallplates, float spoonprice, Long Plateprice, char knifes,
			String waterpurifername);
	public String washbasin(String tapmodel);
	public Class<Boolean> washingmachine(boolean b);

}
