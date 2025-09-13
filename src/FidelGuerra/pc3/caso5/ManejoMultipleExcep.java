package FidelGuerra.pc3.caso5;

import java.util.Scanner;

public class ManejoMultipleExcep {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("-------------- Validar Numero -------------\n");
            System.out.print("Ingrese el numero a validar: ");
            int number = sc.nextInt();
            if(number < 0) manejarErrores("NumeroNegativoException", "");
        }catch (Exception e){
            manejarErrores(e.getClass().getSimpleName(), e.getMessage());
        }
    }
    private static void manejarErrores(String claseError, String mensajeError) {
        switch (claseError) {
            case "NumberFormatException", "InputMismatchException": System.out.print("ERROR: valor no valido");break;
            case "NumeroNegativoException": System.out.print("ERROR: Numero negavito");break;
            default: System.out.print(mensajeError);
        }
    }
}
