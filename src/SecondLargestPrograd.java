import java.util.Scanner;

public class SecondLargestPrograd {
    public static int secondLarge(int[] array)
    {
        int max=-1;
        int old=-1;
        for(int i:array)
        {
            if(i>max)
            {
                old=max;
                max=i;
            }
            else if (i<max ){
                if(old<i)
                {
                    old=i;
                }
            }
        }
        return old;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfarray=scanner.nextInt();
        int[] array = new int[sizeOfarray];
        for(int i =0 ; i < sizeOfarray ; i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println(secondLarge(array));
    }
}
