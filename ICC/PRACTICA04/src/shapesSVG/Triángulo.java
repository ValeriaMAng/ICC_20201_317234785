package shapesSVG;



public class Triángulo {


    private Vector2 a;
    private Vector2 b;
    private Vector2 c;
    private double perimetro;
    private double area;



    public Triángulo () {
        this.a = new Vector2(0,0);
        this.b = new Vector2(0, 0);
        this.c = new Vector2(0, 0);
        this.perimetro = 0;
        this.area = 0;
    }


    public Triángulo (Vector2 a, Vector2 b, Vector2 c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimetro = this.a.distancia(this.b) + this.a.distancia(this.c) + this.b.distancia(this.c);
        this.area = Math.abs(this.a.getX() * this.b.getY() - this.a.getX() * this.c.getY() - this.a.getY() * this.b.getX() + this.a.getY() * this.c.getX() + this.b.getX() * this.c.getY() - this.b.getY() * this.c.getX()) / 2;
    }



    public Triángulo (double x1, double y1, double x2, double y2, double x3, double y3) {
        this.a = new Vector2(x1, y1);
        this.b = new Vector2(x2, y2);
        this.c = new Vector2(x3, y3);
        this.perimetro = this.a.distancia(this.b) + this.a.distancia(this.c) + this.b.distancia(this.c);
        this.area = Math.abs(this.a.getX() * this.b.getY() - this.a.getX() * this.c.getY() - this.a.getY() * this.b.getX() + this.a.getY() * this.c.getX() + this.b.getX() * this.c.getY() - this.b.getY() * this.c.getX()) / 2;
    }



    public void setVert1 (Vector2 a) {
        this.a = a;
        this.perimetro = this.a.distancia(this.b) + this.a.distancia(this.c) + this.b.distancia(this.c);
        this.area = Math.abs(this.a.getX() * this.b.getY() - this.a.getX() * this.c.getY() - this.a.getY() * this.b.getX() + this.a.getY() * this.c.getX() + this.b.getX() * this.c.getY() - this.b.getY() * this.c.getX()) / 2;
    }



    public void setVert2 (Vector2 b) {
        this.b = b;
        this.perimetro = this.a.distancia(this.b) + this.a.distancia(this.c) + this.b.distancia(this.c);
        this.area = Math.abs(this.a.getX() * this.b.getY() - this.a.getX() * this.c.getY() - this.a.getY() * this.b.getX() + this.a.getY() * this.c.getX() + this.b.getX() * this.c.getY() - this.b.getY() * this.c.getX()) / 2;
    }



    public void setVert3 (Vector2 c) {
        this.c = c;
        this.perimetro = this.a.distancia(this.b) + this.a.distancia(this.c) + this.b.distancia(this.c);
        this.area = Math.abs(this.a.getX() * this.b.getY() - this.a.getX() * this.c.getY() - this.a.getY() * this.b.getX() + this.a.getY() * this.c.getX() + this.b.getX() * this.c.getY() - this.b.getY() * this.c.getX()) / 2;
    }



    public Vector2 getVert1 () {
        return this.a;
    }



    public Vector2 getVert2 () {
        return this.b;
    }



    public Vector2 getVert3 () {
        return this.c;
    }



    public double getPerimetro () {
        return this.perimetro;
    }



    public double getArea () {
        return this.area;
    }



    @Override
    public String toString () {
        String string = "el triangulo tiene cordenadas: " +this.a.toString()+ ", "+this.b.toString()+", "+this.c.toString() +" un perimetro de: "+this.perimetro+" y un area de: "+this.area;
        return string;
    }


    @Override
    public boolean equals (Object P){
        if(P instanceof Triángulo){
            Triángulo triangulo = (Triángulo)P;
          return perimetro == triangulo.getPerimetro() && area == triangulo.getArea();
        } else return false; 
    }



    public String toSVG () {
        String svg = "<polygon points=\"" + this.a.getX() + "," + this.a.getY() + " " + this.b.getX() + "," + this.b.getY() + " " + this.c.getX() + "," + this.c.getY() + "\" style=\"fill:green;stroke:yellow;stroke-width:4\" />";
        return svg;
    }

}
