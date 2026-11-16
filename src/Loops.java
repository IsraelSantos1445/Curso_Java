import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main() {
        //Loops

        //for controlado por contador
        String[] names = {"Juan", "Israel", "naho", "Juana", "Anne"};
        for (int i = 5; i <= 5; i++) {//Donde empieza el ciclo; Hasta donde llega el ciclo; se incrementa cada vuelta o se decrementa
            System.out.println("Hola java");


            for (int j = 0; j < 3; j++) {
                System.out.println(names[j]);//Imprime los nombres en linea
            }

            for (int j = 0; j < names.length; j++) {
                System.out.println(names[j]);//Imprime los nombres, pero con el names.length hace que imprima todos los valores de la lista y no importaria si el array cambia de tamaño o se agregan nuevos elementos
            }

            //ForEach
            //este es el loop ideal para recorrer arrays o listas
            for (String name : names) {
                System.out.println(name);
            }
            HashSet<Integer> numbers = new HashSet();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);

            for (Integer num : numbers) {
                System.out.println(num);
            }
            HashMap<String, String> emails = new HashMap<>();

            emails.put("Israel", "ijsa@gmail.com");
            emails.put("Santos", "israelsantos1445@gmail.com");
            emails.put("Jesús", "25041522@gmail.com");

            for (Map.Entry<String, String> mail : emails.entrySet()) {//La funcion entrySet convierte el Map en un Set para poer usar el for each
                System.out.println(mail);//Imprime key y value
                System.out.println(mail.getKey());//imprime solo la key
                System.out.println(mail.getValue());//imprime el Value
            }
        }
        //Loop while
        int index = 0;
        while (index < 25) {
            System.out.println("Hola java");//Hasta aqui seria un loop infinito porque index no se incrementa
            index++;//Al agregar el incremento de index, cada vuelta suma 1 a index
        }
        index=0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        //Do while
        index=0;
        do{
            System.out.println("Hola Java");//El do while se ejecuta una vez y depende la condicion se ejecutara mas veces
            index++;
        }while(index<0);

        //Control de bucles
        //Break
        for(String name:names){
            if(name.equals("naho")){
                break;//palabra reservada para detener
            }
            System.out.println(name);
        }

        //continue
         for(int i=0; i<5; i++){
             if(i==3){
                 continue;// fuerza que se haga la siguiente ejecución del bucle
             }
             System.out.println(i);
         }


    }
}
