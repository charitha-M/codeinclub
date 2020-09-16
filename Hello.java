public class Hello
{ 
        public static void main(String[] argv)
          {
            while(true)
             {
                System.out.println("hello world");
                 try
                  {
		           Thread.sleep(6000);
                  }
                  catch(Exception ex){}
             }
          }
}


