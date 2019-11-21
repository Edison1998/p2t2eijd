package mx.edu.tesoem.isc.eijd.p2t2eijd;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class global {

    public static ArrayList<String> listColors = new ArrayList<String>();

    public static void addColor(String c){
        listColors.add(c);
    }

    public static ArrayList<String> showColors(){
        return listColors;
    }
}