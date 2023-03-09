
package guifilebeolvas;

import java.awt.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GuiFileBeolvas {

    public static void main(String[] args) {
       filebeolvasas();
    }

    private static void filebeolvasas(String file) {
        Path path = Paths.get(file);
        List<String> adatok = new ArrayList<>();
        adatok = Files.readAllLines(path);
        
        String elsoSor = adatok.get(0);
        adatok.remove(elsoSor);
        
        
        for (String adat : adatok) {
            dolgozok.add(new Dolgozok(adat, ";"));
        }
    }
    
}
