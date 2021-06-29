/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NO2_Queue;

/**
 *
 * @author muhammadisa
 */
public class QueueApp {
     public static void main(String[] args){
         String nama = "Muhammad Isa Nuruddin";
        Queue antrian = new Queue(10);
        antrian.enqueue(6);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("nilai yang paling diambil dari antrian = " + antrian.peek());
        System.out.println("Nama Saya adalah : " + nama);
        antrian.dequeue();
        antrian.display();
        System.out.println();
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
        
        
    }
}
