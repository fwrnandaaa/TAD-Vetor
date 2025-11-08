public class VetorArrayTeste{
    public static void main(String[] args){
        VetorArray v = new VetorArray(10);
        for(int i = 0; i<5; i++){
            v.insertAtRank(i, (16+i));
        }
        v.verVetor();
        v.insertAtRank(2, 2);
        System.out.println("\n");
        v.verVetor();

       System.out.println("Elemento no rank 3: "+v.elemAtRank(3));
    }
}