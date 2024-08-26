public class IntegerToRoman {


    public static String value(int num)
    {
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;i<values.length;i++)
        {
            while(num >= values[i])
            {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }

        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(value(78));
    }
    }



