public class Main {
    public static void main(String[] args) {
        System.out.println("File to load: " + args[0]);

        //To load the file use the following code
        /*
        ANTLRFileStream input = null;

		try
		{
		    input = new ANTLRFileStream(args[0]);
		}
		catch (IOException e)
        {
            e.printStackTrace();
        }
        */

        // If everything is OK while compiling
        System.exit(0);
        // If there is an error
        //System.exit(-1);
    }
}
