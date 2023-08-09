public class fathersongrandfathercount {

    public static void main(String []args)
    {
        String[][] a={
                //son,father
                {"luke","shaw"},
                {"wayne","rooney"},
                {"rooney","ronaldo"},
                {"shaw","rooney"}
        };


        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length/2;j++)
            {
                if(a[i][j].equals("ronaldo"))
                {
                    System.out.println("RONALDO SON IS:"+a[i][j-1]);
                    String grandfathers=a[i][j-1];

                    grandfather(a,grandfathers);
                }
            }
        }
    }

    private static void grandfather(String[][] a,String g) {


        int granchildersncount=0;
        for(int z=0;z<a.length;z++)
        {
            for(int k=1;k<=1;k++)
            {
                if(a[z][k].equals(g))
                {
                    System.out.println("RONALDO GRANDFATHER OF:"+a[z][k-1]);
                    granchildersncount+=1;


                }
            }

        }
        System.out.println("RONALDO GRANDCHILDEREN COUNT IS="+granchildersncount);


    }
}
