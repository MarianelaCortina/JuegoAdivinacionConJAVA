import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinacion{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroIngresado;
        int intentos = 1;
        Random r = new Random();
        int numeroAleatorio = r.nextInt(100);
        //System.out.println(numeroAleatorio);

        System.out.println("¡Bienvenido/a al Juego de adivina el número!");
        System.out.println("Intente adivinar el número en un máximo de 5 intentos");

        while(intentos <= 5){
            System.out.println("Ingresa un número entre 0 y 100");
            numeroIngresado = teclado.nextInt();

            if(numeroIngresado == numeroAleatorio){
                System.out.println("Acertaste! El número ganador es: " + numeroAleatorio);
                break;
            } else {
                System.out.println("Este fue el intento número: " + intentos);
                if (numeroIngresado > numeroAleatorio){
                    System.out.println("El número ingresado es mayor al número secreto");
                } else {
                    System.out.println("El número ingresado es menor al número secreto");
                }
            }
            intentos++;
        }
        if (intentos > 5){
            System.out.println("Suerte la próxima! El número era: " + numeroAleatorio);
        }
        teclado.close();
    }
}

//Crea un programa que simule un juego de adivinanzas.
// El programa debe generar un número aleatorio entre 0 y 100,
// y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
// En cada intento, el programa debe informar si
// el número ingresado por el usuario es mayor o menor que el número generado.
//
//Utiliza el Scanner para obtener los datos del usuario.
//Para generar un número aleatorio en Java: new Random().nextInt(100);
//Utiliza una variable para contar los intentos.
//Utiliza un bucle para controlar los intentos.
//Utiliza la instrucción ‘break;’ para salir del bucle.