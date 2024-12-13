package Main;

public class PrivateClass {
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
