import java.util.Scanner;
class Main {
  public static void main(String[] args) { 
    int aux,valores;
   Scanner input = new Scanner (System.in);
    //el arreglo tendra numeros aleatorios del 0 al 99
    System.out.print("Ingresa el número de pocisiones del arreglo: ");
    valores = input.nextInt();
    int[] arreglo=new int[valores];
    for (int i=0;i<(valores-1);i++){
      arreglo[i]=(int) (Math.random()*99);
    }
    System.out.println("El arreglo antes de cambiar las pocisiones es : ");
    System.out.println();
    for (int j=0;j<(valores);j++){
      System.out.print(arreglo[j]+" ");
    }
    System.out.println();
    System.out.println();
    System.out.println("El arregolo despues de cambiar las pocisiones es : ");
    // el arreglo se ordenara de manera creciente 
    System.out.println();
    for (int p=0;p<(valores-1);p++){
      for(int q=0;q<(valores-1);q++){
        if (arreglo[q] > arreglo[q+1]){
          aux = arreglo[q];
          arreglo[q] = arreglo[q+1];
          arreglo[q+1] = aux;
        }
      }
    }
    for (int k=0;k<(valores);k++){
      System.out.print(arreglo[k]+" ");
    }
  }
}