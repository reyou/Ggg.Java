package org.gamegogo.enumAutoboxingAnnotations;

public class enumerationFundamentals {
    // An enumeration of apple varieties.
    enum Apple{
        Jonathan,
        GoldenDel,
        RedDel,
        Winesap,
        Cortland
    }
    public static void main(String[] args){
        Apple redDel = Apple.RedDel;
        switch (redDel){
            case Jonathan:
                break;
            case GoldenDel:
                break;
            case RedDel:
                break;
            case Winesap:
                break;
            case Cortland:
                break;
        }
    }
}
