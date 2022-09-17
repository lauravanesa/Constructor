public class Ares {

    public static void main(String[] args) {
        Cuadrado miCuadrado = new Cuadrado(5);
        System.out.println(" El area del cuadrado es: " +miCuadrado.calcularArea());

        Cuadrado otroCuadrado = new Cuadrado();
        otroCuadrado.setLado(3);
        System.out.println(" El are es otro:" +miCuadrado.calcularArea());

    }
}
