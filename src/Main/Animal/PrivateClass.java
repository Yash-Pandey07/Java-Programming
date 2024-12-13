package Main.Animal;

public class PrivateClass {
    public static class OuterClass {
        private class InnerClass {
            private void privateMethod() {
                System.out.println("Private method called!");
            }
        }

        public void callInnerPrivateMethod() {
            InnerClass inner = new InnerClass();
            inner.privateMethod();
        }
    }
}
