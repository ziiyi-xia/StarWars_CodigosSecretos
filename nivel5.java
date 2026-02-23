import java.util.Scanner;import java.io.*;

public class nivel5{
    public static void main(String[] args)throws IOException, InterruptedException{
        limpiar.clear();
        
        int M = (int)(5 + ((10-5+1)*Math.random())), 
        S = (int)(5 + ((10-5+1)*Math.random())), 
        respuesta = 0, solucion1 = 1, solucion = 1;

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= M; i++){
            solucion1 *= i;
        }
        for(int i = 1; i <= S; i++){
            solucion *= i;
        }
        solucion += solucion1;

        System.out.println("Consiguen entrar al reactor.\n" + 
        "Ya solo queda que Luke Skywalker coloque la bomba, programe el temporizador y salir de allí corriendo.\n" + 
        "Necesita programarlo para que explote en exactamente " + M + " minutos y " + S + 
        "segundos, el tiempo suficiente para escapar antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y desactive la bomba.\n" + 
        "Pero el temporizador utiliza un reloj Zordgiano un tantopeculiar.\n" + " Para convertir los minutos y segundos al sistema Zordgiano hay que sumar el factorial de " + M + 
        "y el factorial de " + S + ".\n" + 
        "¿Qué valor debe introducir?");

        respuesta = sc.nextInt();
        if(respuesta == solucion){
            System.out.println("Correcto! Ya tenemos el código. Ahora ya podemos abrirnos paso!");
            Thread.sleep(1000);
            ganar.main(new String[]{});
        } else
            perder.main(new String[]{});
        sc.close();
    }
}
