/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebak.angka.pkg2;

/**
 *
 * @author ACER
 */
import java.util.Random;
import java.util.Scanner;
public class angka {

    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int angka = 100;
    int int_rndm = rand.nextInt(angka);
    int isi;
    int score = 100;
    int tebak = 1;
    void awal(){
        System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
    }
    void tebakan (){
        while (this.isi != this.int_rndm){
            System.out.print("Masukan Tebakan Anda : ");
            this.isi = input.nextInt();
            this.tebak = this.tebak + 1;
            this.score = this.score - 2;
            if(this.isi == this.int_rndm){
                System.out.println("Yeeee… Bilangan tebakan anda BENAR!");
                this.score = this.score + 2;
                if(this.tebak <= 5){
                    this.score = this.score + 50;
            }
                System.out.println("Score Anda :" + this.score);
                break;
            }
            else if(this.isi < this.int_rndm){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            }
            else if(this.isi > this.int_rndm){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            }
            
        }
    }
}
