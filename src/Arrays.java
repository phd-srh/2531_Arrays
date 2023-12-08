import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        // Wie man ein Array deklariert
        // Array = Feld = Vektor = Liste gleichen Datentypen
        double[] doubleArray = { 1.0, 7.3, -2.6, 0.4, 3.14 };
        //    [] definiert diesen Datentyp als Array
        //                    { statische Initialisierung }

        // 2. Möglichkeit ein Array anzulegen
        double[] tagesSätze = new double[ 365 ];
        //                    new erzeugt einen entsprechend großen Datenspeicher

        float[] nochEinDatensatz;
        //      die Variable existiert, hat aber noch keinen(!!) Speicherplatz

        // Zugriff auf die einzelnen Datenelemente über den Index,
        // der in eckigen Klammern steht (die Nummerierung beginnt bei 0)
        doubleArray[0] = 0;
        // das 0. Element, d.h. der erste Eintrag in der Liste

//        tagesSätze[365] = 17;
        // dieses Element gibt es nicht, es wäre die Nummer 366

        // Spezialvariable (Property - Eigenschaft)
        System.out.println("Wie groß ist das Array tagesSätze: " + tagesSätze.length);
        System.out.println("Wie groß ist das Array doubleArray: " + doubleArray.length);

        // GANZ WICHTIG:
        // Die Größe des Arrays, d.h. wieviel Elemente es umfassen kann, lässt sich
        // NICHT mehr ändern! => statisches Array
//        doubleArray.length = doubleArray.length + 1;
//        doubleArray[5] = -3.4;

        // Aufgabe 1
        // Ein int-Array erstellen und mit den Werten von 1 bis 100 initialisieren.
        int[] zahlenreihe = new int[ 100 ];
        for (int i=0; i < zahlenreihe.length; i++) {
            zahlenreihe[i] = i + 1;
        }

        // Aufgabe 2
        // Eine Methode zur hübschen Ausgabe eines Arrays
        System.out.print("zahlenreihe: ");
        ausgabeArray(zahlenreihe);

        int[] datenreihe = { 17, 3, 29, 22, 5, 11, 9, 13, 7, 1, 12 };
        System.out.print("datenreihe: ");
        ausgabeArray(datenreihe);
        System.out.println("Der größte Wert lautet: " + maximalerWertImArray(datenreihe));
        System.out.println("Der kleinste Wert lautet: " + minimalerWertImArray(datenreihe));

        int suchWert = 31;
        System.out.println("Der Wert " + suchWert + " befindet sich im Array? " +
                findeWertImArray(datenreihe, suchWert));

        int[] nochEineDatenreihe = { 1, 15, 29, 47, 55 };
        System.out.println("In beiden Arrays sind " +
                zähleGleicheElemente(datenreihe, nochEineDatenreihe) +
                " Elemente gleich");

        int[] datenreiheOhneWert = entferneZahlAusArray(datenreihe, 21);
        ausgabeArray(datenreiheOhneWert);
    }

    public static int[] entferneZahlAusArray(int[] array, int zahl) {
        int längeDesNeuenArrays = array.length;
        if ( findeWertImArray(array, zahl) )
            längeDesNeuenArrays--;

        int[] neuesArray = new int[ längeDesNeuenArrays ];
        int neuerIndex = 0;
        for (int element : array) {
            if (element != zahl) {
                neuesArray[neuerIndex] = element;
                neuerIndex++;
            }
        }
        return neuesArray;
    }

    public static int zähleGleicheElemente(int[] a, int[] b) {
        int anzahlGleicherElemente = 0;
        for (int element : a) {
            if ( findeWertImArray(b, element) )
                anzahlGleicherElemente++;
//            -- Alternative, wenn die Methode findeWertImArray nicht existiert
//            for (int dasAndereElement : b) {
//                if (element == dasAndereElement)
//                    anzahlGleicherElemente++;
//            }
        }
        return anzahlGleicherElemente;
    }


    private static boolean findeWertImArray(int[] array, int wert) {
        for (int element : array) {
            if (element == wert) return true;
        }
        return false;
    }

    private static int minimalerWertImArray(int[] array) {
        int aktuellerMinmalerWert = Integer.MAX_VALUE;
        for (int element : array) {
            if (aktuellerMinmalerWert > element)
                aktuellerMinmalerWert = element;
        }
        return aktuellerMinmalerWert;
    }

    private static int maximalerWertImArray(int[] array) {
        int aktuellerMaximalerWert = Integer.MIN_VALUE;
        for (int element : array) {
            if (aktuellerMaximalerWert < element)
                aktuellerMaximalerWert = element;
        }
        return aktuellerMaximalerWert;
    }

    private static void ausgabeArray(int[] array) {
        System.out.print("[");
        for (int i=0; i < array.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
