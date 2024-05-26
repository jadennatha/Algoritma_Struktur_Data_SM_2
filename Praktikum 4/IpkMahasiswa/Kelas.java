package IpkMahasiswa;

public class Kelas {
    Mahasiswa[] daftarMahasiswa;
    int index;
    
    public Kelas(int kuota) {
        daftarMahasiswa = new Mahasiswa[kuota];
    }

    public void add(Mahasiswa mahasiswa){
        if (index < daftarMahasiswa.length){
            daftarMahasiswa[index] = mahasiswa;
            index++;
        } else {
            System.out.println("Kelas sudah penuh");
        }
    }
    
    public void displayinfo(){
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.displayInfo();
        }
    }

    public void bubbleSortByIPK(){
        int n = daftarMahasiswa.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0 ; j < n - i - 1; j++){
                if (daftarMahasiswa[j].ipk > daftarMahasiswa[j + 1].ipk){
                    Mahasiswa temp = daftarMahasiswa[j];
                    daftarMahasiswa[j] = daftarMahasiswa[j+1];
                    daftarMahasiswa[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortByUmur(){
        int n = daftarMahasiswa.length;

        for (int i=0; i<n-1;i++) {
            int minIndex = i;

            for (int j=i+1;j<n;j++){
                if (daftarMahasiswa[j].umur < daftarMahasiswa[minIndex].umur){
                    minIndex=j;
                }
            }

            int temp = daftarMahasiswa[minIndex].umur;
            daftarMahasiswa[minIndex].umur = daftarMahasiswa[i].umur;
            daftarMahasiswa[i].umur = temp;
        }
    }

    public void insertionSortByIPKDes(){
        int n = daftarMahasiswa.length;

        for (int i = 0; i < n; i++){
            double key = daftarMahasiswa[i].ipk;
            int j = i - 1;

            while (j >= 0 && daftarMahasiswa[j].ipk < key){
                daftarMahasiswa[j+1].ipk = daftarMahasiswa[j].ipk;
                j = j - 1;
            }
        daftarMahasiswa[j+1].ipk = key;
        }
    }
}



