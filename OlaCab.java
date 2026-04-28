import java.util.Scanner;
public class OlaCab
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner (System.in);

   System.out.println("_-_-_-_-_-_-_-_-_ welcome to ola -_-_-_-_-_-_-_-_-_-");
   System.out.println("ride for per 1 km ");    
   System.out.println();
  System.out.println("1.Mini");
  System.out.println("2.Sedan");
  System.out.println("3.Suv");
  System.out.println("4.Luxury");
  System.out.println("choose a option : ");

  int choice = sc.nextInt();
  Cab C =null;

 switch(choice)
 {
  case 1 :{
           C = new Mini(); //upcasting
           System.out.println("MINI iss selected ");
          } break;
 case 2 :{
           C = new Sedan();
           System.out.println("Sedan iss selected ");
          } break;

 case 3 :{
           C = new Suv();
           System.out.println("Suv iss selected ");
          } break;

 case 4 :{
           C = new Luxury();
           System.out.println("luxyry iss selected ");
          } break;

 default : { System.out.println("Wrong option ");
           } 
 }

//downcasting 

       if(C instanceof Mini)
    	 System.out.println("price : "+((Mini)C).price+" $ need to pay for ride" );
      else if(C instanceof Sedan)
         System.out.println("price : "+((Sedan)C).price+" $ need to pay for ride");
      else if(C instanceof Suv)
    	  System.out.println("price :"+((Suv)C).price+" $ need to pay for ride");
      else if(C instanceof Luxury)
    	  System.out.println("price :"+((Luxury)C).price+" $ need to pay for ride");
	}
}