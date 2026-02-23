import java.util.Scanner;
import java.io.*;

public class nivel1{
    public static void main(String[] args)throws IOException, InterruptedException{
        limpiar.clear();

        int S1 = ((int)(10*Math.random())) +1, 
        S2 = (int)(20 + ((30-20+1)*Math.random())), 
        respuesta = 0, solucion = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = S1; i <= S2; i++){
            solucion += i;
        }

        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al sistema " + S1 + "en el sector " + S2 + ", pero el sistema de navegación está estropeado y el computador tiene problemas para calcular parte de las coordenadas de salto.\n" + 
        "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" + 
        "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" + 
        "¿Qué debe introducir?");

        respuesta = sc.nextInt();
        if(respuesta == solucion){
            System.out.println("Correcto! Ahora podremos llegar al sector correcto!");
            Thread.sleep(1000);
            nivel2.main(new String[]{});
        } else
            perder.main(new String[]{});
        sc.close();
    }
}
