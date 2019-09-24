package shapesSVG;



public class Rectángulo {


    private Vector2 a;
    private double alto;
    private double ancho;
    private double perimetro;
    private double area;



    public Rectángulo () {
        this.a = new Vector2(0,0);
        this.alto = 0;
        this.ancho = 0;
        this.perimetro = 0;
        this.area = 0;
    }



    public Rectángulo (Vector2 a, double alto, double ancho) {
        this.a = a;
        this.alto = alto;
        this.ancho = ancho;
        this.perimetro = 2 * (this.alto + this.ancho);
        this.area = this.alto * this.ancho;
    }



    public Rectángulo (double x, double y, double alto, double ancho) {
        this.a = new Vector2(x, y);
        this.alto = alto;
        this.ancho = ancho;
        this.perimetro = 2 * (this.alto + this.ancho);
        this.area = this.alto * this.ancho;
    }    



    public void setVert (Vector2 a) {
        this.a = a;
    }



    public void setAlto (double alto) {
        this.alto = alto;
        this.perimetro = 2 * (this.alto + this.ancho);
        this.area = this.alto * this.ancho;
    }



    public void setAncho (double ancho) {
        this.ancho = ancho;
        this.perimetro = 2 * (this.alto + this.ancho);
        this.area = this.alto * this.ancho;
    }



    public Vector2 getVert () {
        return this.a;
    }



    public double getAlto () {
        return this.alto;
    }



    public double getAncho () {
        return this.ancho;
    }



    public double obtenerPerimetro () {
        return this.perimetro;
    }



    public double obtenerArea () {
        return this.area;
    }


    @Override
    public String toString () {
        String string = "el rectangulo tiene un punto en:" +this.a.toString()+"con una anchura de: "+this.ancho+" y una altura de: "+this.alto +"tiene un perimetro de: "+this.perimetro+" y un area de: "+this.area;
        return string;
    }



    @Override
    public boolean equals (Object P){
        if(P instanceof Rectángulo){
            Rectángulo rectangulo = (Rectángulo)P;
        return ancho == rectangulo.getAncho() && alto == rectangulo.getAlto();
        } else return false;
    }



    public String toSVG () {
        String svg = "<rect x=\"" + this.a.getX() + "\" y=\"" + this.a.getY() + "\" ancho=\"" + this.ancho + "\" alto=\"" + this.alto + "\" style=\"fill:pink;stroke-width:4;stroke:red\" />";
        return svg;
    }

}
