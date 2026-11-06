import java.util.ArrayList;

public class List {
    static void main() {
        //Decalracion y creacion
        ArrayList<String> names= new ArrayList<>();
        var nombres= new ArrayList<Integer>();

        //Tamaños
        System.out.println(names.size());
        System.out.println(nombres.size());
        //Añadir elementos
        names.add( "Israel");
        names.add( "juan");
        names.add( "pedro");
        names.add( "elias");
        System.out.println(names.size());

        //Acceder a los elementos
        System.out.println(names.getFirst());//Acceder al primer elemento
        System.out.println(names.getLast());//Acceder al ultimo elemento
        System.out.println(names.get(3));//Acceder a cualquier elemento

        //modificar
        names.set(3,"Jesús");
        System.out.println(names.getFirst());

        //Eliminar
        names.remove(3);
        //System.out.println(names.get(3));    Error
        System.out.println(names.size());

        //Buscar elementos
        System.out.println(names.contains("Jesús"));
        System.out.println(names.contains("Israel"));

        //Limpiar ArrayList
        names.clear();
        System.out.println(names.size());

        //PROBAR FUNCIONES DE ARRAYS
        names.isEmpty();
        System.out.println(names);


    }
}
