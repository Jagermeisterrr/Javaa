package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1,n1,p1,m2,n2,p2,m3,n3,p3,ivanov,petrov,sidorov;
        System.out.println("Введите сколько пачаны набрали баллов");
        m1=in.nextInt();
        n1=in.nextInt();
        p1=in.nextInt();
        m2=in.nextInt();
        n2=in.nextInt();
        p2=in.nextInt();
        m3=in.nextInt();
        n3=in.nextInt();
        p3=in.nextInt();
        ivanov=m1+n1+p1;
        petrov=m2+n2+p2;
        sidorov=m3+n3+p3;
        if(ivanov>petrov&ivanov>sidorov)
            System.out.println("Победил Иванов"+"\nЭтот задрот набрал :"+ivanov);
        else if(petrov>ivanov&petrov>sidorov)
            System.out.println("Победил Петров"+"\nЭтот задрот набрал :"+petrov);
        else if (sidorov>petrov&sidorov>ivanov)
            System.out.println("Победил Сидоров"+"\nЭтот задрот набрал :"+sidorov);
        else if (ivanov==petrov&ivanov>sidorov)
            System.out.println("Победил Иванов и Петров");
        else if (ivanov==sidorov&ivanov>petrov)
            System.out.println("Победил Иванов и Сидоров");
        else if (petrov>ivanov)
            System.out.println("Победил Сидоров и Петров");
        else
            System.out.println("Победили все");









        //К финалу конкурса лучшего по профессии «Специалист электронного офиса» были допущены трое: Иванов, Петров, Сидоров.
        //        Соревнования проходили в три тура. Иванов в первом туре набрал M1 баллов, во втором – N1, в третьем – P1.
        //        Петров – соответственно M2, N2, P2. Сидоров – M3, N3, P3.
        //        Составьте программу, определяющую, сколько баллов набрал победитель, все данные считтываются с клавиатуры.
        //Победитель определяется по победам в турах, общей сумме баллов, в противном случае место делится.
    }
}