package shapesSVG;


public class Línea {


    private Vector2 a;
    private Vector2 b;
    private double longitud;



public Línea () {
        this.a = new Vector2(0,0);
        this.b = new Vector2(0, 0);
        this.longitud = 0;
    }


public Línea (Vector2 a, Vector2 b) {
        this.a = a;
        this.b = b;
    }


public Línea (double x1, double y1, double x2, double y2) {
        this.a = new Vector2(x1, y1);
        this.b = new Vector2(x2, y2);
        this.longitud = this.a.distancia(this.b);
    }




    @Override
    public String toString () {
        String string = this.a.toString() + " − " + this.b.toString();
        return string;
    }

public Vector2 getA () {
        return this.a;
    }

public Vector2 getB () {
        return this.b;
    }

    @Override
    public boolean equals (Object P){
        if(P instanceof Línea){
            Línea linea = (Línea)P;
         return a == linea.getA () && b == linea.getB ();
        } else return false;
    }


    public String toSVG () {
        String svg = "<line x1=\"" + this.a.getX() + "\" y1=\"" + this.a.getY() + "\" x2=\"" + this.b.getX() + "\" y2=\"" + this.b.getY() + "\" style=\"stroke:rgb(0,0,0);stroke-width:4\" />";
        return svg;
    }

}
