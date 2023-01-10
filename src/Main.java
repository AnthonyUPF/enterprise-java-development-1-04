public class Main {
    public static void main(String[] args) {
        int [] array={10,3,4,-6,5};

        difference(array);

        moreSmalls(array);

        double x=5;
        double y=1;
        solution(x,y);


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

    public static void moreSmalls(int[] array){
        int min1=array[0];
        int min2=array[0];
        for(int n: array){
            if(n<=min1){
                min2=min1;
                min1=n;
            }else if(n<=min2 && min2!=min1){
                min2=n;
            }
        }
        System.out.println("Minimum 1: "+min1);
        System.out.println("Minimum 2: "+min2);
    }

    public static void solution(double x, double y){
        double R=Math.pow(x,2.)+Math.pow((4*y/5)-x,2.);
        System.out.println("The solution with x= "+x+" and y= "+y+" is "+R);
    }


}