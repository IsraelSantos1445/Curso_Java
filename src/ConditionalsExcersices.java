public class ConditionalsExcersices {
    static void main(String[] args) {
        //1.establece la edad de un usuario y determina si puede votar
        var age=18;
        if (age>=18){
            System.out.println("el usuario si puede votar, es mayor de edad");
        }else {
            System.out.println("El Usuario no puede votar, es menor de edad");
        }
        //2.Declara dos numeros y muestra cual es mayor o si son iguales
        int num1=5;
        int num2=5;
        if (num1>num2){
            System.out.println("num1 es mayor o igual que num2");
        } else if (num1==num2) {
            System.out.println("los numeros son iguales");
        }else {
            System.out.println("num2 es mayor o igual que num1");
        }
        //3.dado un numero verifica si es positivo, negativo o cero
        num1=101;
        if (num1>0){
            System.out.println("El numero es positivo");
        }else if (num1<0){
            System.out.println("el numero es negativo");
        }else{
            System.out.println("El numero es cero" );
        }
        //4.Crea un programa que diga si un numero es par o impar
        if(num1 % 2==0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        //5.Verifica si un numero esta en el rango de 100
        int min=0;
        int max=100;
        if(num1<=max && num1 >min) {
            System.out.println("el numero esta entre 1 y 100");
        }else{
            System.out.println("El numero no esta entre 0-100");
        }
        //6.declara una variable con el dia de la semana 1-7 y muestra su nombre
        int day=2;
        switch(day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("");
        //7.Simula un sistema de calificación
            double cal=8.6;
            double calMax=10;
            double calReg=8.5;
            double calMin=6;
            if(cal<=calMax){
                System.out.println("Sobresaliente");
            }else if (cal>=calReg) {
                System.out.println("Aprobado");
            }else
                System.out.println("Reprobado");
        }
    }
}
