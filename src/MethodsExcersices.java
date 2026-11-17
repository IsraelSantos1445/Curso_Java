public class MethodsExcersices {
    static void main(String[] args) {
        Bienvenida();
        saludar("israel");
        resta(10,3);
        Cuadrado(2);
        par(3);
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

}
