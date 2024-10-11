public class Cuadro {
    // Atributos de la clase Cuadro
    private String material;
    private String color;
    private String tamaño;

    // Constructor de la clase Cuadro
    public Cuadro(String material, String color, String tamaño) {
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
    }

    // Setters y Getters para Cuadro
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }
}
