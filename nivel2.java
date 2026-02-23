import java.util.Scanner;import java.io.*;

public class nivel2{
    public static void main(String[] args)throws IOException, InterruptedException{
        limpiar.clear();
        
        int P1 = ((int)(7*Math.random())) +1, 
        P2 = (int)(8 + ((12-8+1)*Math.random())), 
        respuesta = 0, solucion = 1;

        Scanner sc = new Scanner(System.in);

        for(int i = P1; i <= P2; i++){ //Productorio entre los dos numeros
            solucion *= i;
        }

        System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella de la muerte.\n" + 
        "Como van en una nave imperial robada se aproximan lentamente con la intención de pasar desapercibidos.\n" + 
        "De repente suena el comunicador.\n" + 
        "“Aquí agente de espaciopuerto " + P1 + "contactando con nave imperial " + P2 + ". No están destinados en este sector.\n" + 
        "¿Qué hacen aquí?”.\n" + 
        "Han Solo coge el comunicador e improvisa.\n" + 
        "“Eh… tenemos un fallo en el… eh… condensador de fluzo...\n" + 
        "Solicitamos permiso para atracar y reparar la nave”.\n" + 
        "El agente, que no se anda con tonterías, responde\n" + 
        "“Proporcione código de acceso o abriremos fuego”.\n" + 
        "Han Solo ojea rápidamente el manual del piloto que estaba en la guantera y da con la página correcta.\n" + 
        "El código es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" + 
        "¿Cuál es el código?");
        respuesta = sc.nextInt();
        if(respuesta == solucion){
            System.out.println("Correcto! Ya tenemos el código. Ahora ya podemos abrirnos paso!");
            Thread.sleep(1000);
            nivel3.main(new String[]{});
        } else
            perder.main(new String[]{});
        sc.close();
    }
}
