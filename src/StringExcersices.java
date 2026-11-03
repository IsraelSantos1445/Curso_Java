public class StringExcersices {
    static void main() {
        //1.concatena 2 cadenas de texto
        String carrera="Informatica";
        String semestre="3er";

        System.out.println("Soy de la carrera de "+carrera+" y estoy en "+semestre+" semestre.");

        //2.muestra la longitud de una cadena de texto
        System.out.println("longitud de la palabra informática: "+carrera.length());

        //3.muestra el primer y ultimo caracter de un string
        System.out.println("primer y ultimo caracter de Informatica: "+carrera.substring(0,1)+carrera.substring(10));

        //4.convierte de mayusculas a minsculas un String
        carrera = carrera.toUpperCase();
        System.out.println(carrera);
        //5.comprueba si una cadena de texto contiene una palabra en concreto
        System.out.println("Soy Israel santos".contains("Israel"));
        //6.formatea un String con un entero
        var carrera2="Sistemas";
        var semestre2=6;
        System.out.println(String.format("Soy de la carrera de %s y estoy en semestre %d.",carrera2,semestre2));
        //7.Elimina los espacios en blanco al principio y al final
        System.out.println(String.format("        Soy de la carrera de %s y estoy en semestre %d.   ",carrera2,semestre2).trim());
        //8.Sustituye todos los espacios en blanco de un String por un guion
        System.out.println("Hola estoy haciendo el curso de java".replace(" ","-"));
        //9.Comprueba si dos Strings son iguales
        System.out.println(semestre.equals(semestre2));
        //10.Comprueba si dos string tienen la misma longitud
        System.out.println(carrera.equals(carrera2));

    }
}
