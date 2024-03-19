import java.util.ArrayList;
import java.util.List;

public class VectorLengthMismatchException extends Exception {
private  int lenght1;
private  int lenght2;

    public VectorLengthMismatchException(int lenght1, int lenght2) {
        this.lenght1 = lenght1;
        this.lenght2 = lenght2;
    }

    public int getLenght1() {
        return lenght1;
    }

    public void setLenght1(int lenght1) {
        this.lenght1 = lenght1;
    }

    public int getLenght2() {
        return lenght2;
    }

    public void setLenght2(int lenght2) {
        this.lenght2 = lenght2;
    }
}
