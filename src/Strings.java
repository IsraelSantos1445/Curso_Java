import org.w3c.dom.ls.LSOutput;

public class Strings {
    static void main() {


        //Cadenas de texto
        String name = "Israel";
        var sourname = "Santos";
        //Concatenacion
        System.out.println(name+""+sourname);
        //Complicarsela:
        String obj = new String("Israel");
        System.out.println(obj);

        //lenght (Longitud)
        System.out.println(name.length());

        //charAt obtener caracter
        System.out.println(name.charAt(0+1));
        //subcadena
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,6));

        //toUppercase toLowerCase mayus y minus
        System.out.println(name.toUpperCase());//todo mayusculas
        System.out.println(name.toLowerCase());//todo minusculas

        System.out.println(name);// name sigue valiendo lo mismo que al inicio

        name=name.toUpperCase();
        System.out.println(name);//ahora name vale lo que acabamos de declarar

        //comprobar si contiene alguna palabra
        System.out.println("hola java".contains("java"));
        System.out.println("hola java".toUpperCase().contains("JAVA"));

        //equals-comparacion
        System.out.println(name.equals("ISRAEL"));
        System.out.println(name.equalsIgnoreCase("Israel"));

        //== vs .equals
        var a="Israel";
        var b="Israel";
        var c=new String("Israel");

        System.out.println(a==b);
        System.out.println(a==c);//da false porque tenemos un objeto creado
        System.out.println(a.equals(c));
    }
}
