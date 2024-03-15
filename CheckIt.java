public class CheckIt {
    public static boolean checkIt (boolean a, boolean b, boolean c)
    {
        if (a || (b && c))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main (String[] args)
    {  // Driver method for checkIt
        // Read an array from standard input, call checkIt()
        boolean []inArr = new boolean [args.length];
        if (args.length != 3)
        {
            System.out.println ("Usage: java checkIt v1 v2 v3");
            return;
        }

        for (int i = 0; i< args.length; i++)
        {
            inArr [i] = Boolean.parseBoolean(args[i]);
        }

        checkIt (inArr[0], inArr[1], inArr[2]);
    }
}
