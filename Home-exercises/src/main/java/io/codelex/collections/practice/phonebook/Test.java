package io.codelex.collections.practice.phonebook;

public class Test {
    public static void main(String[] args) {
        PhoneDirectory dir1 = new PhoneDirectory();
        System.out.println(dir1);
        dir1.putNumberTreeMap("John", "65656565");
        System.out.println(dir1.findTreeMap("John"));
        System.out.println(dir1);

        PhoneDirectory dir2 = new PhoneDirectory();
        dir2.putNumberTreeMap("Marin", "65434678");
        System.out.println(dir2);
        dir2.putNumberTreeMap("Marin", "65434687");
        System.out.println(dir2);
        System.out.println(dir2.findTreeMap("Marin"));
    }
}
