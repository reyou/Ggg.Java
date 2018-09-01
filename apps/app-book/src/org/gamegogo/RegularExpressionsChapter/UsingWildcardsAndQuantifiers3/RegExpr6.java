package org.gamegogo.RegularExpressionsChapter.UsingWildcardsAndQuantifiers3;

// Use the ? quantifier.

import java.util.regex.*;

class RegExpr6 {
    public static void main(String args[]) {
// Use reluctant matching behavior.
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end table");
        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}
