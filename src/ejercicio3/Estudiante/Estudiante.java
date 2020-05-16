package ejercicio3.Estudiante;


public class Estudiante {
  long nCarnet,nCarnet2,nCarnet3, nCarnet4, nCarnet5;
  String nEstudiante,nEstudiante2,nEstudiante3,nEstudiante4,nEstudiante5;
  String codCarr,codCarr2,codCarr3,codCarr4,codCarr5;

    public Estudiante(long nCarnet, long nCarnet2, long nCarnet3, long nCarnet4, long nCarnet5, String nEstudiante, String nEstudiante2, String nEstudiante3, String nEstudiante4, String nEstudiante5, String codCarr, String codCarr2, String codCarr3, String codCarr4, String codCarr5) {
        this.nCarnet = nCarnet;
        this.nCarnet2 = nCarnet2;
        this.nCarnet3 = nCarnet3;
        this.nCarnet4 = nCarnet4;
        this.nCarnet5 = nCarnet5;
        this.nEstudiante = nEstudiante;
        this.nEstudiante2 = nEstudiante2;
        this.nEstudiante3 = nEstudiante3;
        this.nEstudiante4 = nEstudiante4;
        this.nEstudiante5 = nEstudiante5;
        this.codCarr = codCarr;
        this.codCarr2 = codCarr2;
        this.codCarr3 = codCarr3;
        this.codCarr4 = codCarr4;
        this.codCarr5 = codCarr5;
    }

    public Estudiante() {
    }
  
  public String printEst(long nCarnet, String nEstudiante, String codCarr){
        String info;
        info = "###########################";
        info += "\nN~ CARNET "+ nCarnet;
        info += "\nN~ ESTUDIANTE " + nEstudiante;
        info += "\nCODIGO CARRERA " + codCarr;
        return info;
  }
}
