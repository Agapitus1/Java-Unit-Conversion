import java.util.*;
public class Conversion
{
    private final double F_RATIO = 9.0/5;
    private final double K_RATIO = 8.0/5;
    private Scanner in = new Scanner(System.in);

    public Conversion()
    {
        menu();
    }

    private void menu()
    {
        char action = readChoice();
        while (action != 'X')
        {
            if(action == 'F')
            {
                changeToFah();
            }
            else if(action == 'K')
            {
                changeToKilo();
            }
            else if(action == 'M')
            {
                mileConversion();
            }
            else if(action == 'T')
            {
                averageTemp();
            }
            else if(action == '?')
            {
                help();
            }
            action = readChoice();
        }
    }

    private void mileConversion()
    {
        System.out.println("Enter low mileage: ");
        int low = in.nextInt();
        System.out.println("Enter high mileage: ");
        int high = in.nextInt();
        while(low <= high)
        {
            double kilo = toKilometres(low);
            System.out.println(low + " miles is equal to " + kilo + "KM");
            low++;
        }
    }

    private void averageTemp()
    {
        int i=0;
        double total=0.0;
        do
        {
            System.out.println("Enter the 6 temperatures(celcius): ");
            double temp = in.nextDouble();
            total = total + temp;
            i++;
        }
        while(i<6);
        double avg= total/i;
        double fah = toFahrenheit(avg);
        System.out.println("Average temperature is " + fah + "F");
    }

    private char readChoice()
    {
        System.out.println("Please enter your choice (F, K, M, T, X, ?): ");
        return in.next().toUpperCase().charAt(0);
    }

    private void changeToFah()
    {
        System.out.println("Enter the degrees in celsius: ");
        double cel = in.nextDouble();
        double fah = toFahrenheit(cel);
        System.out.println(cel + " degrees is " + fah + "F");
    }

    private void changeToKilo()
    {
        System.out.println("Enter the distances in miles: ");
        double mil = in.nextDouble();
        double kilo = toKilometres(mil);
        System.out.println(mil + " distance is " + kilo + "KM");
    }

    private void help()
    {
        System.out.println("Enter F (Conver celsius to fahrenheit), K(Convert miles to kilometres), M(Rang of miles), T(Average of temperatures) or X(Exit)");
    }

    public double toFahrenheit(double celsius)
    {
        double fahrenheit = F_RATIO * celsius + 32;
        return fahrenheit;
    }

    public double toKilometres(double miles)
    {
        double kilometres = K_RATIO * miles;
        return kilometres;
    }

}