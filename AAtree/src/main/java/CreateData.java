public class CreateData {
    public int[] randomArray(){
        int ARRAY_SIZE = 10000;
        int[] a = new int[ARRAY_SIZE];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100_000_000);
        }

        return a;
    }

}
