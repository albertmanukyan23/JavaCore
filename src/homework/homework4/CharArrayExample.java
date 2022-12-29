package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        System.out.println(" Homework 4 ");

        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int oCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                oCount++;
            }
        }
        System.out.println("c-փոփոխականից կա " + oCount + " հատ");

        //գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները
        int midIndex1 = chars.length / 2;
        int midIndex2 = midIndex1 - 1;
        System.out.println("Մեջտեղի սինվոլներն են " + chars[midIndex2] + " և " + chars[midIndex1]);

        //պետք է տպենլ true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        boolean isEnded = false;

        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            isEnded = true;
        }
        System.out.println(isEnded);

        //պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i] + " ");
            }
        }

    }
}
