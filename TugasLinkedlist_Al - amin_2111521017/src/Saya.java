import java.util.LinkedList;

public class Saya {
    public static void main(String[] args) throws Exception {
        LinkedList <String> Saya = new LinkedList<String>();
        
        //LinkedList Saya untuk menyimpan nama lengkap
        Saya.add("A");
        Saya.add("L");
        Saya.add(" ");
        Saya.add("-");
        Saya.add(" ");
        Saya.add("A");
        Saya.add("M");
        Saya.add("I");
        Saya.add("N");
        System.out.println("Kondisi LinkedList sebelum diedit : " + Saya);
        System.out.println("");
        
        //1. Add karakter yang diinginkan
        Saya.add(" ");
        Saya.add("M");
        Saya.add("A");
        Saya.add("N");
        Saya.add("T");
        Saya.add("A");
        Saya.add("P");
        Saya.add("S");
        Saya.add(0, "M");

        System.out.println("Hasil LinkedList Setelah Ditambahkan Elemen baru : " + Saya);
        System.out.println("");
        
        //2. sisipkan karakter lain yang anda inginkan
        Saya.set(2, "Z");
        Saya.set(6, "O");
        Saya.set(8, "O");
        Saya.set(4, "M");
        System.out.println("Hasil LinkedList Setelah disisipkan elemen baru : " +Saya);
        System.out.println("");
        
        //3. hapus karakter yang ingin dihapus
        Saya.remove(9);
        Saya.remove(4);
        Saya.remove(5);
        Saya.remove(1);
        Saya.remove(0);
        System.out.println("Hasil LinkedList setelah beberapa elemen dihapus : " +Saya);
        System.out.println("");

        //4. buat fungsi pop dan push
        Saya.push("R");
        Saya.push("E");
        Saya.push("T");
        Saya.push("S");
        Saya.push("A");
        Saya.push("M");
        System.out.println("Hasil LinkedList setelah di push : " + Saya);
        System.out.println("");
        
        System.out.println("Elemen yang di POP dari LinkedList : " + Saya.pop());
    }
}
