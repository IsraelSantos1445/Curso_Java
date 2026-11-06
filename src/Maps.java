import java.util.HashMap;
import java.util.HashSet;

public class Maps {
    static void main() {
        //Declaración y creación
        HashMap<String,String> names=new HashMap<>();
        var numbers= new HashMap<Integer,String>();
        //tamaño
        System.out.println(names.size());
        //Añadir elementos
        names.put("Israel","ijsa@gmail.com");
        names.put("Santos","israelsantos1445@gmail.com");
        names.put("Jesús","25041522@gmail.com");

        System.out.println(names);
        /* No se puede acceder a elementos en especifico, entrega los datos desordenados
         */
        //Acceder a los Elementos
        System.out.println(names.get("Israel"));//Imprime el valor de la key

        //verificar elementos
        System.out.println(names.containsKey("Israel"));
        System.out.println(names.containsValue("israelsantos1445@gmail.com"));
        System.out.println(names.containsKey("Juan"));
        //Eliminar elementos
        System.out.println(names.remove("Santos"));//Nos lanza el valor que tenia asociado comp froma de verificacion
        System.out.println(names);
        //Limpiar Map
        names.clear();
        System.out.println(names);
        //Operaciones
        names.put("Israel","ijsa@gmail.com");
        System.out.println(names);
        names.put("Israel","ijsa1445@gmail.com");
        System.out.println(names);//Al poner un put con la misma key, actualiza el valor de lo que habia en la key(FUNCIONA COMO UNA ACTUALIZACION)

        names.replace("Santos","israelsantos1445@gmail.com");//La funcion replace solo funciona si el valor ya existia anteriormente
        System.out.println(names);//En este caso no se puede reemplazar nada porque no existia el valor anteriormente

        names.putIfAbsent("Santos","israelsantos1445@gmail.com");//Solo lo inserta si no existe
        System.out.println(names);

        //Otras operaciones
        System.out.println(names.isEmpty());//nos dice si esta vacio o no
        System.out.println(names.keySet());//Me dice que Keys existen
        System.out.println(names.values());//Devualve una lista de solo valores sin key

    }
}
