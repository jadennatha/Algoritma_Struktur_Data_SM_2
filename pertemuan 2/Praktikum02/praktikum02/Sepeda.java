package praktikum02;

public class Sepeda {
    float kecepatan;
    int gear;
    
    public Sepeda(float newKecepatan, int newGear){
        kecepatan = newKecepatan;
        gear = newGear;
    }

    public Sepeda(){
        kecepatan += 5;
        gear += 1;
    }

    public void tambahKecepatan(float increment){
        if (kecepatan >= 20){
            kecepatan = 20;
        }else{
            kecepatan += increment;
        }
    }

    public void kurangiKecepatan(float decrement){
        if (kecepatan <= 0){
            kecepatan = 0;
        }else { 
            kecepatan -= decrement;
        }
    }

    public void cetakInfo(){
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Gear : " + gear);
        System.out.println("==============");
    }
}
