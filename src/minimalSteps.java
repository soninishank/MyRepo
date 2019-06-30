import java.util.Set;

public class minimalSteps {


    public static String rle(String input)
    {
        if (input == null)
        {
            return "";
        }
        int num = input.length();
        String temp = "";
        for(int i = 0 ; i < num ; i++)
        {
            int count = 1 ;
            while ( i < num - 1 && input.charAt(i) == input.charAt(i+1))
            {

                count++;
                i++;
            }

            temp += input.charAt(i)+ String.valueOf(count);
        }


        return temp;
    }


    public static void main(String[] args) {

        String str = "";

        String rle = rle(str);

        System.out.println(rle);


    }
}
