//--Hierarchical Inheritance--
import java.util.Scanner;

class Dimension{
    protected 
    int dim;

    public 
    Dimension(int dim){
        this.dim=dim;
    }
}

class Square extends Dimension{
    Square(int dim){
        super(dim);
    }

    void sqarea(){
        System.out.println("Area of Square:"+ dim*dim);
    }
}

class Triangle extends Dimension{
    Triangle(int dim){
        super(dim);
    }

    void triarea(){
        System.out.println("Area of Triangle:"+ (0.5*dim*dim));
    }
}

public class Inheritance{
    public static void main(String[] args) {
      Scanner s1 = new Scanner(System.in);  

      System.out.println("Enter any Value :");
      int value=s1.nextInt();

      Square s = new Square(value);
      Triangle t = new Triangle(value);

      s.sqarea();
      t.triarea();

    }
}