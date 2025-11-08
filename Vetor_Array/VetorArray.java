public class VetorArray{
        private int size;
        private Object[] vetorArray;

        public VetorArray(int capacidadeInicial){
            vetor_array  = new Object[capacidadeInicial];
            size = 0;
        }

        public boolean isEmpty(){
            if(this.size == 0){
                return true
            }
            return false;
        }
        public int size(){
            return size;
        }
        elemAtRank(int r){
            if(r < 0 || r >=size()){
                throw new VetorArrayExcecao("O rank é inválido");
            }
            else{
                return VetorArray[r];
            }
        }
    insertAtRank(int r, Object O){
        if(r < 0 || r >= size){
            throw new VetorArrayExcecao("O rank é inválido");
        }
        else{
            for(int i = size-1; i< size; i++)
            VetorArray[r] = O;
        }
    }
}