import java.io.IOException;
import java.rmi.RemoteException;

public class Solution9_8_4 {

    public static void main(String[] args) {
            handleExceptions(new Solution9_8_4());
    }

    public static void handleExceptions(Solution9_8_4 obj){
        try
        {
            obj.method1();
            obj.method2();
            obj.method3();

        }

        catch (RemoteException e)
        {
            System.out.println(e.getClass());
        }
        catch (NoSuchFieldException e)
        {
            System.out.println(e.getClass());
        }
        catch(IOException e)
        {
            System.out.println(e.getClass());
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }

}
