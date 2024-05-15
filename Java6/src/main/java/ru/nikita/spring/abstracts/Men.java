package ru.nikita.spring.abstracts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nikita Isaev 23PMI
 * Класс Men наследующийся от Bs
 *
 *
 */


public class Men extends Bs{

    /** Поле Fio */
    private String Fio;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param Fio - производитель
     * @param bs - цена
     */
    public Men(String Fio, String bs) {
        super(bs);
        this.Fio = Fio;
    }

 //   public Men(){
 //
 //   }

    /**
     *
     * @return возращает Fio бъекта класса Men
     */
    public String getFio() {
        return Fio;
    }

    public void setFio(String fio) {
        Fio = fio;
    } // необходимо его создать длдя работы в методе Vvesti

    /**
     * переопределил метод toString
     * @return Строка в которой содержится информация об объекте
     */
    @Override
    public String toString() {
        return "Men{" +
                "Fio='" + Fio + '\'' +
                '}';
    }

 /*
    public  List<Bs> Vvesti(int count,Scanner scanner) {  // подаю Scanner для ввода данных
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите 1, если хотите ввести объекты класса Bs, и 2 если Men");
        String a = in.nextLine();
        switch (a){
            case "1":{
                System.out.println("Имя массива Bss");
                List<Bs> bs = new ArrayList<Bs>();
                for (int i = 0; i < count; i++) {
                    System.out.println("Введите имя отдела для объекта Bs:");
                    String otdel = in.nextLine();
                    bs.add(new Bs(otdel));
                }
                return bs;
            }
            case "2":{
                System.out.println("Имя массива Mens");
                List<Men> bs = new ArrayList<Men>();
                for (int i = 0; i < count; i++) {
                    System.out.println("Введите имя для объекта Men:");
                    String name = in.nextLine();
                    System.out.println("Введите имя отдела для объекта Men:");
                    String otdel = in.nextLine();
                    bs.add(new Men(name, otdel));
                }
                return bs;
            }
        }

    }
*/
//    public  List<Bs> Vvesti(int count,Scanner scanner) {
//        List<Bs> bs = new ArrayList<Bs>();
//        for (int i = 0; i < count; i++) {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Введите имя отдела для объекта Bs:");
//            String otdel = in.nextLine();
//            bs.add(new Bs(otdel));
//        }
//        return bs;
//    }


}
