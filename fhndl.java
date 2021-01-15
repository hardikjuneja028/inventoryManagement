package stockmgm;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
public class fhndl {
    public static void main(String[] args) {
        try
        {
              FileInputStream file1=new FileInputStream("abc3.txt");
     FileInputStream file2=new FileInputStream("xyz.txt");
   FileOutputStream file4=new FileOutputStream("abc4.txt");
     SequenceInputStream file3=new SequenceInputStream(file1,file2);
BufferedInputStream inBuffer=new BufferedInputStream(file3);
BufferedOutputStream outBuffer=new BufferedOutputStream(file4);
       int a;
       while((a=inBuffer.read())!=-1)
       {
           System.out.print((char)a);
           outBuffer.write((char)a);
       }
       inBuffer.close();
       outBuffer.close();
       file1.close();
       file2.close();
            
//            RandomAccessFile a=new RandomAccessFile("abc.txt","rw");
//            a.writeChar('x');
//            a.writeInt(444);
//            a.writeDouble(33.55);
//            a.seek(6); // a.seek(2);
//            System.out.println(a.readDouble());
//            File abc=new File("xyz2.txt");
//            
//            FileOutputStream fos=new FileOutputStream(abc);
//            
//            DataOutputStream dos=new DataOutputStream(fos);
//
//            dos.writeInt(9000);
//            dos.writeFloat(134.56f);
//            dos.writeDouble(4434.55);
//            dos.writeInt(8000);
//            dos.writeChar('A');
//            dos.close();
//            fos.close();
//            
//            FileInputStream fis=new FileInputStream(abc);
//            DataInputStream dis=new DataInputStream(fis);
//            
//            System.out.println(dis.readInt());
//            System.out.println(dis.readFloat());
//            System.out.println(dis.readDouble());
//            System.out.println(dis.readInt());
//            System.out.println(dis.readChar());
//            dis.close();
//            fis.close();
        }
        catch(Exception e)
        {
            
        }
        
        
        
//         int b;
//          //    File objin=new File("abc.txt");
//          //    File objout=new File("abc2.txt");
//              FileReader ins=null;
//              FileWriter outs=null;
//            try
//            {
//            ins=new FileReader("xyz.txt");
//            outs=new FileWriter("abc3.txt");
//           while((b=ins.read()) != -1)
//           {
//               System.out.print((char)b);
//               outs.write(b);
//           }
//           }
//            catch(Exception e)
//            {
//                System.out.println("Error Occured");
//            }
//              finally
//              {
//                  try
//                  {
//                     ins.close();
//                     outs.close();
//                  }
//                  catch(Exception e)
//                  {
//                      System.out.println("Cannot close the file, error occured");
//                  }
//              }
        
        
        
        
//       int b;
//       try
//       {
//        FileInputStream objin=new FileInputStream("xyz.txt");
//         while((b=objin.read()) != -1)
//           {
//               System.out.print((char)b);
//           }
//           objin.close();
//       }
//       catch(Exception e)
//       {
//           System.out.println("Error Occured");
//       }
        
        
//       byte cities[]={'D','E','L','H','I','\n','J','A','L','A','N','D','H','A','R'};
//       try
//       {
//            FileOutputStream objout=new FileOutputStream("xyz.txt");
//            objout.write(cities);
//            objout.close();
//       }
//       catch(Exception e)
//       {
//           System.out.println("Error Occured");
//       }
    }
}
