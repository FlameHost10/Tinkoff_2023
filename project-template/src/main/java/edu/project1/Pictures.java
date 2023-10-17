package edu.project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Pictures {
    private final ArrayList<String[]> array_pictures = new ArrayList<>();

    public Pictures(){
        String[] first = new String[]
            {"       ", "       ","       ","       ","       "," *     ","* *    "};
        array_pictures.add(first);

        String[] second = new String[]
            {" *      ", " *      ", " *      ", " *      ", " *      "," *     ","* *    "};
        array_pictures.add(second);

        String[] third = new String[]
            {" ***** ", " *   * "," *      "," *      "," *      "," *     ","* *    "};
        array_pictures.add(third);

        String[] fourth = new String[]
            {" ***** ", " *   * "," *   @ "," *      "," *      "," *     ","* *    "};
        array_pictures.add(fourth);


        String[] fifth = new String[]
            {" ***** ", " *   * "," *   @ "," *  -!-"," *  / \\"," *     ","* *    "};
        array_pictures.add(fifth);
    }

    public void output(int ind){
        for(var elem: array_pictures.get(ind)){
            System.out.println(elem);
        }
    }
}
