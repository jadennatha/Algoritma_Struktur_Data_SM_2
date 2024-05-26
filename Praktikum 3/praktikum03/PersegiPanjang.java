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

    public int hitungLuas(){
        return luas = panjang * lebar;    
    }

    public int hitungKeliling(){
        return keliling = (2*panjang) + (2*lebar);
    }
}
