import java.util.Scanner;import java.io.*;

public class nivel3{
    public static void main(String[] args)throws IOException, InterruptedException{
        limpiar.clear();
        
        int N = (int)(50 + ((100-50+1)*Math.random())), 
        respuesta = 0, solucion = 1;

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= (N/10); i++){ //factorial de n/10
            solucion *= i;
        }

        System.out.println("Han Solo proporciona el código correcto.\n" + 
        "Atracan en la estrella de la muerte, se equipan con trajes de soldados imperiales que encuentran en la nave para pasar desapercibidos y bajan.\n" + 
        "Ahora deben averiguar en qué nivel de los " + N + " existentes seencuentra el reactor principal.\n" + 
        "Se dirigen al primer panel computerizado que encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita introducir una clave de acceso.\n" + 
        "Entonces recuerda la información que le proporcionó Lando Calrissian:\n" + 
        "“La clave de acceso a los planos de la nave es el factorial de " + N + " /10 (redondeando N hacia abajo), donde " + N + 
        "es el nº de niveles”.\n" + 
        "¿Cual es el nivel correcto?");

        respuesta = sc.nextInt();
        if(respuesta == solucion){
            System.out.println("Correcto! Nos hemos hecho con los planos de la nave!");
            Thread.sleep(1000);
            nivel4.main(new String[]{});
        } else
            perder.main(new String[]{});
        sc.close();
    }
}
