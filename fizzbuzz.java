
/**
 * Write a description of class fizzbuzz here.
 * check multiples of 3,5,7 etc. and print the appropriate word/number
 * @author (Jack)
 * @version (a version number or a date)
 */
public class fizzbuzz
{
    public static void main (String [] args){
        for (int i=1; i < 101; i++){
            // 3 combos    
                if (i%3 ==0 && i%5 == 0)

                    System.out.print("FizzBuzz \n");
                else if(i%3 ==0 && i%7 ==0){
                    System.out.print("FizzFuzz \n");
                }else if (i%3 == 0){
                        System.out.print("Fizz \n");
                }
                
                
                //5 combos
                else if (i%5 == 0){
                        System.out.print("Buzz \n");
                }else if(i%5 ==0 && i%7 ==0){
                    System.out.print("BuzzFuzz \n");
                }
                
                //7 combos
                else if (i%7 ==0){
                        System.out.print("Fuzz \n");
                        
                        
                
                }else{
                        System.out.print(i + "\n");
                            
            }
        }
    }
}
