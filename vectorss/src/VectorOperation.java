import java.util.ArrayList;
import java.util.Scanner;

public class VectorOperation {
    private ArrayList<Double> vector1;
    private ArrayList<Double> vector2;

    public VectorOperation(ArrayList<Double> vector1, ArrayList<Double> vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }
    private  void read(ArrayList<Double> vector){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input vector");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        for (String part : parts) {
                double val = Double.parseDouble(part);
                vector.add(val);
        }
    }
}
