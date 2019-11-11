package shapesSVG;

//Clase vector que crea un vector
public class Vector2 {
    
    private double X;
    private double Y;
    private double magnitud;
 
    //Metodos constructores
    public Vector2(){
        
        this.X = 0;
        this.Y = 0;
        this.magnitud = 0;
    }

    public Vector2 (double X, double Y) {
        
        this.X = X;
        this.Y = Y;
        this.magnitud = Math.sqrt(this.X*this.X+this.Y*this.Y);
    }

    //Getters y setters    
    public void setX (double X) {
        
        this.X = X;
    }

    public void setY (double Y) {
        
        this.Y = Y;
    }

    public double getX () {
        
        return this.X;
    }


    public double getY () {
        
        return this.Y;
    }

    public double distancia (Vector2 vector) {
        
        return Math.sqrt((vector.getX()-this.X)*(vector.getX()-this.X)+(vector.getY()-this.Y)*(vector.getY()-this.Y));
    }

    //Metodo toString y metodo equals    
    @Override
    public String toString () {
        
        String string = "( " + this.X + " , " + this.Y + " )";
        return string;
    }

    @Override
    public boolean equals (Object P){
        
        if(P instanceof Vector2){
            Vector2 vector = (Vector2)P;
            if(this.X == vector.getX() && this.Y == vector.getY()){
                return true;
            } else return false;
        } else return false;
    }

    //Metodo toSVG
    public String toSVG () {
        
        String svg = "<circle cx=\"" + this.X + "\" cy=\"" + this.Y + "\" r=\"1\" stroke=\"blue\" stroke-width=\"0\" fill=\"red\" />";
        return svg;
    }
}
