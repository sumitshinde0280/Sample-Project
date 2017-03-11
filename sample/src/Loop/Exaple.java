package Loop;

public class Exaple {
	int main()
	{
		int i=1,j=1;
		for(;;)
		{
			if(i>5)
				break;
			else
				j+=1;
			System.out.println(j);
			i+=j;
			return 0;
		}
		return 0;
		
		
		
	}


	public static void main(String[] args) {
// TODO Auto-generated method stub
		Exaple e=new Exaple();
		e.main();

	}

}
