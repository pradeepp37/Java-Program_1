//Program: Find the element repeating twice in an array without using nested loops.
//Code:
public class Main
{
  public static void main (String args[])
  {
    RepeatingElement rep = new RepeatingElement ();
    int arr[] = { 7, 3, 4, 8, 9, 7, 2, 6, 1, 3, 9};
    int size = arr.length;
    int count[] = new int[20];
    int i;

      System.out.println ("Repeated Elements are:");
    for (i = 0; i < size; i++)
    {
	    if (count[arr[i]] == 1)
	    {
	      System.out.println (arr[i]);
	    }
	    else
	    {
	      count[arr[i]]++;
	    }
    }
  }
}
