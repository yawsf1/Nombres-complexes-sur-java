public class Main {
    public static void main(String[] args){
        Complexe c1 = new Complexe(22, 3);
        Complexe c2 = new Complexe(3, 0);

        System.out.println(c1.addCom(c2));
        System.out.println(c1.multiCom(c2));
    }
}
