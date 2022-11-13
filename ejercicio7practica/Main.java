import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //ingrese cantidad de alumnos 
    System.out.println("cuantos alumnos va a introducir");
    int cantidadAlumnos = scanner.nextInt();
    //array para guardar los nombres de los alumnos
    String[] nombres = new String[cantidadAlumnos];
    String[] calificacion = new String[cantidadAlumnos];
    //otro array para guardar las notas
    int[] primerParcial = new int[cantidadAlumnos];
    int[] segundoParcial = new int[cantidadAlumnos];
    int[] examenFinal = new int[cantidadAlumnos];
    int[] codigoAlumno = new int[cantidadAlumnos];
    //pedimos nombres, notas y codigo como indica el usuario 
    for (int i = 0; i < cantidadAlumnos; i++){
      System.out.print("Ingrese nombre del alumno "+(i+1)+": ");
      nombres[i] = scanner.next();
      System.out.print("Ingrese la nota del primer parcial del alumno "+(i+1)+": ");
			primerParcial[i] = scanner.nextInt();
      System.out.print("Ingrese la nota del segundo parcial del alumno "+(i+1)+": ");
			segundoParcial[i] = scanner.nextInt();
      System.out.print("Ingrese la nota del examen final  del alumno "+(i+1)+": ");
			examenFinal[i] = scanner.nextInt();
      System.out.print("Ingrese el codigo del alumno "+(i+1)+": ");
			codigoAlumno[i] = scanner.nextInt();
     
      }
        
      
    }
    
  }