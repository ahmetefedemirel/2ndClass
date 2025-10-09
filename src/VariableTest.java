public class VariableTest {
    int instanceVar = 10; // instance dediği için static yazmadık.


    public void printInstanceVar(){
        int localVar = 5;   // local variable method çalıştığında oluşur sonra silinir.
        System.out.println("Instance variable inside method: " + instanceVar);
        System.out.println("Local variable inside method: "+ localVar);
    }

    public static void main(String[] args) {
        VariableTest obj = new VariableTest();
        obj.printInstanceVar();
    }






}
