package strings;

import java.util.ArrayList;

public class Strings {

    static ArrayList<Object> test1 = new ArrayList<>();
    static ArrayList<Object> test2 = new ArrayList<>();

    public static void main(String[] args) {
        /* set up ArrayList of chars
         * an ArrayList is used because Arrays were being annoying
         * the ArrayList is used, however, just like an Array */
        
        //test1.add("abc");
        test1.add('t'); test2.add('t');
        test1.add('e'); test2.add('e');
        test1.add('s'); test2.add('s');
        test1.add('t'); test2.add('t');
        //test1.add("abc");
        test1.add('i'); test2.add('i');
        test1.add('n'); test2.add('n');
        test1.add('g');
        test1.add('\0'); test2.add('\0');
        
        // Now that the setup is done, test1 the actual methods
        try {
            System.out.println("strlen(test): " + strlen(test1) + "\n");
        } catch (IndexOutOfBoundsException e) { System.out.println("IndexOutOfBoundsException in attempt to find string length\n"); }

        try {
            ArrayList<Object> copyTo = strcopy(test1);
            System.out.println("Arrays.toString(copyTo): " + copyTo + "\n");
        } catch (IndexOutOfBoundsException e) { System.out.println("IndexOutOfBoundsException in attempt to copy string\n"); }
        
        try {
            System.out.println("strcmp(test, test2): " + strcmp(test1, test2) + "\n");
        } catch (IndexOutOfBoundsException e) { System.out.println("IndexOutOfBoundsException in attempt to compare strings\n"); }
        
        // change test2 so that is the same as test1
        try {
            int test2StrLen = strlen(test2);
            test2.remove(test2StrLen);
            test2.add(test2StrLen, 'g');
            test2.add(test2StrLen + 1, '\0');
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException in attempt to find string length\nChanging test2 ArrayList without using strlen()");//\n");
            test2.add(test2.size(), 'g');
            test2.add('\0');
            System.out.println(test2 + "\n");
        }

        try {
            System.out.println("strcmp(test, test2): " + strcmp(test1, test2) + "\n");
        } catch (IndexOutOfBoundsException e) { System.out.println("IndexOutOfBoundsException in attempt to compare strings\n"); }
    }

    public static int strlen(ArrayList s) {
        int i = 0;
        while ((s.get(i) instanceof Character) && s.get(i) != '\0') {
            i++;
        }
        return i;
    }

    public static ArrayList<Object> strcopy(ArrayList OLD) {
        int i = 0;
        ArrayList<Object> NEW = new ArrayList<>();
        while (OLD.get(i) instanceof Character && OLD.get(i) != '\0') {
            NEW.add(i, OLD.get(i));
            i++;
        }
        NEW.add(i, '\0');
        return NEW;
    }

    public static boolean strcmp(ArrayList one, ArrayList two) {
        int i = 0;
        if (strlen(one) != strlen(two)) {
            return false;
        }
        while ((one.get(i) instanceof Character) && (two.get(i) instanceof Character) && one.get(i) != '\0' && two.get(i) != '\0') {
            if (one.get(i) != two.get(i)) {
                return false;
            }
            i++;
        }
        if (!(one.get(i) instanceof Character) || !(two.get(i) instanceof Character)) {
            return false;
        }
        return true;
    }
}
