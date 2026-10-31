public class Operators {
    static void main() {
        //OPERADORES ARITMETICOS
        var a=5;
        var b=3;
        //suma
        System.out.println(a+b);
        //resta
        System.out.println(a-b);
        //multi
        System.out.println(a*b);
        //division
        System.out.println(a/b);
        System.out.println(a%b);//resto de la division

        //OPERADORES DE ASIGNACION
        a=b;
        System.out.println(a);
        a=b*2;
        System.out.println(a);
        a+=1;//a=a+1
        System.out.println(a);
        a-=2;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a%=2;
        System.out.println(a);

        //OPERADORES DE COMPARACION (Relacionales)
        System.out.println(a==b);//a es igual a b
        System.out.println(a==0);
        System.out.println(a!=b);//a es distinto de b
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        //OPERADORES LOGICOS
        //(Y AND)
        System.out.println(true &&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        System.out.println(3>2  &&  5==2);

        //(O OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3>2  ||  5==2);

        //(NO NOT)
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3>2) ||  5==2);

        //OPERADORES UNARIOS
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);//primero aumenta el valor y despues imprime
        System.out.println(b++);/*primero imprime y despues aumenta el valor, y no se ve
                                reflejado hasta la siguiente operacion*/
        System.out.println(--b);
        System.out.println(b--);
        ++b;
        System.out.println(b);
    }
}
