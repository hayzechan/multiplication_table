package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if(isValid(start,end)){
            return generateLine(start,end);
        }
        else{
            return null;
        }
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String Table = "";
        for(int j = start; j<=end; j++){
                Table = Table + generateLine(start, j);
                if(j<end){
                    Table += "\n";
                }
        }
        return Table;
    }
    //^
    public String generateLine(int start, int row) {
        //call generateSingleExpression
        String Line = "";
        for(int i = start; i <= row; i++) {
                Line = Line + generateSingleExpression(i, row) + "  ";
        }
        Line = Line.trim();
        return Line ;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return String.format("%d*%d=%d",multiplicand,multiplier,multiplicand*multiplier);

    }
}
