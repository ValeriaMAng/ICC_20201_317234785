package shapesSVG;

//Clase abstracta Shape
public abstract class Shape implements Comparable<Shape>{
  
    protected double perimetro;
    protected double area;
 
    //Constructor y getters  de la clase Shape
    public Shape(){}
  
    public double getPerimetro(){
     
        return this.perimetro;
    }
    
    public double getArea(){
        
        return this.area;
    }
  
    //Metodos abstractos
    abstract public double calcularPerimetro();
    abstract public double calcularArea();
    abstract public String toSVG();

    @Override
    public int compareTo(Shape sha){
        
        if(this.area < sha.getArea()) return -1;
        if(this.area> sha.getArea()) return 1;
        if(this.area == sha.getArea()) return 0;
        return -1; 
    }

    //Método equals
    @Override
    public boolean equals(Object a){
    
        if(!(a instanceof Shape)) return false;
        @SuppressWarnings("unchecked") Shape p = (Shape) a;
        return (p.calcularArea() == this.area) && (p.calcularPerimetro()==this.perimetro);
    }
  
    //Método toString
    @Override
    public String toString(){
    
        return "El Perímetro es: "+this.perimetro+ ",El Area es: "+this.area;
    }
}
