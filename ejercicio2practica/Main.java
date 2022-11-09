import java.util.Scanner;
class Main { 
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //ingresamos las variables 
        double p,e,imc;
        //entradas 
        System.out.println("Cual es su peso ");
        p= teclado.nextDouble();
        System.out.println("Cual es tu estatura");
        e= teclado.nextDouble();
        //calculo del imc
        imc= p/(e*e);
        System.out.println("SU IMC ES: "+imc);
        //imc del paciente dado    
        if (imc<18.5) {
            System.out.println("SALUDABLE");
        } else if (imc>=18 && imc<=25);
    }
 
}
