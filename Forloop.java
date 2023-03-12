class TestForLoop1
{
     int sum=0;
     void m1()
   {
      for(int i=5;i>0;i--)
       {
            this.sum+=i;
           System.out.println("sum="+this.sum);
         }
      }
public static void main(String args[])
  {
        new TestForLoop1().m1();
     }
 }