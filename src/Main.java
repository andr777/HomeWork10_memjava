import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Задание 5");
       int value =33;
       changeValue(value);
        System.out.println("value="+value);

        System.out.println("Задание 6");
        Integer value2=33;
        changeValue2(value2);
        System.out.println("value2="+value2);

        System.out.println("Задание 7");
        Integer value3 []={3,4};
        changeValue3(value3);
        // System.out.println("value3[0]="+value3[0]);
       // System.out.println("value3[1]="+value3[1]);
        System.out.println(Arrays.toString(value3));

        System.out.println("Задание 8");
        Integer value4 []={3,4};
        changeValue4(value4);
        System.out.println(Arrays.toString(value4));



    }

    public static void changeValue(int value){
       value=22;
    }
    public static void changeValue2(Integer value2){
        value2=22;
    }
    public static void changeValue3(Integer [] value3){
       // value3 []={1,2}; // не работает
        value3 [0] = 1;
        value3 [1] = 2;
    }

    public static void changeValue4(Integer [] value4){
        // value3 []={1,2};  // не работает
        value4 [0] = 99;
    }

}