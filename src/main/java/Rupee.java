import java.util.Objects;

public class Rupee {

    private int value;
    public Rupee(int value) {
        this.value = value;

    }


    public boolean equals(Object o) {
        Rupee rupee = (Rupee) o;
        return value == rupee.value;
    }


}
