package com.javarush.test.level14.lesson06.home01;

/**
 * Created by mucherinovnv on 26.01.2016.
 */
public class MoldovanHen extends Hen
{

    public int getCountOfEggsPerMonth()
    {
        return 3;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
