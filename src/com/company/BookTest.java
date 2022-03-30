package com.company;

public class BookTest {

    public static void main(String[] args) {
	// write your code here
        ProgrammingBook[] programmingBooks=new ProgrammingBook[5];
        programmingBooks[0]=new ProgrammingBook(1,"Kid",2000,"Hai","C+","Play");
        programmingBooks[1]=new ProgrammingBook(2,"Man",1000,"Hung","PHP","Spring");
        programmingBooks[2]=new ProgrammingBook(3,"Woman",1000,"Hai","Java","Grails");
        programmingBooks[3]=new ProgrammingBook(4,"OldMan",1500,"Dung","C","Play");
        programmingBooks[4]=new ProgrammingBook(5,"YoungMan",1500,"Phong","Java","Grails");
        FictionBook[] fictionBooks=new  FictionBook[5];
        fictionBooks[0]=new FictionBook(6,"Sun",1700,"Hai","TrinhTham");
        fictionBooks[1]=new FictionBook(7,"Moon",1300,"Hung","KinhDi");
        fictionBooks[2]=new FictionBook(8,"Earth",1500,"Phong","HaiHuoc");
        fictionBooks[3]=new FictionBook(9,"Water",1200,"King","PhieuLuu");
        fictionBooks[4]=new FictionBook(10,"Win",1400,"Bien","HaiHuoc");
        for (ProgrammingBook programmingBook: programmingBooks){
            System.out.println(programmingBook);
        }
        float sumPrice1=0;
        for (FictionBook fictionBook: fictionBooks){
            System.out.println(fictionBook);
        }int count=0;
        float sumPrice=0;
        for (ProgrammingBook programmingBook: programmingBooks){
            sumPrice+=programmingBook.getPrice();

            if (programmingBook.getLanguage()=="Java"){
                count++;
            }

        }
        for (FictionBook fictionBook: fictionBooks){
            sumPrice1+=fictionBook.getPrice();

        }
        float total=0;
         total=sumPrice+sumPrice1;
        System.out.println("Tong tien 10 cuon sach la: "+total+"\n"+"So sach ProgrammingBook co language Java la: "+count);


    }
}
