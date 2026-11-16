import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExcersices {
    static void main(String[] args) {
        //1.Imprime los numeros del 1 al 10 con un bucle while
        int index=1;
        while(index<11){
            System.out.println(index);
            index++;
        }
        //2.usa un do-while para mostrar los valores de un array list
        ArrayList<String> names= new ArrayList<>();
        names.add("israel");
        names.add("Lorena");
        names.add("Pedrito");

        index=0;
        do {
            System.out.println(names);
        }while (index>names.toArray().length);
        index++;

        //3. Imprime los multiplos de 5 del 1 al 50 usando for

        for(int i=0; i<50;i+=5){
            System.out.println(i);
        }

        //4. recorre un array de 5 numeros e imprime la suma final
        int numbers[]={1,2,3,4,5};

        index=0;
        for (int n=0; n<numbers.length; n++){
            System.out.println(index+=numbers[n]);
        }
        //5.Usa un for para recorrer un array y mostrar sus valores
        for(int j=0;j<numbers.length;j++){
            System.out.println(numbers[j]);
        }
        //6.Usa un for-each para recorrer un HashSet y un HashMap
        HashMap<String,String> mail =new HashMap<>();
        mail.put("Israel","ijsa@gmail.com");
        mail.put("Santos","israelsantos1445@gmail.com");
        mail.put("Jesús","25041522@gmail.com");

        HashSet<String> countries= new HashSet<>();
        countries.add("Argentina");
        countries.add("Mexico");
        countries.add("USA");

        for(String contrie:countries){
            System.out.println(contrie);
        }

        for(Map.Entry<String,String>entry:mail.entrySet()){
            System.out.println("KEY "+entry.getKey()+"Value: "+entry.getValue());
        }
        //7.Imprime los numeros del 10-1 (descendiente) con un loop for
        index=0;
        for(int q=10;q>=0;q--) {
            System.out.println(q);
        }
            //8.Usa continue para saltar los multiplos de 3 del 1-20
            for (int x = 1; x < 20; x++) {
                if(x % 3!=0){
                    continue;
                }
                System.out.println(x);
        }
    }

}
