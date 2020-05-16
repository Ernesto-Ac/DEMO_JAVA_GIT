package ejemplo.Estudiante;


public class sueldo {
  double ht, pxh;
    
      public sueldo() {
    }
    
    public sueldo(double ht, double pxh) {
        this.ht = ht;
        this.pxh = pxh;
    }

  
    

    public double getHt() {
        return ht;
    }

    public void setHt(double ht) {
        this.ht = ht;
    }

    public double getPxh() {
        return pxh;
    }

    public void setPxh(double pxh) {
        this.pxh = pxh;
    }
    
        
      
        
  public double sueldo(){
      double pago = this.ht * this.pxh;
      return pago;
  }
  
  public double sueldoDesc(sueldo s){
      double x = 0;
      x = sueldo() - (sueldo()*.10);
      return x;
  }
  
  
 
}