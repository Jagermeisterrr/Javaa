package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1,n1,p1,m2,n2,p2,m3,n3,p3;
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
        if(m1+n1+p1>m2+n2+p2&&m1+n1+p1>m3+n3+p3)
            System.out.println("Победил Иванов"+"\nЭтот задрот набрал :"+(m1+n1+p1));
        else if(m2+n2+p2>m1+n1+p1&&m2+n2+p2>m3+n3+p3)
            System.out.println("Победил Петров"+"\nЭтот задрот набрал :"+(m2+n2+p2));
        else if (m3+n3+p3>m2+n2+p2&&m3+n3+p3>m1+n1+p1)
            System.out.println("Победил Сидоров"+"\nЭтот задрот набрал :"+(m3+n3+p3));
        else if (m1+n1+p1==m2+n2+p2&&(m1+n1+p1>m3+n3+p3||m2+n2+p2>m3+n3+p3))
            System.out.println("Победил Иванов и Петров");
        else if (m1+n1+p1==m3+n3+p3&&(m1+n1+p1>m2+n2+p2||m3+n3+p3>m2+n2+p2))
            System.out.println("Победил Иванов и Сидоров");
        else if (m3+n3+p3==m2+n2+p2&&(m3+n3+p3>m1+n1+p1||m2+n2+p2>m1+n1+p1))
            System.out.println("Победил Сидоров и Петров");










        //К финалу конкурса лучшего по профессии «Специалист электронного офиса» были допущены трое: Иванов, Петров, Сидоров.
        //        Соревнования проходили в три тура. Иванов в первом туре набрал M1 баллов, во втором – N1, в третьем – P1.
        //        Петров – соответственно M2, N2, P2. Сидоров – M3, N3, P3.
        //        Составьте программу, определяющую, сколько баллов набрал победитель, все данные считтываются с клавиатуры.
        //Победитель определяется по победам в турах, общей сумме баллов, в противном случае место делится.
    }
}