package rentautos;
public class RegCliente {
   int cedCliente;
   String NomCliente;
   String apCliente;
   String dirCliente;
   int telCliente;
   String tarjCliente;
   int codSegTarjeta;

    public RegCliente(int cedCliente, String NomCliente, String apCliente, String dirCliente, int telCliente, String tarjCliente, int codSegTarjeta) {
        this.cedCliente = cedCliente;
        this.NomCliente = NomCliente;
        this.apCliente = apCliente;
        this.dirCliente = dirCliente;
        this.telCliente = telCliente;
        this.tarjCliente = tarjCliente;
        this.codSegTarjeta = codSegTarjeta;
    }

    public RegCliente() {
    }

    public int getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(int cedCliente) {
        this.cedCliente = cedCliente;
    }

    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }

    public String getApCliente() {
        return apCliente;
    }

    public void setApCliente(String apCliente) {
        this.apCliente = apCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public int getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(int telCliente) {
        this.telCliente = telCliente;
    }

    public String getTarjCliente() {
        return tarjCliente;
    }

    public void setTarjCliente(String tarjCliente) {
        this.tarjCliente = tarjCliente;
    }

    public int getCodSegTarjeta() {
        return codSegTarjeta;
    }

    public void setCodSegTarjeta(int codSegTarjeta) {
        this.codSegTarjeta = codSegTarjeta;
    }
   
   
}
