import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    static void main() {
    //Decalracion y creacion
            HashSet<String> names= new HashSet<>();
            var numbers= new HashSet<Integer>();

            //Tamaños
        System.out.println(names.size());
        //Añadir elementos
        names.add( "Israel");
        names.add( "juan");
        names.add( "pedro");
        System.out.println(names.size());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        /*diferencia entre Set y Listas
        las listas son ordenadas
        los Set son desordenadas, no se puede acceder a ellos ni modificarlos
         */
        //ejemplo
        System.out.println(names);

        //remover elemntos
        names.remove("juan");
        System.out.println(names);

        //Buscar elementos
        System.out.println(names.contains("Israel"));

        //NO PERMITE REPETIDOS
        System.out.println(names);
        names.add( "Israel");
        names.add( "Israel");
        names.add( "Israel");
        System.out.println(names);

        //COnjuntos

        HashSet<String> countries= new HashSet<>();
        countries.add("Argentina");
        countries.add("Mexico");
        countries.add("USA");

        names.addAll(countries);
        countries.addAll(names);
        System.out.println(countries);
        System.out.println(names);

    }
}
