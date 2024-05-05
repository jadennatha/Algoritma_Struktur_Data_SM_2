package Klinik;
public class Queue {
    public Pasien[] antrian;
    public int max;
    public int size;
    public int front;
    public int rear;

    public Queue(int max){
        this.max = max;
        this.antrian = new Pasien[max];
        this.size = 0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull(){
        return (size == max);
    }

    public void peek(){
        if (!isEmpty()){
            System.out.println("Pasien berada paling depan: " + antrian[front]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Queue kosong");
        } else {
            int i = front;
        
            while (i != rear){
                System.out.println(antrian[i] + " ");
                i = (i + 1) % max;
            }

            System.out.println(antrian[i] + " ");
            System.out.println("Jumlah Elemen: " + size);
        }
    }

    public void clear(){
        front =  rear = -1;
        size = 0;
    }

    public void enqueue(Pasien dt){
        if (isFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()){
                front = rear = 0;
            } else if (rear == max -1){
                rear = 0;
            } else {
                rear = rear + 1;
            }

            antrian[rear] = dt;
            size++;
        }
    }

    public Pasien dequeue(){
        Pasien temp = null;

        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            temp = antrian[front];
            size--;

            if (isEmpty()) {
                front = rear = -1;
            } else if (front == max - 1){
                front = 0;
            } else {
                front++;
            }
        }

        return temp;
    }

    public void peekRear(){
        if (!isEmpty()){
            System.out.println("Pasien berada paling belakang: " + antrian[rear]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void peekPosition(String keyNama){
        boolean dataDitemukan = false;
        if (!isEmpty()){
            for (int i = front; i < rear; i++ ){
                if (keyNama.contains(antrian[i].nama)){
                    System.out.println("Pasien ditemukan pada antrian " + i+1);
                    dataDitemukan = true;
                    break;
                } 
            }
            if (!dataDitemukan){
                System.out.println("Pasien tidak ditemukan");
            }
            
        }
    }
}
