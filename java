import java.util.Scanner;
import java.io.*;

public class inicio {
  public static void main(String[] args)throws IOException, InterruptedException{
    Scanner sc = new Scanner(System.in);
    
    System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n" + 
    "Hace mucho tiempo, en una galaxia muy, muy lejana…\n" + 
    "La Princesa Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada en una misión secreta\n" + 
    "para infiltrarse en otra estrella de la muerte que el imperio está construyendo y destruirla.\n" + 
    "(Presiona Intro para continuar)");

    String intro = sc.nextLine();
    while (!(intro.equals(""))) {
      intro = sc.nextLine();
    }
    if(intro.equals("")){
      nivel1.main(new String[]{});
    }
    
    sc.close();
  }
}
