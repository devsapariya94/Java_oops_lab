import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PropertiesToFile{
    public static void main(String[] args) {
    try{
        FileInputStream fin;
        FileOutputStream fout;
        fin= new FileInputStream("Test.txt");
        fout= new FileOutputStream("Test.txt");
        int data= 0;
        System.out.println(fin.available());
        String pr= "Prop";
        byte[] b= pr.getBytes();
        fout.write(b);
        fout.write((new String("Properties\n")).getBytes());
        fout.write(System.getProperty("user.name").getBytes());

        fout.write(System.getProperty("line.separator").getBytes());
        fout.write(System.getProperty("java.version").getBytes());
        fout.write(System.getProperty("line.separator").getBytes());
        fout.write(System.getProperty("os.arch").getBytes());
        while((data=fin.read())!=-1){
            System.out.print((char)data);
        }
        fin.close();
        fout.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}