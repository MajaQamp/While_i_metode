//1a. Napravite 4 funkcije koje int-ove:
//Sabiraju
//Oduzimaju
//mnoze
//dijele


public class Task_1a_4funkcije_aritmetika {
    public static void main(String[] args) {
    int sabiranje= sabiranje(10,5);
    int oduzimanje=oduzimanje(10,5);
    int mnozenje=mnozenje(10,5);
    int dijeljenje=dijeljenje(10,5);
        System.out.println(dijeljenje);
    }




public static int sabiranje (int broj1, int broj2){
        int sabiranje = broj1+broj2;
        return sabiranje;
}
    public static int oduzimanje (int broj1, int broj2){
        int oduzimanje = broj1-broj2;
        return oduzimanje;}

    public static int mnozenje (int broj1, int broj2){
        int mnozenje = broj1*broj2;
        return mnozenje;}

    public static int dijeljenje (int broj1, int broj2){
        int dijenjenje = broj1/broj2;
        return dijenjenje;}
















}





