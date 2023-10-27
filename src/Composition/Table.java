package Composition;
import java.util.*;

public class Table {
    private Integer width;
    private Integer length;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs, Integer width, Integer length) {
        this.width = width;
        this.length = length;
        for(int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }

    public static void main(String[] args) {
        var myTable = new Table(4, 20, 10);
    }
}
