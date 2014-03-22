package rentautos;
public class RegEmpleados {
  int cedEmpleado;
  String nomEmpleado;
  String apEmpleado;
  String dirEmpleado;
  int telEmpleado;

    public RegEmpleados(int cedEmpleado, String nomEmpleado, String apEmpleado, String dirEmpleado, int telEmpleado) {
        this.cedEmpleado = cedEmpleado;
        this.nomEmpleado = nomEmpleado;
        this.apEmpleado = apEmpleado;
        this.dirEmpleado = dirEmpleado;
        this.telEmpleado = telEmpleado;
    }

    public RegEmpleados() {
    }

    public int getCedEmpleado() {
        return cedEmpleado;
    }

    public void setCedEmpleado(int cedEmpleado) {
        this.cedEmpleado = cedEmpleado;
    }

    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    public String getApEmpleado() {
        return apEmpleado;
    }

    public void setApEmpleado(String apEmpleado) {
        this.apEmpleado = apEmpleado;
    }

    public String getDirEmpleado() {
        return dirEmpleado;
    }

    public void setDirEmpleado(String dirEmpleado) {
        this.dirEmpleado = dirEmpleado;
    }

    public int getTelEmpleado() {
        return telEmpleado;
    }

    public void setTelEmpleado(int telEmpleado) {
        this.telEmpleado = telEmpleado;
    }
  
  
}
