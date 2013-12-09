package pivotal.au.accelarator.gemfirexd.sql.functions;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

public class GemFireXdSqlFunctions
{
    public static String initcap (String input)
    {
        return WordUtils.capitalizeFully(input);
    }

    public static String remove (String input, String replace)
    {
        return StringUtils.remove(input, replace);
    }

    public static String lpad (String input, int size, String padChar)
    {
        return StringUtils.leftPad(input, size, padChar);
    }

    public static String rpad (String input, int size, String padChar)
    {
        return StringUtils.rightPad(input, size, padChar);
    }

    public static String translate (String input, String searchChars, String replaceChars)
    {
        return StringUtils.replaceChars(input, searchChars, replaceChars);
    }

    public static String replace (String input, String searchString, String replacement)
    {
        return StringUtils.replace(input, searchString, replacement);
    }

    public static int instr (String input, String searchString, int startPos, int appearance)
    {
        int newStartPosition = startPos;
        int position = 0;

        if (appearance < 1)
        {
          // we don't support using a negative or 0 value at this stage
          return 0;
        }

        for (int i = 1; i <= appearance; i++)
        {
           int x = StringUtils.indexOf(input, searchString, newStartPosition);

           if (x == -1)
           {
               // string not found return 0
               return 0;
           }
           else
           {
                if (appearance == i)
                {
                    position = x + 1;
                }

                newStartPosition = x + 1;
           }
        }

        return position;
    }
}
