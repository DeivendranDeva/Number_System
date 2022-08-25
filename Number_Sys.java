package alphabets_numbers;

public class Number_Sys 
{
 public static void main(String args[]) 
 {
	 Number_Sys number=new Number_Sys ();
	            number.String();
	            number.String2();
	            number.String3();
	            number.String4();
	            number.String5();
	            number.String6();
	            number.divisors();
 } 
 
 
 //sum of the given n numbers
 public void String()
 {
  int num=10;
  int sum=0;
  for(int i=1;i<=num;i++)
  {
	sum=sum+i; 
	
  }
  System.out.println(sum);
 }
 
 
 // product of the given n numbers
 public void String2()
 {
	 int num=5;
	  int sum=1;
	  for(int i=1;i<=num;i++)
	  {
		sum=sum*i;       	
	  }
		System.out.println(sum); 
 }
 
 
 
 
//Find the LCM for given numbers 
 public void String3()
 {
  int a=7;
  int b=3;
  int large=0;
  if(b>a) {
	  large=b;
         }
  else
	  large=a; 
  while(true)
  {
	if(large%a==0 && large%b==0)  {
		System.out.println(large);
		break;
	}
	large++;
  }
 }
 
 
//Find the GCD for given numbers 
 public void String4()
 {
	 int a=10;
	 int b=30;
	 int small=1;
	 if(b>a) 
	 {
	  small=a;
	 }
     else
	  small=b;
	 while(true) 
	 {
	  if(small%a==0 && small%b==0)	
	    {
		  System.out.println(small);
		  break;
	    }
	  small++;
	 }
}
 
 
 
 //Find the divisors of the given number
 public void divisors()
 {  
   int a=112;
   int i=2;
   while(i<a)
   {
	 if(a%i==0)
	 {
	  System.out.println(i);
	 }
	 i++;
   } 
 }

 
 //find the max number in the 12,24,27
  public void String5() 
  {
   int a=12;
   int b=24;
   int c=27;
   int max=c;
     if(a>b) 
     {
	  max=a;
     }
     if(b>c)
     {
      max=b;	 
     }
     if(c>max)
     {
      max=c;
     }
     System.out.println(max);    
  }
  
  
  //Find the minimum number in 12,24,27
  public void String6() 
  {
   int a=12;
   int b=24;
   int c=27;
   int min=a;
     if(b<c) 
     {	 
	  if(c<a)
	     {
	      min=c;	 
	     }
	     if(a>=min)
	     {
	      min=a;
	     }
     }   
     System.out.println(min);    
   }
 }






