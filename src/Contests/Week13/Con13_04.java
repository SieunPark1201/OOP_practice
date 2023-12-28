package Contests.Week13;

public class Con13_04 {
    public static void main(String[] args) {
        DataWrapper<Integer> c1 = new DataWrapper<Integer>(4);
        DataWrapper<String> c2 = new DataWrapper<String>("Korea");
        DataWrapper<Double> c3 = new DataWrapper<Double>(5.43);

        c1.merge(3.62);
        c2.merge(-5);
        c3.merge("Seoul");
    }

}

class DataWrapper<T>{

    private T object;

    public DataWrapper(T object){
        this.object = object;
    }

    public void merge(Object object){
        if (object instanceof Number && this.object instanceof Number){
            Double mergedNum =(((Number) this.object).doubleValue() + ((Number) object).doubleValue());
            System.out.println(mergedNum);
        } else {
            String mergedOb = this.object.toString() + object.toString();
            System.out.println(mergedOb);
        }

    }

}