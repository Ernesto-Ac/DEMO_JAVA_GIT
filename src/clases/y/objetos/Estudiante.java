package clases.y.objetos;


public class Estudiante {
    long carnet;
    String nombre, apellido;
    
    public void registroEstudiante(){
        System.out.println("Metodo para registro de Estudiante:");
    }
    
    public  void consultarEstudiante() {
        System.out.println("Metodo para consultar de estudiante");
    }
    
    public  void eliminarEstudiante() {
        System.out.println("Metodo para eliminar de estudiante");
    }
    
    public static void main(String[] args) {
        Estudiante est = new Estudiante(); //El objeto est es la instancia de de la clase Estudiante
        
        //como ya instanciamos el objeto anteriormente es obvio que podremos 
        //acceder a el con un simple punto
        est.carnet = 1234;
        est.nombre = "Chepe ";
        est.apellido = "Acevedo";
        
        est.registroEstudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        
        System.out.println("Carnet: " +est.carnet);
        System.out.println("Nombre: " + est.nombre);
        System.out.println("Apellido: " + est.apellido);   
    }
}
