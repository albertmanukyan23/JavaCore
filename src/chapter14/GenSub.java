package chapter14;

public class GenSub extends  Gen4<String>{

    public GenSub(String o) {
        super(o);
    }
    public String getOb(){
        System.out.println("hello");
        return o;
    }
}
