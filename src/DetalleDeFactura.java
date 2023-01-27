import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("por favor digite el nombre de la factura");
        String nombreFactura = scanner.nextLine();

        System.out.println("ingrese el valor del primer precio");
        double precioUno = scanner.nextDouble();
        System.out.println("ingrese el valor del segundo precio");
        double precioDos = scanner.nextDouble();

        double sumaPrecios = precioDos+precioUno;
        double sumaImpuesto = sumaPrecios*0.19;
        double total = sumaPrecios+sumaImpuesto;

        System.out.println("la factura "+nombreFactura+" tiene un total bruto de "+sumaPrecios+" con un impuesto de "+sumaImpuesto+" y el monto despues de impuesto de "+total);
    }
}
