


public class ArrayTracing
{
    int[] a = {1,2,3,4,5,4,3,2,1,0};
    public void t1(){
        int total = 0;
        for(int i = 0; i < 10; i++){
            total = total + a[i];
        }
    }

    public void t2(){
        int total = 0;
        for(int i = 0; i < 10; i = i +2){
            total = total + a[i];
        }
    }

    public void t3(){
        int total = 0;
        for(int i = 1; i < 10; i= i + 2){
            total = total + a[i];
        }
    }

    



}
        