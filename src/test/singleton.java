package test;

public class singleton {
    private static class singletonHolder{
        private static final singleton instance = new singleton();
    }

    private static singleton Instance;

    private singleton() {
    }

    public synchronized singleton getinstance(){
        if(Instance == null) {
            synchronized (singleton.class) {
                if(Instance == null)
                    Instance = new singleton();
            }
        }
        return Instance;
    }

    public static singleton getInstance() {
        return singletonHolder.instance;
    }
}
