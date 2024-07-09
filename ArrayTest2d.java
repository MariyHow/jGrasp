public class arraytest2d
{
   public static void main(String args[])
   {
   int matrix[] []= {{1,2,3},{4,5,6}};
      int total[] = new int[matrix[0].length];
      
for (int column = 0; column < matrix[0].length; column++) {
total[column]=0;
   for (int row = 0; row < matrix.length; row++)
      total[column] += matix[row] [column];
   }
   
   for(int i=0;1<total.length;i++)
   System.out.println("Sum for column " + i + " is " + total[i]);
}
}