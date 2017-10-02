package excercises;

public class loopingStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Count to 10");
		
		for(int x = 0; x <= 10; ++ x)
		{
			System.out.println(x + "");
		}
		
		
		int y = 0;
		while(y<=10)
		{
			System.out.println(y + "");
			++y;
		}
		
		int z = 0;
		
		do
			
		{
			System.out.println(z + "");
			++z;
		}while(z != 10);
	}

}
