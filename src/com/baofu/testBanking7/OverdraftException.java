package com.baofu.testBanking7;

/**
 * Created by BF100427 on 2020/7/28.
 */
public class OverdraftException extends Exception {
    static final long serialVersionUID = -3387516993145229948L;

    private double deficit;

    public OverdraftException(String msg,double deficit){
        super(msg);
        this.deficit = deficit;
    }
    public double getDeficit() {
        return deficit;
    }

}
