package com.shop.abdul;



public class Subject {
    private String subjectId;
    private String subjectName;
    private double maxMarks;
    private double marksGot;
    // Constructor 1
    public Subject(String subjectId, String subjectName){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    //Constructor 2
    public Subject(String subjectId, String subjectName, double highest){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        setMaxMarks(highest);
    }



    public void setMaxMarks(double maxMarks) {
        if (maxMarks <= 100 && maxMarks > 0){
            this.maxMarks = maxMarks;
        }
    }

    public void setMarksGot(double marksGot) {
        if (marksGot >= 0 && marksGot <= 100) {
            this.marksGot = marksGot;
        }
    }

    public String getSubjectId() {
        return subjectId;
    }

    public double getMaxMarks() {
        return maxMarks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getMarksGot() {
        return marksGot;
    }

    public boolean validateMarks(){
        if (this.maxMarks >= this.marksGot){
            return true;
        }
        return false;
    }

    public String toString(){
        return ("Subject " + subjectName + " maximum marks " +maxMarks + " Subject Id " + subjectId );
    }


}



