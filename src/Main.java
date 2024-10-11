public class Main {
    public static void main(String[] args) {
        // Crear el cuadro de la bicicleta
        Cuadro cuadro = new Cuadro("Aluminio", "Rojo", "Grande");

        // Crear la bicicleta
        Bicicleta bicicleta = new Bicicleta("Giant", "XTC", cuadro);

        // Crear y agregar ruedas a la bicicleta
        Rueda ruedaDelantera = new Rueda("29 pulgadas", "Mountain", 30.0);
        Rueda ruedaTrasera = new Rueda("29 pulgadas", "Mountain", 30.0);
        bicicleta.agregarRueda(ruedaDelantera);
        bicicleta.agregarRueda(ruedaTrasera);

        // Imprimir información de la bicicleta
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Cuadro: " + bicicleta.getCuadro().getMaterial());
        System.out.println("Color del cuadro: " + bicicleta.getCuadro().getColor());

        for (Rueda rueda : bicicleta.getRuedas()) {
            System.out.println("Rueda tamaño: " + rueda.getTamaño());
            System.out.println("Rueda tipo: " + rueda.getTipo());
            System.out.println("Presión de la rueda: " + rueda.getPresion() + " PSI");
        }
    }
}
