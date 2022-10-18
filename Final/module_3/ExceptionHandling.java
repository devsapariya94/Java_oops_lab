public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String name = "dev232";

        for(char c : name.toCharArray())
        {
            try
            {
                if((int)(c) <= 57 && (int)(c) >= 48){
                    throw new NumberFormatException();
                }
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("There's a number in your name!");
                break;
            }
        }
    }
}