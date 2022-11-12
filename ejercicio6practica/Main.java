import static java. lang. System. out;
import java. util. Scanner;
import java. util. *;
class Main{
public static void main (String[] arguments){
float comparador=0;
String nombre; 
int mas=0; 
int i;
Scanner miScanner= new Scanner(System. in);
out.println("Cuantos trabajadores va a introducir en la base de datos");
int total= miScanner.nextInt();
String[]nombres=new String [total];
float []salario = new float [total];
for (i=0; i< total; i++ ){ 
out.println("Ingrese el nombre de trabajador");
nombre = miScanner.next();
nombres[i] =nombre; 
out.println("Ingrese el salario de :" +nombre);
float sal= miScanner.nextInt();
salario[i]= sal; 
if(comparador <= sal){
comparador= sal; 
mas = i; 
}
}
out.println("El mayor salario lo tiene:"+nombres[mas] +" " );
out.println("con:"+comparador+" "+ "bolivianos" );
}}