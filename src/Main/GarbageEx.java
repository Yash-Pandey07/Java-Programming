package Main;

public class GarbageEx {
    //    public void close() {
//        System.out.println("Cleanup operations performed!");
//    }
    public static void main(String[] args) {
        GarbageEx obj = new GarbageEx();
        obj = null;
        System.gc(); // Suggests the JVM to run garbage collection
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Garbage collected");
//    }
}
