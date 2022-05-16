package com.company;

import static java.lang.Math.sqrt;

public class SoPhuc {
    public double pThuc;
    public double pAo;
    SoPhuc(){}
    SoPhuc(double pThuc, double pAo){
        this.pThuc = pThuc;
        this.pAo = pAo;
    }

    public double modunZ(double pThuc, double pAo) {
        return sqrt(pThuc * pThuc + pAo * pAo);
    }

    public void sosanh(SoPhuc sp1, SoPhuc sp2){
        if (sp1.pThuc == sp2.pThuc & sp1.pAo == sp2.pAo){
            System.out.println("Bang nhau!");
        }
    }


}
