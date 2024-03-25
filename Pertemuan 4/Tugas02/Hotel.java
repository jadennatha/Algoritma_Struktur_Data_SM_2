package Tugas02;

public class Hotel {
    public String namaHotel;
    public int harga;
    public double rating;
    
    public Hotel(String name, int price, double review){
        namaHotel = name;
        harga = price;
        rating = review;
    }

    public void bubleSortByPrice(Hotel [] penginapan){
        int n = penginapan.length;

        for (int i = 0 ; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++){
                if (penginapan[j].harga > penginapan[j+1].harga){
                    int temp = penginapan[j].harga;
                    penginapan[j].harga = penginapan[j+1].harga;
                    penginapan[j+1].harga = temp;
                }
            }
        }
    }

    public void selectionSortByRating(Hotel [] penginapan){
        int n = penginapan.length;

        for (int i=0; i<n-1;i++) {
            int minIndex = i;

            for (int j=i+1;j<n;j++){
                if (penginapan[j].rating > penginapan[minIndex].rating){
                    minIndex=j;
                }
            }

            double temp = penginapan[minIndex].rating;
            penginapan[minIndex].rating = penginapan[i].rating;
            penginapan[i].rating = temp;
        }
    }

    public void cetakDaftar(){
        System.out.println(namaHotel + " Harga: " + harga + " Rating: " + rating);
    }
}
