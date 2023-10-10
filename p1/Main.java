package p1;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) throws CloneNotSupportedException {
        Phone[] phone=new Phone[3];
        Phone inf = new ApplePhone("89095673554","iphone15",171);
        Phone inf1 = new XiaomiPhone("89125463654","Xiaomi 12",160 );
        Phone inf2 = new SamsungPhone("89505674348","Galaxy S22",167);
        inf.setName("Ivan");
        inf.receiveCall();
        inf.Info();
        inf1.setName("Masha");
        inf1.receiveCall();
        inf1.Info();
        inf2.setName("Dasha");
        inf2.receiveCall();
        inf2.Info();

        for(int i=0; i< phone.length;i++){
        phone[0]=(Phone)inf.clone();
        phone[1]=(Phone)inf1.clone();
        phone[2]=(Phone)inf2.clone();

        }

        System.out.println(Arrays.toString(phone));






    }
}