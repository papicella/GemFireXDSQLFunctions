package pivotal.au.accelarator.gemfirexd.tests;

import org.junit.Test;
import pivotal.au.accelarator.gemfirexd.sql.functions.GemFireXdSqlFunctions;

import static org.junit.Assert.assertEquals;

public class TestSqlFunctions
{

    @Test
    public void testInitcap() throws Exception
    {
        assertEquals("Apicella", GemFireXdSqlFunctions.initcap("apicella"));
        assertEquals("Pas Apicella", GemFireXdSqlFunctions.initcap("pas apicella"));
    }

    @Test
    public void testRemove() throws Exception
    {
        assertEquals("apicea", GemFireXdSqlFunctions.remove("apicella", "l"));
        assertEquals("apia", GemFireXdSqlFunctions.remove("apicella", "cell"));
    }

    @Test
    public void testLpad() throws Exception
    {
        assertEquals("  pas", GemFireXdSqlFunctions.lpad("pas", 5, " "));
    }

    @Test
    public void testRpad() throws Exception
    {
        assertEquals("pas..", GemFireXdSqlFunctions.rpad("pas", 5, "."));
    }

    @Test
    public void testTranslate() throws Exception
    {
        assertEquals("333tith", GemFireXdSqlFunctions.translate("222tech", "2ec", "3it"));
    }

    @Test
    public void testReplace() throws Exception
    {
        assertEquals("ddbbccdd", GemFireXdSqlFunctions.replace("aabbccaa", "aa", "dd"));
        assertEquals("aabbccaa", GemFireXdSqlFunctions.replace("aabbccaa", "aa", null));
    }

    @Test
    public void testInstr() throws Exception
    {
        assertEquals(2, GemFireXdSqlFunctions.instr("Tech on the net", "e", 1, 1));
        assertEquals(11, GemFireXdSqlFunctions.instr("Tech on the net", "e", 1, 2));
        assertEquals(14, GemFireXdSqlFunctions.instr("Tech on the net", "e", 1, 3));
        assertEquals(0, GemFireXdSqlFunctions.instr("Tech on the net", "z", 1, 1));
        assertEquals(0, GemFireXdSqlFunctions.instr("Tech on the net", "z", 1, -6));
    }

}
