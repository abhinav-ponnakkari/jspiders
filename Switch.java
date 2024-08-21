public class Switch{

public static void main(String[] args)
{
  char x='a';
  System.out.println("switch started");
  
  switch(x)
{ 
  case 1: System.out.println("case1 block");
           break;  
  case '1': System.out.println("case2 block");
           break;
  case 'A': System.out.println("case3 block");
           break;
  case 'a': System.out.println("case4 block");
           break;
  default: System.out.println("default block");
           break;
 }
 System.out.println("switch closed");
}
}

