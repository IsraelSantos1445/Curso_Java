import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExcersices {
    static void main() {
        //1.Crea un array con 5 valores e imprime su longitud
        double[]telefonos=new double[10];
        System.out.println(telefonos.length);
        //2.Modifica uno de los valores del array e imprime el valor del indice antes y despues de modificarlo
        String[]names={"Israel","Tadeo","Kevin"};
        System.out.println(names[2]);
        names[2]="pedrito";
        System.out.println(names[2]);
        //3.Crea un array list vacio
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        //4.añade 4 valores al arrayList y elimina el ultimo
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);

        numbers.remove(3);
        System.out.println(numbers);
        //5.Crea un HashSet con 2 valores diferentes
        HashSet<Integer> num=new HashSet<>();
        num.add(67);
        num.add(76);
        System.out.println(num);
        //6.Añade un valor repetido y otro sin repetir
        num.add(67);
        num.add(45);
        System.out.println(num);
        //7.Elimina uno de los elementos del HashSet
        num.remove(67);
        System.out.println(num);
        //8.Crea un Hash Map donde la clave sea un nombre y el valor un numero
        HashMap<String,Integer>contacts=new HashMap<>();
        contacts.put("Israel",618166554);
        contacts.put("Javier",618456724);
        System.out.println(contacts);
        //9.Modifica uno de los contactos y elimina el otro
        contacts.replace("Israel",61824142);
        contacts.remove("Javier");
        System.out.println(contacts);
        //10.Dado un Array transformalo en ArrayList, luego a un Hashset y despues un HashMap con clave y valor iguales
        // Array original
        String[] array = {"uno", "dos", "tres", "dos", "uno"};
        System.out.println("Array:     " + Arrays.toString(array));

        // Array - ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);

        // ArrayList - HashSet (elimina duplicados)
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println("HashSet:   " + hashSet);

        //  HashSet - HashMap (clave y valor iguales)
        HashMap<String, String> hashMap = new HashMap<>();
        for (String elemento : hashSet) {
            hashMap.put(elemento, elemento);
        }
        System.out.println("HashMap:   " + hashMap);

    }
}
