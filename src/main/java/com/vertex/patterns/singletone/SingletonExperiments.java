package com.vertex.patterns.singletone;

public class SingletonExperiments {

    private SingletonExperiments() {
    }

    private static class SingletonHolder {
        private static final SingletonExperiments HOLDER = new SingletonExperiments();
    }

    public static SingletonExperiments getInstance() {
        return SingletonHolder.HOLDER;
    }
}

class OtherClass {
    public static void main(String[] args) {
//        System.out.println(SingletonExperiments.SingletonHolder.HOLDER);
    }
}
