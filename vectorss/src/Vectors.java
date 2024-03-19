import java.util.ArrayList;

public class Vectors {
    public static void main(String[] args) {
        ArrayList<Double> vector1 = new ArrayList<>();
        ArrayList<Double> vector2 = new ArrayList<>();

        VectorOperation  vectors =  new VectorOperation(vector1,vector2);
        vectors.navigate();
    }
}