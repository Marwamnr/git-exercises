public class Main
{
    public static void main(String[] args)
    {
        int numbers = 100;

        int dividedBy3 = 3;

        int dividedBy5 = 5;

        for (int i = 0; i <= numbers; i++)
        {
            if (i % dividedBy3 == 0 && i % dividedBy5 == 0)
            {
                System.out.println("FizzBuzz");
            }
               else if (i % dividedBy3 == 0)
                {
                    System.out.println("Fizz");
                }
                else if (i % dividedBy5 == 0)
                {
                    System.out.println("Buzz");
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
    }
