package com.kaisar.springApp1;

import java.util.ArrayList;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock Music getSong()";
    }

    @Override
    public ArrayList<String> songsList() {
        return null;
    }
}
