class DigitSum
{
    public static void main(String args[])
    {
        int n = 1234;
        int sum = 0;

        while(n > 0)
        {
            sum = sum + n % 10;
            n = n / 10;  6
        }

        System.out.println("Sum of digits = " + sum);
    }
}