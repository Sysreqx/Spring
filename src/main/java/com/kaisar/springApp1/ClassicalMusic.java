package com.kaisar.springApp1;

import java.util.ArrayList;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classical music getSong()";
    }

    @Override
    public ArrayList<String> songsList() {
        return null;
    }
}
