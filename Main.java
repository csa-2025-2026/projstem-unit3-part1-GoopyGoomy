import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Rectangle r1 = new Rectangle(2.9, 5.4);

    //Make another rectangle measuring 5.4 by 2.8
    // && is the same as AND
    Rectangle r2 = new Rectangle(5.4, 2.8);

    boolean lengthSameWidth = r2.getLength() == r2.getWidth();
    boolean widthSameLength = r1.getWidth() == r2.getLength();
    boolean isRotated = lengthSameWidth && widthSameLength;
    boolean isCongruent = r1.equals(r2) || isRotated;
    double lengthRatio = r1.getLength()/r2.getLength();
    double widthRatio = r1.getWidth()/r2.getWidth();
    boolean equalRatio = lengthRatio == widthRatio;
    boolean isSimilar = (isCongruent == true) || (equalRatio == true);

    System.out.println(isCongruent);
    System.out.println(isSimilar);

    // Logical AND - &&
    // Logical OR = ||
    // r1.equals(r2) 
  }
}
