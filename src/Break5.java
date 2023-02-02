public class Break5 {
    public static void main(String[] args){
done:
    for (int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++){
            for (int K = 0; K < 10; K++){
                System.out.println(K + " ");
                if(K == 5) break done;
            }
            System.out.println("After K Loop");
        }
        System.out.println("After j loop");
    }
    System.out.println("After i loop");
    }
}
