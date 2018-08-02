package ejercicio30;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        String[] nombre = new String[10];
        String[] telefono = new String[10];
        String celular[] = new String[10];
        String correo[] = new String[10];
        int opcion,cont=0;
        
        do {
            System.out.println("Agenda");
            System.out.println("1. Ingresar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Ver contactos");
            System.out.println("4. Eliminar contactos");
            System.out.println("5. Salir");
            System.out.print("Digite una opcion: ");
            opcion = lector.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.print("Digite nombre: ");
                    nombre[cont]= lector.next();
                    System.out.print("Digite telefono: ");
                    telefono[cont]= lector.next();
                    System.out.print("Digite celular: ");
                    celular[cont] = lector.next();
                    System.out.print("Digite correo:");
                    correo[cont] = lector.next();
                    cont++;
                    break;
                case 2:
                    break;
                case 3:
                    for (int i=0; i<cont; i++){
                        System.out.println("Contacto " + i 
                        +"\nNombre: " + nombre[i] 
                        +"\nTelefono: " + telefono[i]
                        +"\nCelular: " + celular[i]
                        +"\nCorreo: " + correo[i]);
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("ERROR: Entrada no valida");
                    break;
            }
            
        }while (opcion!=5);
        
    }
    
}
