import java.util.Scanner;

public class empleado {
	
	private Scanner teclado;
	private String nombre;
	private int sueldo;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado: ");
		nombre=teclado.nextLine();
		System.out.print("Ingrese el sueldo: ");
		sueldo=teclado.nextInt();		
	}
	
	public void imprimir() {
		System.out.println("nombre: " + nombre);
		System.out.println("Sueldo: " + sueldo);
	}
	
	public void impuesto() {
		if(sueldo>3000) {
			System.out.println("Debe pagar impuestos.");
		} else {
			System.out.println ("No debe pagar impuestos.");
		}
	}
	

	public static void main(String[] args) {
		
		empleado empleado1 = new empleado();
		empleado1.inicializar();
		empleado1.imprimir();
		empleado1.impuesto();
	}

}

