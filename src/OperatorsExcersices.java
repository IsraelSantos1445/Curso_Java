public class OperatorsExcersices {
    static void main() {
        //crea una variable con el resultado de una operacion aritmetica
        var a=5;
        var b=5;
        var c=a+b;
        c=c/2;
        System.out.println(c);
        //Crea una variable para cad tipo de operacion de asignacion
        var d=1;
        d+=1;
        System.out.println(d);
        var e=2;
        e-=2;
        System.out.println(e);
        var f=4;
        f*=2;
        System.out.println(f);
        double g=5;
        g/=2;
        System.out.println(g);
        //Imprime 3 comparaciones verdaderas con diferentes operadores de comparacion
        System.out.println(a==b);
        System.out.println(8>=8 && 7<8);
        System.out.println(!(a<b));
        //imprime 3 comparaciones falsas con diferentes operadores de comparación
        System.out.println(!(a==b || b==a));
        System.out.println(e<0 && g>=3);
        System.out.println(!(a==b));
        //combina ambos operadores logicos
        System.out.println(a<b && b<=a || a==b);//true
        //añade alguna negacion
        System.out.println(a<b && b<=a || !(a==b));//false
        //Combina operadores aritmeticos, de comparacion y logicos
        System.out.println(!(8<10) && true ||8-8<=0);
    }
}
