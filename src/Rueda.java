public class Rueda {
    // Atributos de la clase Rueda
    private String tamaño;
    private String tipo;
    private double presion;

    // Constructor de la clase Rueda
    public Rueda(String tamaño, String tipo, double presion) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.presion = presion;
    }

    // Setters y Getters para Rueda
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public double getPresion() {
        return presion;
    }
}


