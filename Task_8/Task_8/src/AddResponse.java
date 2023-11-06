import java.io.Serializable;

public class AddResponse implements Serializable {
    private double result;

    public AddResponse(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    // constructor, getters, and setters
}
