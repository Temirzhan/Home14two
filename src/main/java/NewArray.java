public class NewArray {
    public int[] getAfterFour(int[] array){
        int lastFour = -1;
        if(array.length == 0)
            throw new RuntimeException();
        for(int i = 0; i < array.length; i++){
            if(array[i] == 4)
                lastFour = i;
        }
        if(lastFour != -1){
            lastFour++;
            int[] newArray = new int[array.length - lastFour];

            for (int i = lastFour; i < array.length; i++){
                newArray[i-lastFour] = array[i];
            }
            return newArray;
        }else {
            throw new RuntimeException();
        }

    }

    public boolean haveOneAndFour(int[] array){
        int four = 0;
        int one =0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 4 && array[i]!= 1) {
                return false;
            }else if(array[i] == 4)
                four = 1;
            else if(array[i]==1)
                one = 1;
            else
                return false;
        }
        if(four != 0 && one !=0)
            return true;

        return false;
    }
}
