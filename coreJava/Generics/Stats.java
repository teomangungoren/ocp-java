package coreJava.Generics;

public class Stats<T extends Number> {

    T[] nums;

    Stats(T[] nums){
        this.nums=nums;    
    }
    
    double average(){
        double sum=0.0;

        for (int i = 0; i < nums.length; i++) 
            sum += nums[i].doubleValue();
            return sum / nums.length;
        
    }
}

class BoundsDemo{
    public static void main(String[] args) {
        Integer[] inums={1,2,3,4,5,6};
        Stats<Integer> ob=new Stats<Integer>(inums);
        double v=ob.average();
        System.out.println("ob's average is "+v);

    }
}
