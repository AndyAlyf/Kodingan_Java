
public class Pembagian extends Matematika {

    @Override
    public double operasi(int x, int y) {
        return (x / y);
    }

    public Pembagian(int x, int y) {
        super(x, y);
        hasil = operasi(x, y);
    }
}