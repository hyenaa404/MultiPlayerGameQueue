/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.quiz;

/**
 *
 * @author Admin
 */
public class Quiz {
    private String ques;
    private int ans;

    public Quiz() {
    }

    public Quiz(String ques, int ans) {
        this.ques = ques;
        this.ans = ans;
    }
    

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    
    
    
}
