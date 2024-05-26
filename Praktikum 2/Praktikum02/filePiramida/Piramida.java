package filePiramida;

public class Piramida {
    float luasAlas;
    float volume;
    
    public void menghitungLuasAlas(float panjangAlas, float lebarAlas){
        luasAlas = panjangAlas*lebarAlas;
    }

    public void menghitungVolume(float panjangAlas, float lebarAlas, float tinggi){
        menghitungLuasAlas(panjangAlas, lebarAlas);
        volume = luasAlas*tinggi/3;
    }

    public void hasil(){
        System.out.println("Luas alas yang dimiliki oleh piramida adalah : " + luasAlas + " Cm");
        System.out.printf("%s%.2f%s","Volume yang dimiliki oleh piramida adalah : ", volume ," Cm^2");
    }
}
