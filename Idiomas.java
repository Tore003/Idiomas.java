
import java.io.*;
public class Idiomas {

    public static void main(String[] args) throws IOException {
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
       String case1;
       String case2;
       String case3;
       String case4;
       int idioma;
       int ingles=0;
       int aleman=0;
       int portugues=0;
       int frances=0;
       int totalum=0;
       int porcentajeing=0;
       int porcentajeale=0;
       int porcentajeport=0;
       int porcentajefran=0;
       System.out.println("Presione del 1 al 4 para elegir su idioma (1=ingles,2=portugues,3=portugues y 4 = frances)");
       idioma = Integer.parseInt(bufEntrada.readLine());
       totalum=totalum+1;
       switch (idioma) 
       {
           case 1:
           ingles=ingles+1; 
           case 2:
           aleman= aleman+1;
           case 3:
           portugues=portugues+1;
           case 4:
           frances=frances+1;
       }
       if(totalum>=100){
       porcentajeing=(ingles*totalum)/100;
       porcentajeale=(aleman*totalum)/100;
       porcentajeport=(portugues*totalum)/100;
       porcentajefran=(frances*totalum)/100;
       System.out.println(porcentajeing);
       System.out.println(porcentajeale);
       System.out.println(porcentajeport);
       System.out.println(porcentajefran);
       }
    }  
}
