public class Matrix{

    private int f;
    private int c;
    private double [][]matrix;
	
    //Construye una matriz vacia de n por m
    public Matrix(int n, int m){
	    this.f = n;
	    this.c = m;
	    this.matrix= new double [this.f][this.c];
    }

    
    //Construye una matriz dado un arreglo
    public Matrix(double[][] array){
	    this.matrix = array;
    }
    
    
    //Función que calcula producto escalar
    public void scalarProduct(double scalar){
	    for (int a=0;a<this.matrix.length;a++){
			for (int b=0;b<this.matrix[0].length;b++){
				this.matrix[a][b] = this.matrix[a][b]*scalar;
			}	
		}
	}


    
    //Función que calcula suma de matrices
    public void add(Matrix m){
	        for(int a = 0; a< this.matrix.length; a++){
		        for (int b = 0; b<this.matrix[0].length; b++){
		            this.matrix [a][b] = this.matrix [a][b] + m.matrix [a][b];
		        }
	        }
	}

    
    //Función que calcula producto de matrices
    public void matrixProduct(Matrix m){
	    int tc=m.matrix[0].length,tf=this.matrix.length;
		    double mat[][]=new double[tf][tc];
		        for(int a=0;a<this.matrix.length;a++){
			        for(int b=0;b<m.matrix[0].length;b++){
				        for(int c=0;c<m.matrix.length;c++){
					        mat [a][b]+=this.matrix[a][c]*m.matrix[c][b];
				        }
			        }
		        }
		        this.matrix=mat;
	}

    //Función que obtiene el elemento i j
    public double getElement(int i, int j){
        return this.matrix[i][j];
	}
    

    //function set element
    public void setElement(int i, int j,double e){
        this.matrix[i][j]=e;
	}

    //Función que calcula el determinante si es nxn
    public double determinant(){
        if(matrix.length!=matrix[0].length){
            return 0;   
        }
        double res = 0;
            if (matrix.length == 1){
                res = matrix [0][0];
                return res;
            }
                if (matrix.length ==2){
                    res = ((matrix [0][0]* matrix [1][1])-(matrix[0][1]*matrix[1][0]));
                    return res;
                }
            return res;
    }


    //Función que te dice si 2 matrices son iguales
    @Override
    public boolean equals(Object o){
        if(o instanceof Matrix){
			Matrix mat = (Matrix)o;
			if(mat.matrix.length == this.matrix.length){
				if (mat.matrix[0].length == this.matrix[0].length){
					for (int a=0;a<mat.matrix.length;a++){
						for (int b=0;b<mat.matrix[0].length;b++){
							if(mat.matrix[a][b]!= this.matrix[a][b]){
								return false;
							}
						}	
					}
					return true;
				}
			}
		}
		return false;
	}
}
