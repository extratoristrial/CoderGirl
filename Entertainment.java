import static java.lang.System.out;
import java.util.Scanner;
public class Entertainment
{
    public static void main(String[] args)
    {
        //questions
        Scanner keyboard = new Scanner(System.in);
        String weather;
        String mood;
        out.print("What is the weather like today? Sunny, cloudy, or rainy? ");
        weather = keyboard.next();
        out.print("What kind of mood are you in today? Exercise, party, or quiet? ");
        mood = keyboard.next();

        //suggestion
        if (weather.equals("sunny") && mood.equals("exercise"))
        {
            out.println("For exercise on a sunny day, try a walk in the park!");
        }
        else if (weather.equals("sunny") && mood.equals("party"))
        {
            out.println("For a fun party on a sunny day, look for a street festival!");
        }
        else if (weather.equals("sunny") && mood.equals("quiet"))
        {
            out.println("A sunny day is a beautiful time to read a book.");
        }
        else if (weather.equals("cloudy") && mood.equals("exercise"))
        {
            out.println("For exercise on a cloudy day, the botanical gardens is a lovely walk.");
        }
        else if (weather.equals("cloudy") && mood.equals("party"))
        {
            out.println("For a party on a cloudy day, ride the paddle boats!");
        }
        else if (weather.equals("cloudy") && mood.equals("quiet"))
        {
            out.println("On a cloudy day, take a camera or paints to sketch the flowers!");
        }
        else if (weather.equals("rainy") && mood.equals("exercise"))
        {
            out.println("Giant indoor trampolines are a fun place!");
        }
        else if (weather.equals("rainy") && mood.equals("party"))
        {
            out.println("See if your friends are up for board games!");
        }
        else if (weather.equals("rainy") && mood.equals("quiet"))
        {
            out.println("A rainy day is a peaceful time to daydream");
        }
        else
        {
            out.println("You did not enter a valid option");
        }

    }
}
