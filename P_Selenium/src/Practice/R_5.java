package Practice;

public class R_5 {


	public static void main(String[] args) {

		String star = "*";
		String space=" ";


		for(int i=1;i<=5;i++)
		{
			System.out.println();

			for(int j=1;j<=5;j++)
			{
				if(i==1||i==3 || i==5 ) {
					System.out.print(" "+star+" ");
				}
				else if((i==2&& j==1)||(i==4&& j==5))
				{
					System.out.print(" "+star+" ");
				}

				else {
					System.out.print(" "+space+" ");
				}

			}

		}

	}

}
