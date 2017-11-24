package m_1.by.bsu.serial;

import java.io.*;

public class Serializator {
    public boolean serialization(Student s, String filename){
        boolean flag = false;
        File f = new File(filename);
        ObjectOutputStream ostream = null;
        try{
            FileOutputStream fos = new FileOutputStream(f);
            if (fos !=null){
                ostream=new ObjectOutputStream(fos);
                ostream.writeObject(s);
                flag=true;
            }
        } catch (FileNotFoundException e){
            System.err.println("File doesn't create "+e);
        } catch (NotSerializableException e){
            System.err.println("Class doesn't support Serialization "+e);
        } catch (IOException e){
            System.err.println(e);
        }
        finally {
            try{
                if (ostream !=null){
                    ostream.close();
                }
            } catch (IOException e){
                System.err.println("Erro for cloe stream");
            }
        }
        return flag;
    }

    public Student deserialization(String fileName) throws InvalidObjectException{
        File fr = new File(fileName);
        ObjectInputStream istream = null;
        try{
            FileInputStream fis = new FileInputStream(fr);
            istream = new ObjectInputStream(fis);
            Student st =(Student) istream.readObject();
            return  st;
        } catch (ClassNotFoundException e){
            System.err.println("Class doesn't exists"+e);
        } catch (FileNotFoundException e){
            System.err.println("File for deserialization doesn't exists"+e);
        } catch (InvalidClassException e){
            System.err.println("Uncompatable version classes: "+e);
        } catch (IOException e){
            System.err.println("I/O error");
        } finally {
            try{
                if (istream != null){
                    istream.close();
                }
            } catch (IOException e){
                System.err.println("Error closing file");
            }
        }
        throw new InvalidObjectException("Object doesn't repair");
    }
}
