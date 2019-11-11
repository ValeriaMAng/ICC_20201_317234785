package shapesSVG;

//Clase Circulo que extiende a Shape
public class Círculo extends Shape{

    private Vector2 cen;
    private double rad;
    private double perimetro;
    private double area;

    //Metodos constructores
    public Círculo (){

        super();
        this.cen = new Vector2(0, 0);
        this.rad = 0 ;
        this.perimetro = 0;
        this.area = 0;
    }

    public Círculo (Vector2 cen, double rad){

        super();
        this.cen = cen;
        this.rad = rad;
        this.perimetro = calcularPerimetro();
        this.area = calcularArea();
    }

    public Círculo (double x, double y, double rad) {
        
        super();        
        this.cen = new Vector2(x, y);
        this.rad = rad;
        this.perimetro = calcularPerimetro();
        this.area = calcularArea();
    }
  
    //Metodos abstractos
    public double calcularPerimetro(){
       
        return 2*(Math.PI)*(rad) ;
    }

    public double calcularArea(){
       
        return (Math.PI)* (rad*rad);
    }

    //Getters y setters
    public void setCentro (Vector2 cen) {
        
        this.cen = cen;
    }

    public void setRadio (double rad) {
        
        this.rad = rad;
    }

    public Vector2 getCen () {
            
        return this.cen;
    }

    public double getRad () {
        
        return this.rad;
    }

    public double getPerimetro () {
        
        return this.perimetro;
    }

    public double obtenerArea () {
        
        return this.area;
    }
    
    //Metodo toString y metodo equals
    @Override
    public String toString () {
        
        return "Centro: "+this.cen.toString()+"Radio: "+this.rad;
    } 

    @Override
    public boolean equals (Object p){
        
        if(!(p instanceof Círculo)) return false;
        @SuppressWarnings("unchecked") Círculo cir = (Círculo) p;
        return this.rad == cir.getRad() && this.cen.equals(cir.getCen());
    }

    //Metodo toSVG
    public String toSVG () {
        
        String svg = "<circle cx=\""+ this.cen.getX() + "\" cy=\"" + this.cen.getY() + "\" r=\"" + this.rad + "\" stroke=\"blue\" stroke-width=\"4\" fill=\"orange\" />";
        return svg;
    }

}
