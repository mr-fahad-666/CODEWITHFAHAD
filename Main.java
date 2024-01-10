class Main 
{
	public static void main(String[] args) 
	{
		        System.out.println();

		InternetProvider ip;
		ip = new InternetProvider();
		ip.Wifi();
	    System.out.println();

		ip = new ActFibernet();
		ip.Wifi();
		System.out.println();

		ip = new Beam();
        ip.Wifi();
        System.out.println();

		ip = new JioFiber();
		ip.Wifi();
        System.out.println();

		ip = new Cherrinet();
		ip.Wifi();
        System.out.println();

		

	}
}
