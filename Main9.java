import java.util.*;
public class Main9
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    char ch = sc.next ().charAt (0);
    switch (ch)
      {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
	System.out.println ("vowel");
	break;
	default:
	System.out.println ("consonant");
	break;
      }  
   }
}

 OUTPUT:
l
consonant
i
vowel