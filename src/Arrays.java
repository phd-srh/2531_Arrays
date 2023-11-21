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

    }
}
