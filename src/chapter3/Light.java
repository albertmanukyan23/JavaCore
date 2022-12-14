package chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 3600;
        long distance = lightspeed * seconds;
        System.out.print(days + " օրվա ընթացքում անցել է \t մոտ " + distance + " հեռավորություն");


    }
}
