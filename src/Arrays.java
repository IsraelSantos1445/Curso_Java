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

        System.out.println(names[2]);
        names[2]="IsraelSantos";
        System.out.println(names[2]);
        names[2]=null;
        System.out.println(names[2]);
        System.out.println(names.length);

        boolean booleans[]=new boolean[5];
        System.out.println(4);
    }
}
