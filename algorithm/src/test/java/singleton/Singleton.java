package singleton;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance(){
        //if(singleton==null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(Singleton.class){
               if(singleton==null){
                   singleton=new Singleton();
               }
            }
        //}
        return singleton;
    }
}
