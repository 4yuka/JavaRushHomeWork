package com.javarush.test.level14.lesson06.home01;

/**
 * Created by mucherinovnv on 26.01.2016.
 */
public class RussianHen extends Hen
{

    public int getCountOfEggsPerMonth()
    {
        return 2;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
