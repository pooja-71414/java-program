class jagged_array 
{
    public static void main(String[] args) 
    {
        int[][] ja=new int[3][];
        ja[0]=new int[]{1,4,3,6,7,8};
        ja[1]=new int[]{5};
        ja[2]=new int[]{4,7,5,89,5,9};
        for (int i = 0; i < ja.length; i++) 
        {
            for (int j = 0; j < ja[i].length; j++) 
            {
                System.out.print(ja[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        String[][] jas=new String[3][];
        jas[0]=new String[]{"hiii","hello","saru ne"};
        jas[1]=new String[]{"asdf","jkl"};
        jas[2]=new String[]{"gh","op","control"};
        for (int i = 0; i < jas.length; i++) 
        {
            for (int j = 0; j < ja[i].length; j++) 
            {
                System.out.print(jas[i][j] + "  ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }    
}
