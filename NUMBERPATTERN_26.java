class NUMBERPATTERN_26
{
    public static void main()
    {
         int n = 8;
        for (int i = 1; i <= 8; i++)
        {
           

            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}