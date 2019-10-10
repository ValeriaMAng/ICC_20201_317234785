package shapesSVG;

public class Main{
    
    public static void main(String[] args){

	Vector2 vec = new Vector2(30, 60);
	Línea lin = new Línea(100, 100, 20, 20);
	Rectángulo rec = new Rectángulo(150, 60, 70, 20);
	Triángulo tri = new Triángulo(0, 0, 50, 20, 20, 40);
    Círculo cir = new Círculo(50, 50, 50);
	String htmlInicio = "<!DOCTIPE html>" + "\n" + "    <html>" + "\n" + "        <body>";


	String svgInicio = "<svg width=\"1000\" height=\"1000\">";
        String svgFin = "</svg>";
        String htmlFin = "        </body>" + "\n" + "    </html>";

        System.out.println(htmlInicio + "\n" + svgInicio);
	System.out.println(cir.toSVG());
	System.out.println(vec.toSVG());
	System.out.println(lin.toSVG());
	System.out.println(rec.toSVG());
	System.out.println(tri.toSVG());
	System.out.println(svgFin + "\n" + htmlFin);
    }
}

