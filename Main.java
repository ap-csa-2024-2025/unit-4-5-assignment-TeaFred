package mycustompackage;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //printNTimes("code",3);
    //printNums();
    //uprightNumberTriangle(7);
    //starTree(4);
    //multTable(12);
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      for (int c = 0; c < N; c++)
      {
      String letter = word.substring(i,i+1);
      System.out.print(letter);
      }
    }
  }

  public static void printNums()
  {
    int nUm = 0;
   for (int i = 10; i > 0; i--)
   {
    nUm = i;
    for (int c = i; c > 0; c--)
    {
      System.out.println(nUm + " ");
    }
   }
  }

  public static void uprightNumberTriangle(int N)
  {
    int nUm2;
    int counter = 0;
    for (int i = 0; i < N+1; i++)
    {
      for (int c = 1; c < counter+1; c++)
      {
        nUm2 = c;
        System.out.print(nUm2 + " ");
      }
      counter++;
      System.out.println();
    }
  }

  public static void starTree(int h)
  {
    int theSpace = 0;
    for (int i = 0; i < h; i++)
    {
      for (int s = 0; s < theSpace; s++)
      {
        System.out.print(" ");
      }
      theSpace++;
      for (int a = i; a < h; a++)
      {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }
  }

  public static void multTable(int nUm2)
  {
    for (int i = 1; i <= nUm2; i++)
    {
      for (int m = 1; m <=10; m++)
      {
        System.out.print((i*m) + " ");
      }
      System.out.println("");
    }
  }
}
