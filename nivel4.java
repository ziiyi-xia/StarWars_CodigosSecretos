import java.util.Scanner;
import java.io.*;

public class nivel4{
    public static void main(String[] args)throws IOException, InterruptedException{
        limpiar.clear();
        
        int P = (int)(10 + ((100-10+1)*Math.random())), 
        respuesta = 0, solucion = 1;
        boolean primo = true;

        Scanner sc = new Scanner(System.in);

        for(int i = 2; i < (Math.sqrt(P)); i++){
            if(P % i == 0)
                primo = false;
        }
        if(primo == false)
            solucion = 0;
        else
            solucion = 1;

        System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta acorazada que da al reactor principal.\n" + 
        "R2D2 se conecta al panel de acceso para intentar hackear el sistema y abrir la puerta.\n" + 
        "Para desencriptar la clave necesita verificar si el número " + P + 
        "es primo o no. Si es primo introduce un 1, si no lo es introduce un 0");

        respuesta = sc.nextInt();
        if(respuesta == solucion){
            System.out.println("Correcto! Ahora podemos entrar a la sala del reactor...");
            Thread.sleep(1000);
            nivel5.main(new String[]{});
        } else
            perder.main(new String[]{});
        sc.close();
    }
}
