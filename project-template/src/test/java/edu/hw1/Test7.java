package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Test7 {
    @Test
    @DisplayName("циклический сдвиг")
    void cyclic_shift(){
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(8, 1);
        map.put(16, 1);
        map.put(17, 2);
        map.put(0, 2);
        map.put(63, 3);

        for (var elem: map.entrySet()){
            System.out.println("rotateRight\t{" + elem.getKey() + ", " + elem.getValue() + "}\t->\t" + Task7.rotateRight(elem.getKey(), elem.getValue()));
        }
        for (var elem: map.entrySet()){
            System.out.println("rotateLeft\t{" + elem.getKey() + ", " + elem.getValue() + "}\t->\t" + Task7.rotateLeft(elem.getKey(), elem.getValue()));
        }


    }
}
