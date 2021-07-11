import java.util.*;
class Exam
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		char ans;
		System.out.println("Who is the Father of the bulb");
		System.out.println("A Nik Test");
		System.out.println("B Thomas Edition");
		System.out.println("C Mari");
		System.out.println("D Robert Opensier");
		ans=sc.nextLine().charAt(0);
		switch(ans)
		{
			case 'A':
				System.out.println("Sorry Wrong Answer");
				break;
			case 'B':
				System.out.println("Good  This Right Answer");
				break;
			case 'C':
				System.out.println("Sorry Wrong Answer");
				break;
			case 'D':
				System.out.println("Sorry Wrong Answer");
				break;
			default:
				System.out.println("Sorry Wrong Choice");
		}
	}
}
