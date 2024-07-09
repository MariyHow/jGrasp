import java.util.Scanner;
public class LargestNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int occurrence = 0;
        int number;
//storing command line argument in string s
        String s=args[0];
//splitting s into array of individual letters
        String arr[]=s.split("");
//going through each letter in array
        for(int i=0;i) //parsing each string into integer
            number=Integer.parseInt(arr[i]);
//if the current integer is greater than the largest number till now, then update the largest with current number
            if(number>largest){
                occurrence=1;
                largest=number;
            }
//if the largest number repeats then increment occurrence variable by 1
            else if(number==largest){
                occurrence++;
            }
        }
//Displaying the results
        System.out.println("The largest number is " + largest + " The occurrence count is " + occurrence); 
   }