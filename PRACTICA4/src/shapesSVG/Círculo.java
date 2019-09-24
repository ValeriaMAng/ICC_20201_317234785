package shapesSVG;


public class Círculo {


    private Vector2 cen;
    private double rad;
    private double perimetro;
    private double area;


public Círculo () {
        this.cen = new Vector2(0, 0);
        this.rad = 0 ;
        this.perimetro = 0;
        this.area = 0;
    }



public Círculo (Vector2 cen, double rad) {
        this.cen = cen;
        this.rad = rad;
        this.perimetro = 2 * Math.PI * this.rad;
        this.area = Math.PI * this.rad * this.rad;
    }



public Círculo (double x, double y, double rad) {
        this.cen = new Vector2(x, y);
        this.rad = rad;
        this.perimetro = 2 * Math.PI * this.rad;
        this.area = Math.PI * this.rad * this.rad;
    }



 public void setCentro (Vector2 cen) {
        this.cen = cen;
    }

 

public void setRadio (double rad) {
        this.rad = rad;
        this.perimetro = 2 * Math.PI * this.rad;
        this.area = Math.PI * this.rad * this.rad;
    }


public Vector2 getCen () {
        return this.cen;
    }



public double getRad () {
        return this.rad;
    }



public double obtenerPerimetro () {
        return this.perimetro;
    }



public double obtenerArea () {
        return this.area;
    }



@Override
    public String toString () {
        String string = "el circulo tiene su centro en: " + this.cen.toString() + " con un radio de "+this.rad +" el circulo tiene un perimetro de: " + this.perimetro +" y un area de: "+ this.area;
        return string;
    } 



    @Override
    public boolean equals (Object P){
        if(P instanceof Círculo){
            Círculo círculo = (Círculo)P;
        return rad == círculo.getRad ();
        } else return false;
    }



    public String toSVG () {
        String svg = "<circle cx=\"" + this.cen.getX() + "\" cy=\"" + this.cen.getY() + "\" r=\"" + this.rad + "\" stroke=\"blue\" stroke-width=\"4\" fill=\"orange\" />";
        return svg;
    }

}
