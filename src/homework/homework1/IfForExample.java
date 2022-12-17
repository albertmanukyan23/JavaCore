package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {

        int a = 88;
        int b = 95;
        int max;

        //Գրել կոդ, որը կտպի այդ երկու փոփոխականից մեծը։

        if (a > b) {
            max = a;
            System.out.println(max);
        } else {
            max = b;
            System.out.println(max);
        }

        //Գրել կոդ, որ այդ նույն թվերից փոքրից մինչև մեծ ցիկլ կֆռռա, ու կտպի իրենց արանքում գտնվող բոլոր թվերը։

        for (int i = a; i <= b; i++) {
            System.out.println(i);

        }
        //Փոխակերպել a-ի արժեքը char-տիպի, ու տպել թե ինչ սինվոլ ստացվեց։ Նույնը b-ի համար։

        char a1 = (char) a;
        char b1 = (char) b;

        System.out.println("a= " + a1 + "\nb= " + b1);

        //Գրել կոդ, որը կստուգի եթե a-ն հավասար է b-ին, կտպի` a-ն հավասար է բ-ին, եթե ոչ, կտպի որ հավասար չէ։

        if (a == b) {
            System.out.println("\na-ն հավասար է b-ին");
        } else {
            System.out.println("\na-ն հավասար չէ b-ին");

        }


    }
}
