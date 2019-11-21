import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import processing.core.PApplet;
import processing.core.PImage;

public class Writter extends PApplet {

    public static void main(String[] args) {
        
        PApplet.main("Writter");
    }

    // Establece el tamaño de la ventana
    @Override
    public void settings() {
        
        size(400, 400);
    }

    // Establece el color de la ventana y obtiene las coordenadas del archivo
    @Override
    public void setup() {
        
        fill(125, 135, 143);
        String file = getClass().getResource("numeros.csv").getPath();
        draw2(file);
    }

    // Metodo que dibuja los puntos en las coordenadas del archivo y calcula las coordenadas polares
    public void draw2(String file) {
        
        try {
            float rad = 2;
            List<String> lines = Files.readAllLines(Paths.get(file));
            for (String string : lines) {
                String row[] = string.split(",");
                ellipse(Float.parseFloat(row[0]), Float.parseFloat(row[1]), rad, rad);
                float r = sqrt((Float.parseFloat(row[0]))*(Float.parseFloat(row[0])) + (Float.parseFloat(row[1]))*(Float.parseFloat(row[1])));
                double theta = Math.atan((Double.parseDouble(row[1]))/(Double.parseDouble(row[0])));
                System.out.println("r = " + r + ", θ = " + theta);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
