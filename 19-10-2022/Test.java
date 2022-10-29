//write .dat file
public class Test{
    public static void main(String[] args) throws ioException{
        File file = new File("test.dat");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        try(
            DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
        ){
            
        }
    }



    }
}