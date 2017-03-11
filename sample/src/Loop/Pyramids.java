package Loop;

public class Pyramids 
{
	for (int i1 = 1; i <= 5; i++) {
  for (int s = 5; s > i1; s--) {
      System.out.print(" ");
  }
  for (int j = 1; j < i1; j++) {
      System.out.print("#");
  }
  for (int j = 1; j < i1; j++) {
      System.out.print("#");
  }
  System.out.println("");
}
for (int i = 1; i <= 5; i++) {
  for (int s = 1; s < i1; s++) {
      System.out.print(" ");
  }
  for (int j = 5; j > i1; j--) {
      System.out.print("#");
  }
  for (int j = 5; j > i1; j--) {
      System.out.print("#");
  }
  System.out.println("");
}
public static void main(String args[])
{
	Pyramids ps= new Pyramids();
}
}
}



    
