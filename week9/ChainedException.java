import java.io.*;

public class ChainedException {
  public static void main(String[] args) {
    try {
      f();
    }
    catch (Exception ex) {
      System.out.print("main(): ");
      ex.printStackTrace();
    }
  }
  
  static void f() throws Exception {
    try {
     g();
    }
    catch (IOException ex) {
      Exception ex2 = enw Exception(ex);
      throw ex2;
    }
  }
  
  static void g() throws IOException {
    IOException ex = new IOException();
    throw ex;    
  }  
}
