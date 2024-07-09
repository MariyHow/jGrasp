public class
Scanner Scan = new scanner(System.in)
   int choice;
do{
   System.out.println("0 to exit");
   System.out.println("1 to calculator");
   System.out.println("2 to conversion");
   choice = scan.nextInt();
   
   switch(choice)
   {
      case 0:
      System.out.println("0 to exit");
      system.exit(0);
      break;
      
      case 1:
      System.out.println("1 to calculator");
      calchoice();
      break;
      
      case 2:
      System.out.println("2 to conversion");
      calconversion();
      break;
      }
   }while(choice!=0);
      
      {

   public static void calchoice() {
   Scanner Scan = new scanner(System.in)
   int operation;
   system.out.println("pick an operation");
   system.out.println("pick 1 for Addition");
   system.out.println("pick 2 for Subtraction");
   system.out.println("pick 3 for Multiplication");
   system.out.println("Pick 4 for Division");
   system.out.println("pick 0 to exit");
   calchoice = scan.nextInt();
   

   switch(operation)
   {
   case 0:
   System.exit(0);
   
   case 1:
   System.out.println("1 for addition");
   break;
   
      case 2:
      System.out.println("2 for subtraction");
      break;
      
         case 3:
         System.out.println("3 for multiplication");
         break;
         
            case 4:
            System.out.println("4 for division");
            break;
            }
            
            
            }while(operation!=0)
            }
            
      public static void calconversion() {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("Pick 1 to convert to Roman Numeral");
        System.out.println("Pick 2 to convert from Roman Numeral");
        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("Conversion to Roman Numeral selected");
            int number = scan.nextInt();
            String romanNumeral = "";

            while (number >= 1000) {
                romanNumeral += "M";
                number -= 1000;
            }

            while (number >= 500) {
                romanNumeral += "D";
                number -= 500;
            }

            while (number >= 100) {
                romanNumeral += "C";
                number -= 100;
            }

            while (number >= 50) {
                romanNumeral += "L";
                number -= 50;
            }

            while (number >= 10) {
                romanNumeral += "X";
                number -= 10;
            }

            while (number >= 5) {
                romanNumeral += "V";
                number -= 5;
            }

            while (number >= 1) {
                romanNumeral += "I";
                number -= 1;
            }

            System.out.println("Roman Numeral: " + romanNumeral);
        } else if (choice == 2) {
            System.out.println("Conversion from Roman Numeral selected");
        }
    }
