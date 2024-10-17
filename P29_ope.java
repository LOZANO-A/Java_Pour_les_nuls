public class P29_ope {
    public static void main(String[] args) {
        int nbr1, nbr2, nbr3;
        nbr1 = nbr2 = nbr3 = 0;

        nbr1 = nbr1 +1;
        System.out.println(nbr1);
        nbr1 = nbr1 +1;
        System.out.println(nbr1);

        nbr2 = nbr1;
        System.out.println(nbr2);
        nbr2 = nbr2 *2;
        System.out.println(nbr2);

        nbr3 = nbr2;
        System.out.println(nbr3);
        nbr3 = nbr3 / nbr3;
        System.out.println(nbr3);

        nbr1 = nbr1 - 1;
        System.out.println(nbr1);


        nbr1 = nbr1+1;
        System.out.println(nbr1);
        nbr1 += 1;
        System.out.println(nbr1);
        nbr1++;
        System.out.println(nbr1);
        ++nbr1;
        System.out.println(nbr1);


        nbr1 = nbr1-1;
        System.out.println(nbr1);
        nbr1 -= 1;
        System.out.println(nbr1);
        nbr1--;
        System.out.println(nbr1);
        --nbr1;
        System.out.println(nbr1);


        nbr1 = nbr1 * 2;
        System.out.println(nbr1);
        nbr1 *= 2;
        System.out.println(nbr1);
        nbr1 = nbr1 / 2;
        System.out.println(nbr1);
        nbr1 /= 2;
        System.out.println(nbr1);
    }
}
