public class Space
{
    static int i,c=0,res;
     static int space(String s)
    {
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            c++;
        }
     return c;
    }
    
    public static void main (String args[])
    {
        res=Space.space("i am navaneetha maha vishnu  ");
        System.out.println("The number of white spaces  in the String are :  "+res);
    }
}
