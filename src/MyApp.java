import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Akkul\\IdeaProjects\\untitled\\src\\source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point point = new Point((int) x, (int) y);
           shape.add(point);
       }

       System.out.println(shape.perimetr());
       System.out.println(shape.LongestSide());
    }
}