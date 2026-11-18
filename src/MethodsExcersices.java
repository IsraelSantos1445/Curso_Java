public class MethodsExcersices {
    static void main(String[] args) {
        Bienvenida();
        saludar("israel");
        resta(10,3);
        Cuadrado(2);
        par(3);
        Longitud("amazon");
        edades(16);
        factorial(5);
    }

        //1. Crea un metodo que imprima "Te doy la bienvenida al curso de java desde cero"
        public static void Bienvenida(){
            System.out.println("Te doy la bienvenida al curso de java desde cero");
        }
        //2. escribe un metodo que reciba un nombre con parametro y salude a esa persona
    public static void saludar(String name){
        System.out.println("Hola "+name);
    }
    //3. haz un metodo que reciba 2 numeeos enteros y devuelva su resta
    public static void resta(int num1,int num2){
        System.out.println(num1-num2);
    }
    //4.Crea un metodo que calcule el cuadrado de un numero
    public static void Cuadrado(int n){
        System.out.println(n*n);
    }
    //5.Escribe un metodo que reciba un numero y diga si es par o impar
    public static boolean par(int n){
        if (n%2==0) {

            System.out.println("El numero es par");
            return true;
        }
        System.out.println("El numero es impar");
        return false;
    }
    //6.implementa un metodo que reciba un String y retorne su longitud
    public static void Longitud(String palabra){
        System.out.println(palabra.length());

    }
    //7.crea un metodo que reciba una edad y retorne true si es mayor de edad y false en el caso contrario
    public static boolean edades(int edad){
        if ((edad>=18)){
            System.out.println("Eres mayor de edad");
            return true;
        }
        System.out.println("Eres menor de edad");
        return false;
    }
    //8.escribe un metodo que reciba un numero y retorne su factorial
    public static void factorial(int fac){
        for(int i=1; i<=fac;i++){
            fac*=i;
            System.out.println(fac);
        }
    }


}
