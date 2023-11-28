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

    }
}
