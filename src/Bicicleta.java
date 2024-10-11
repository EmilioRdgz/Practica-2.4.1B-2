import java.util.ArrayList;

// Clase principal: Bicicleta
public class Bicicleta {
    // Atributos de la clase Bicicleta
    private String marca;
    private String modelo;
    private ArrayList<Rueda> ruedas; // Componente
    private Cuadro cuadro; // Componente

    // Constructor de la clase Bicicleta
    public Bicicleta(String marca, String modelo, Cuadro cuadro) {
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = new ArrayList<>();
        this.cuadro = cuadro;
    }

    // Setters y Getters para Bicicleta
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    // Método para agregar una rueda a la bicicleta
    public void agregarRueda(Rueda rueda) {
        ruedas.add(rueda);
    }
}
