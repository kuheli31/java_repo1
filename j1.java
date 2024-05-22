import java.util.Scanner;

public class j1 {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n,i,f=0;
        System.out.print("Enter a number=");
        n=sc.nextInt();
        int m[]=new int[5];
        System.out.println("Enter array=");
        for(i=0;i<5;i++)
        {
            m[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(m[i]==n)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Not found.");
        }
        else
        {
            System.out.println("Found.");
        }
    }
}
