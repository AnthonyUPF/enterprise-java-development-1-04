public class Main {
    public static void main(String[] args) {
        int [] arrayIntegers={10,3,4,5};

        difference(arrayIntegers);


    }
    public static void difference(int [] array){
        int min=array[0];
        int max=array[0];
        for(int n: array){
            if(n<=min){
                min=n;
            }else if(n>max){
                max=n;
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("maximum: "+max);
        System.out.println("Difference: "+ (max-min));
    }


}