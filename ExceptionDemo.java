/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
class MyException extends Exception{
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }
    
    public String toString(){
        return "MyException["+detail+"]";
    }
    
    
}

class ExceptionDemo{
    static void compute(int a ) throws MyException{
        System.out.println("Вызван compute("+a+")");
        if(a>10) 
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }
    
    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        }
        catch(MyException e){
            System.out.println("Перехвачено "+e);
            
        }
    }
}

