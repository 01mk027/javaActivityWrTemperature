import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature");
        temperature = input.nextInt();

        if(temperature < 5)
        {
            System.out.println("Weather calls you to ski.");
        }
        else if(temperature >= 5 && temperature <15)
        {
            System.out.println("Going to cinema is good idea.");
        }
        else if(temperature >= 15 && temperature < 25)
        {
            System.out.println("Picnic must be your favourite activity.");
        }
        else{
            System.out.println("You must swim.");
        }
    }
}
