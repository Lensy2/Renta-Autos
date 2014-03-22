package rentautos;
public class RegAuto {
   String Placa;
   String Marca;
   String Modelo;
   int Pasajeros;
   int Kilometraje;
   String Color;

    public RegAuto(String Placa, String Marca, String Modelo, int Pasajeros, int Kilometraje, String Color) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Pasajeros = Pasajeros;
        this.Kilometraje = Kilometraje;
        this.Color = Color;
    }

    public RegAuto() {
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
   
   
}
