public class Pay
{
    public static void main(String[] args)
    {
    // compute total pay given a rate and hours

    int hoursWorked = Integer.parseInt(args[0]);
    double payRate = Double.parseDouble(args[1]);

    if ((hoursWorked < 0) || (payRate < 0.0))
    {
       System.out.println("Bad Input");
    }
    else
    {
        double pay = hoursWorked * payRate;
        System.out.println(pay);
    }

    }
}