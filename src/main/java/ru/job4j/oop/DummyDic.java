package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        String eng = translator.engToRus("house");
        System.out.println("Неизвестное слово. " + eng);
    }
}

