import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("introduzca la cantidad de notas");
    
    int cantidadnotas = scanner.nextInt();
    int notamayor = 0; 
    for (int i = 0; i < cantidadnotas; i++){
      System.out.println("ingrese la nota en la posicion " +(i + 1));
      int tmp = scanner.nextInt();
      if (i==0){
        notamayor = tmp;
      }else if (tmp > notamayor){
        notamayor = tmp;
        }
     }
    System.out.println("La nota mayor es "+ notamayor);
      
    }
  }

  