public class Methods {
    static void main() {

        for (int i = 1; i <= 1; i++) {
            sendEmail();
            sendEmailToUser("ijsa1445@gmail.com");
            sendEmailToUser("ijsa1445@gmail.com","Israel");
            sendEmailWithState("ijsa1445@gmail.com");

            var state=sendEmailWithState("");
            System.out.println(state);
        }
        //metodos sin parametros ni retorno

    }
        public static void sendEmail(){
            System.out.println("se envio el email");

        }
        //metodos con parametros
    public static void sendEmailToUser(String email){
        System.out.println("se envio el email a "+email);
    }
    //Sobrecarga de metodos
    public static void sendEmailToUser(String email, String name) {
        //se usa el mismo nombre del metodo pero con un comportamiento diferente
        System.out.println("se envio el email a " + name +": "+ email);
    }
    //metodo con retorno
    public static boolean sendEmailWithState(String email){
        if(email.isEmpty()){
            return false;
        }
        System.out.println("se envio el email a "+email);
        return  true;
    }
}
