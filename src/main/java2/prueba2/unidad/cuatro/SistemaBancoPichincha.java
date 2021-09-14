package prueba2.unidad.cuatro;

import java.util.Scanner;

public class SistemaBancoPichincha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorInt = new Scanner(System.in);
		Scanner lectorString = new Scanner(System.in);
		int sueldo = 2500;
		int opc = 0;
		do {
			System.out.println("Ingrese Clave: ");
			String clave = lectorString.nextLine();
			if (clave.equals("85DB")) {
				do {
					System.out.println("#######################################");
					System.out.println("####   BANCO PICHINCHA             ####");
					System.out.println("####   1. Consultar pagos          ####");
					System.out.println("####   2. Realizar Tranferencia    ####");
					System.out.println("####   3. SALIR                    ####");
					System.out.println("#######################################");
					System.out.println("Ingrese una Opcion: ");
					opc = lectorInt.nextInt();
					if (opc == 1) {
						System.out.println("No tiene ningún pago pendiente");

					} else if (opc == 2) {
						System.out.println("Ingrese la cuenta de destino: ");
						String cuenta = lectorString.nextLine();
						System.out.println("Ingrese el monto a tranferir: ");
						int monto = lectorInt.nextInt();

						int saldoTotal = sueldo - monto;

						System.out.println("Su nuevo saldo es:" + saldoTotal);
					}
				} while (opc != 3);
			}
		} while (opc != -1);
		System.out.println("Gracias por preferirnos");
	}
}


