package pom;

public class Acc
{
	public static void main(String[] args) 
	{
		Bank rsBal = new Bank();
		System.out.println(rsBal.rsBal(5000));
		System.out.println(rsBal.rsWbal(6000));
		
		Bank rsWBal = new Bank();
		System.out.println(rsWBal.rsBal(600000));
	}

}
