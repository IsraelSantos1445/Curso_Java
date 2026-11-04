public class Arrays {
    public static void main(String[] args) {
        //declaración y creación
        int[]numbers=new int[3];
        System.out.println(numbers);

        String [] names={"Juan","Israel","naho"};
        System.out.println(names);
        //Acceso
        System.out.println(numbers[0]);
        System.out.println(names[2]);

        //modificación
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
