package shapesSVG;

//Clase Rectangulo que extiende a Shape
public class Rectángulo extends Shape{

    private Vector2 a;
    private double alto;
    private double ancho;
    private double perimetro;
    private double area;

    //Metodos constructores
    public Rectángulo () {

        super();
        this.a = new Vector2(0,0);
        this.alto = 0;
        this.ancho = 0;
        this.perimetro = 0;
        this.area = 0;
    }

    public Rectángulo (Vector2 a, double alto, double ancho) {
        
        super();
        this.a = a;
        this.alto = alto;
        this.ancho = ancho;
        this.perimetro = calcularPerimetro();
        this.area = calcularArea();
    }

    public Rectángulo (double x, double y, double alto, double ancho) {
        
        super();        
        this.a = new Vector2(x, y);
        this.alto = alto;
        this.ancho = ancho;
        this.perimetro = calcularPerimetro();
        this.area = calcularArea();
    }    

    //Metodos abstractos
    public double calcularPerimetro(){
      
        return this.alto * 2 + 2 * ancho;
    }

    public double calcularArea(){
      
        return this.alto * ancho;
    }
    
    //Getters y setters
    public void setVert (Vector2 a) {
    
        this.a = a;
    }

    public void setAlto (double alto) {
        
        this.alto = alto;
    }

    public void setAncho (double ancho) {
    
        this.ancho = ancho;
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

    public double getPerimetro () {
        
        return this.perimetro;
    }

    public double getArea () {
       
        return this.area;
    }

    //Metodo toString y metodo equals
    @Override
    public String toString () {
        
        String string = "El rectangulo tiene un punto en:" +this.a.toString()+"con una anchura de: "+this.ancho+" y una altura de: "+this.alto +"tiene un perimetro de: "+this.perimetro+" y un area de: "+this.area;
        return string;
    }

    @Override
    public boolean equals (Object p){
        
        if(p instanceof Rectángulo){
            Rectángulo rectangulo = (Rectángulo)p;
            return ancho == rectangulo.getAncho() && alto == rectangulo.getAlto();
        } else return false;
    }

    //Metodo toSVG
    public String toSVG () {
        String svg = "<rect x=\"" + this.a.getX() + "\" y=\"" + this.a.getY() + "\" width=\"" + this.ancho + "\" height=\"" + this.alto + "\" style=\"fill:pink;stroke-width:4;stroke:red\" />";
        return svg;
    }

}
