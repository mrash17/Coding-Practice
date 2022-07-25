import java.util.*;
class Tower
{
	static void ToH(int n,char from_rod,char to_rod,char aux_rod)
	{
		if(n==0)
		{
			return;
		}
		ToH(n-1,from_rod,aux_rod,to_rod);
		System.out.println("Move disk "+n+" from rod "+from_rod+" to rod "+to_rod);
		ToH(n-1,aux_rod,to_rod,from_rod);
	}
	public static void main(String args[])
	{
		int n;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter no of disks ");
		n=in.nextInt();
		ToH(n,'A','C','B');
	}
}
