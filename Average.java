import java.util.Scanner; 

public class Average 
{

  public static void main(String[] args) 
  {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("How many numbers? ");
    int count = scanner.nextInt();
    
    double sum = 0;
    for(int i=0; i<count; i++) 
    {
      System.out.print("Enter number: ");
      double number = scanner.nextDouble();
      sum += number;
    }
    
    double average = sum / count;
    System.out.println("Average = " + average);
    
  }

}