import java.io.FileWriter;
import java.io.IOException;
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
    private void add() {
        try {
            if (vector1.size() != vector2.size()) {
                throw new VectorLengthMismatchException();
            } else {
                ArrayList<Double> result = new ArrayList<>();
                for (int i = 0; i < vector1.size(); i++) {
                    result.add(vector1.get(i) + vector2.get(i));
                }
                save(result);
            }
        }catch( VectorLengthMismatchException e){
            System.out.println("Different length");
            System.out.println("Try again");
        }
    }
    private  void  save(ArrayList<Double> result){
        try{
            FileWriter  file = new FileWriter("result.txt");
            for (double number : result) {
                file.write(number + " ");
            }
            file.close();

        }catch(IOException e ){
            System.out.println("Error to save the file");
        }

    }
    public void navigate(){
        read(vector1);
        read(vector2);
        add();
    }

}
