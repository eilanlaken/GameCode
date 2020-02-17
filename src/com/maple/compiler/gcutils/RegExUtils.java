package com.maple.compiler.gcutils;

import java.util.List;

public class RegExUtils {


    public static String getCompoundRegex(List<String> regularExpressions) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < regularExpressions.size() - 1; i++) {
            stringBuilder.append(regularExpressions.get(i) + "|");
        }
        stringBuilder.append(regularExpressions.get(regularExpressions.size() - 1));
        return stringBuilder.toString();
    }

    public static class MatchingRegion {

        public final String subText;
        public final int startIndex;
        public final int endIndex;

        MatchingRegion(final String subText, final  int startIndex, final int endIndex) {
            this.subText = subText;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public String toString() {
            return "<" + subText + " : " + startIndex + "," + endIndex + ">";
        }
    }

}
