package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static List<String> leer(String ruta){
        List<String> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while((linea = br.readLine()) != null) data.add(linea);
            br.close();
        } catch(Exception ignored){}
        return data;
    }

    public static void guardar(String ruta, List<String> lineas){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            for(String l : lineas){ bw.write(l); bw.newLine(); }
            bw.close();
        } catch(Exception ignored){}
    }
}
