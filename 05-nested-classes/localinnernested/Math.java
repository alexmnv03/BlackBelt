package localinnernested;

public class Math {

    public void getResult() {
        final int delimoeF;
        int delimoeEF;

        class Delenie{

            private int delimoe;
            private int delitel;


            public int getDelimoe() {
                return this.delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return this.delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe/delitel;
            }            

            public int getOstatok() {
                return delimoe % delitel;
            }            

        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(5);
        delenie.setDelitel(10);
        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("getDelitel = " + delenie.getDelitel());
        System.out.println("getChastnoe = " + delenie.getChastnoe());
        System.out.println("getOstatok = " + delenie.getOstatok());
        
    }

    
}
