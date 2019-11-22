/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import mingzhang.kmertest.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import utils.IOUtils;

/**
 *
 * @author mingzhang
 */
public class sample2{
     public sample2 (){
          
        this.getN50();
     }
    public void getN50(){

BufferedReader br =IOUtils.getTextReader(new File("/data1/home/mingzhang/BT01406/BT01406.25merlist.txt").getAbsolutePath());
BufferedWriter bw =IOUtils.getTextWriter(new File("/data1/home/mingzhang/BT01406/BT01406.25listout.txt").getAbsolutePath());
String temp=null;
try {
long sum=0L;
while((temp=br.readLine())!=null ){
    String[]x= temp.split("\t");
    if (x.length!=2)continue;
    long nub=Long.valueOf(x[1]);
    sum=sum+nub;
    if (sum < 19021488992L ){
        bw.write(temp);
        bw.newLine();
    }else{
        break;
    }
}
br.close();bw.flush();bw.close();
}
    catch (Exception e) {
       e.printStackTrace();
    }
 }
    public static void main(String[] args) {
      new sample2();  
    }
}
        
        
//        new kmertest();
         

