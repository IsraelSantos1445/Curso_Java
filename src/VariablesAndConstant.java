public class VariablesAndConstant {
    static void main(String[] args) {
        //variables
    String name="Israel";
        System.out.println(name);
        //cambiar variable name
        name="israa";
        System.out.println(name);
        //variable int
        int age=19;
        System.out.println(age);
        /*LA PALABRA RESERVADA VAR ES PARA DEFINIR UNA VARIABLE, EL TIPO DE LA VARIABLE SE DETERMINA
        CUANDO LE DAMOS VALOR
         */
        var email="ijsa gmail.com";
        System.out.println(email);
        var year=2026;
        System.out.println(year);

        //constantes
        final String EMAIL="ijsa gmail.com";//Con el "final" una variable se convierte en constante
        //se recomienda poner las constantes en MAYUSCULAS
        System.out.println(EMAIL);
    }

}
