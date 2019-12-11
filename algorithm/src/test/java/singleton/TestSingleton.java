package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Thread2[] thread2s=new Thread2[1000];
        for(int i=0;i<thread2s.length;i++){
            thread2s[i]=new Thread2();
            thread2s[i].start();
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println(Singleton.getInstance().hashCode());
    }
}
