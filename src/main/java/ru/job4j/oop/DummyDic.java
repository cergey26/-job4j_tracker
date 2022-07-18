package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "Неизвестное слово. " + eng;
        return eng;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        String reply = translator.engToRus("house");
        System.out.println(reply);
    }
}

