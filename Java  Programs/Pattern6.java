public class Pattern6 {
    
        static void pattern6(int N)
     {
         // This is the outer loop which will loop for the rows.
         for (int i = 0; i < N; i++)
         {
            
             for (int j = N; j > i; j--)
             {
                 System.out.print(N-j+1+" ");
             }
     
              
             System.out.println();
         }
     }
     
         public static void main(String[] args) {
             
             // Here, we have taken the value of N as 5.
             // We can also take input from the user.
             int N = 5;
             pattern6(N);
         }
     }
     
                                       
