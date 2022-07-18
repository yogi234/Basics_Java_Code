import java.util.Scanner;

public class BinarySearch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("The Size of Array = ");
        int n=sc.nextInt();
        int startIndex=0;
        int endIndex=n-1;
        int ansIndex=-1;
        int arr[]=new int[n];
        System.out.print("The value of Array = ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The value of key = ");
        int key=sc.nextInt();
        sc.close();
        while(startIndex<=endIndex)
        {
            int minIndex=startIndex+endIndex/2;
            if(arr[minIndex]==key)
            {
                ansIndex=minIndex;
                System.out.println("The Key Index is "+ansIndex);
                break;
            }
            else if(arr[minIndex]>key)
            {
                endIndex=minIndex-1;
            }
            else
            {
                startIndex=minIndex+1;
            }
        }
        
    }
}

/*Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int s=0;
      int e=n-1;
      int ans=-1;
      while(e>=s)
        {
          int k=(s+e)/2;
          if(arr[k]==x)
          {
            ans=k;
          System.out.println(ans);
            return;
          }
          else if(arr[k]<x)
          {
            ans=k;
            s=k+1;
          }
          else
            e=k-1;
        }
      System.out.println(ans);*/