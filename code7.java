class bin{
	static void binToDec(int n){
		int dec=0,base=1,last_int;
		while(n>0)
		{
			last_int=n%10;
          n=n/10;
			dec=dec+last_int*base;
			base=base*2;
		}
		System.out.println("Decimal value is : "+dec);
	}
	public static void main (String args[])
	{
		int n=110;
		binToDec(n);
		
	}
}
