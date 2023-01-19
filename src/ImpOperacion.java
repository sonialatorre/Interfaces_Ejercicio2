import java.util.Scanner;

public class ImpOperacion implements Operacion,Suma {



    @Override
   public void saludar ( ){
        System.out.println("Bienvenido a ImpOperacion");
    }
    @Override
    public void TipoOperacion (){
        System.out.println("Tipo de Operacion: Suma");
    }
    @Override
    public void operacion (){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
       int valor1= entrada.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2= entrada.nextInt();
       int suma= valor1+valor2;
        System.out.println("La suma es: "+suma);
    }
}

