package praktikum03;

public class PersegiPanjang{
    public int panjang;
    public int lebar;
    public int luas;
    public int keliling;

    public PersegiPanjang(int p, int l){
        panjang = p;
        lebar = l;
    }
    
    public void cetakInfo(){
       System.out.println("Panjang :" + panjang + ", lebar : " + lebar + ", luas : " + luas + ", keliling : " + keliling);
    }

    public void hitungLuas(){
        luas = panjang * lebar;    
    }

    public void hitungKeliling(){
        keliling = (2*panjang) + (2*lebar);
    }
}
