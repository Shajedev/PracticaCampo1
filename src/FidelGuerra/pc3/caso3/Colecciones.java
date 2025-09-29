package FidelGuerra.pc3.caso3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Colecciones {
    static List<String> listaNombres = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("-------------- Colecciones-------------\n");

        agregarValores(sc);
        System.out.print("-------------- VALORES DE LA LISTA -------------\n");
        mostrarLista();
        elimiarValor(2);
        System.out.print("-------------- NUEVOS VALORES DE LA LISTA -------------\n");
        mostrarLista();
    }

    private static void agregarValores(Scanner sc){
        int cont = 1;
        String nombre;
        do{
            System.out.printf("ingrese el nombre %s: ",cont);
            nombre = sc.nextLine();
            if(!Objects.equals(nombre, "salir")) listaNombres.add(nombre);
            cont+=1;

        }while(!Objects.equals(nombre, "salir"));
    }

    private static void mostrarLista(){
        for(int i=0;i<listaNombres.size();i++){
            System.out.printf("Valor de lista N %s : %s \n",i,listaNombres.get(i));
        }
    }

    private static void elimiarValor(int indice){
        listaNombres.remove(indice);
    }
}
