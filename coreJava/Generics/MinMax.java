package coreJava.Generics;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();

}

class MyClass<T extends Comparable<T>> implements MinMax<T>{

    T[] vals;
    MyClass(T[] vals){
        this.vals=vals;
    }

    @Override
    public T min() {
        T v=vals[0];

        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v)<0)v=vals[i];            
        }
        return v;
    }

    @Override
    public T max() {
         T v=vals[0];

         for(int i=1;i<vals.length;i++){
            if(vals[i].compareTo(v)>0)v=vals[i];
         }
         return v;
    }
    
}

class GenericDemoTest{
    public static void main(String[] args) {
        Integer[] inums={2,4,6,8};
        Character[] chs={'b','r','p','w'};
        
        MyClass<Integer> iob=new MyClass<Integer>(inums);
        MyClass<Character> cob=new MyClass<Character>(chs);

        System.out.println("Max value in inums: "+iob.max());
        System.out.println("Max value in chs: "+cob.max());
    }
}
