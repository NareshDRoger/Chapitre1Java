package exercise1.question1;

public class Tests {

    /*
     * Le programme test1 affichera toujours "False 10" car nous serons toujours car la totalité des conditions
     * n'a pas été respectée. En effet la vérification des conditions se fait dans l'ordre donnée. Comme result vaut
     * "False" et que le connecteur est un && la condition n'est déjà pas respectée donc l'implémentation de 10 d'output
     * ne sera même pas effectué. Si result aurait eu la valeur "True" nous rentrerons alors dans les instructions du
     * "if" c'est-à-dire que nous aurons un affichage "True 20".
     */
    public static void test1() {
        int output = 10;
        boolean result = false;
        if((result) && ((output += 10) == 20))
            System.out.println("True " + output);
        else System.out.println("False " + output);
    }

    /*
     * Le programme test2 suivant affiche "Result : 28" car il implémente à counter (qui a été initialisé à 0) la valeur
     * de i allant de 1 et s'arrêtera lorsque i vaudra le nombre nombre 010 (en base 8) soit 8 en base 10. (8 est donc
     * exclu de l'implémentation).
     */
    public static void test2() {
        int counter = 0;
        for (int i = 1; i < 010; i++) {
            counter = counter + i;
        }
        System.out.println("Result : " + counter);
    }

    /*
     * La fonction check qui prend en argument un boolean affiche "OK" si ce dernier vaut True sinon "KO" dans le cas
     * contraire.
     */
    public static void check(boolean isOk) {
        if (isOk = true) System.out.println("OK");
        else System.out.println("KO");
    }

    /*
     * La fonction test3 retourne une erreur d'Exception ("Exception in thread "main" java.lang.NullPointerException")
     * car la variable ignore étant une boolean ne peut prendre que deux valeurs (true ou false) or ce n'est pas le cas
     * ici car elle vaut null ici.
     */
    public static void test3() {
        Boolean ignore = null;
        if (ignore == false) {
            System.out.println("Do not ignore!");
        }
    }

    /*
     *La fonction mystery retourne le produit de deux nombres entiers positifs ou nuls (x et y) donnés en argument.
     */
    public static int mystery(int x, int y) { // x et y positifs
        if (y == 0) return 0;
        else if (y % 2==0) return 2 * mystery(x, y / 2);
        else return x + (2 * mystery(x, (y - 1) / 2));
        //Avec dans main : System.out.println(mystery(3,4))
    }

}
