import java.util.Scanner;

public class ejercicio10{
    public static void main(String[] args) {
        double r1, h1, r2, h2, v1, v2, v3;
        
        System.out.print("Bienvenido" + "\n" + "Calcularemos primero el volumen del cono completo" + "\n" +
        "Digite el valor del  radio en centimetros del cono completo " + "\n");
        Scanner teclado = new Scanner(System.in);
        r1 = teclado.nextDouble();
        
        System.out.print("Digite la altura en centimetros del cono completo " + "\n");
        h1 = teclado.nextDouble();
        
        v1 = (Math.PI * Math.pow(r1, 2) * h1) / 3;
        System.out.print("El volumen del cono completo es: " + String.format("%.2f", v1) + " centimetros cubicos" + "\n");

        System.out.print("Calcularemos ahora el volumen del cono deficiente" + "\n" +
        "Digite el valor del  radio en centimetros del cono deficiente " + "\n");
        r2 = teclado.nextDouble();
        
        System.out.print("Digite la altura en centimetros del cono deficiente " + "\n");
        h2 = teclado.nextDouble();
        
        v2 = (Math.PI * Math.pow(r2, 2) * h2) / 3;
        System.out.print("El volumen del cono deficiente es: " + String.format("%.2f", v2) + " centimetros cubicos" + "\n");
        
        //hallamos el volumen del tronco de cono
        v3 = v1 - v2;
        
        System.out.print("El volumen del tronco de cono es " +  String.format("%.2f", v3) + " centimetros cubicos ");
        
   
        
    }
}