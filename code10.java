import java.util.*;
class arrange{
  static void arrangeit(int arr[],int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
        {
          int temp;
          if(arr[i]>arr[j])
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
    }
  }
  public static void main (String args[])
  {
    int arr[]={-1,-3,2,5,3,-5};
    int n=arr.length;
    arrangeit(arr,n);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}

#Using inbuilt Function
import java.util.*;
class arrange{
  static void arrangeit(int arr[],int n)
  {
	  Arrays.sort(arr);
  }
  public static void main (String args[])
  {
    int arr[]={-1,-3,2,5,3,-5};
    int n=arr.length;
    arrangeit(arr,n);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
