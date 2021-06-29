package NO1_Stack;
/**
 *
 * @author muhammadisa
 */
public class StackApp {
     public static void main(String[] args) {
        String nama = "Muhammad Isa Nuruddin";
        Stack stack = new Stack(10);
        stack.push(6);
        stack.baca();
        stack.push(2);
        stack.baca();
        stack.push(3);
        stack.baca();
        long nTeratas = stack.peek();
        System.out.println("nilai Teratas = "+ nTeratas);
        System.out.println("Nama Saya Adalah : "+ nama);
        System.out.println("nilai Yang dihapus = "+ stack.pop());
        stack.baca();
        System.out.println();
        stack.push(4);
        stack.baca();
    }
}
