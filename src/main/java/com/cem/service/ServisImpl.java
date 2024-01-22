package com.cem.service;

import com.cem.entity.*;
import com.cem.repository.*;
import com.cem.entity.enums.State;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ServisImpl {

    public static KazananRepository kazananRepository = new KazananRepository();
    public static PuanRepository puanRepository = new PuanRepository();
    public static YarismaRepository yarismaRepository = new YarismaRepository();
    public static SoruRepository soruRepository = new SoruRepository();
    public static YarismaciRepository yarismaciRepository = new YarismaciRepository();
    public static UnluRepository unluRepository = new UnluRepository();

    public static void demoVeriYarat(){
        BaseEntity baseEntity1 = BaseEntity.builder()
                .state(State.AKTIF)
                .createAt(System.currentTimeMillis())
                .updateAt(System.currentTimeMillis())
                .build();

        BaseEntity baseEntity2 = BaseEntity.builder()
                .state(State.AKTIF)
                .createAt(System.currentTimeMillis())
                .updateAt(System.currentTimeMillis())
                .build();


        Puan puan1 = Puan.builder()
                .baseEntity(baseEntity1)
                .puanList(Collections.emptyMap())
                .build();


        Puan puan2 = Puan.builder()
                .baseEntity(baseEntity2)
                .puanList(Collections.emptyMap())
                .build();
        puanRepository.save(puan1);
        puanRepository.save(puan2);

        HashMap<Integer, String> odullerList  = new HashMap<>();
        odullerList.put(1,"1000 TL");
        odullerList.put(2,"500 TL");
        odullerList.put(3,"100 TL");
        Yarisma yarisma1 = Yarisma.builder()
                .ad("Yarisma 1")
                .baseEntity(baseEntity1)
                .sure(240L)
                .baslangicTarihi(System.currentTimeMillis())
                .oduller(odullerList)
                .puan(puan1)
                .build();
        HashMap<Integer, String> odullerList2  = new HashMap<>();
        odullerList2.put(1,"Altin madalya");
        odullerList2.put(2,"Gumus madalya");
        odullerList2.put(3,"Bronz madalya");
        Yarisma yarisma2 = Yarisma.builder()
                .ad("Yarisma 2")
                .baseEntity(baseEntity2)
                .sure(180L)
                .baslangicTarihi(System.currentTimeMillis())
                .oduller(odullerList2)
                .puan(puan2)
                .build();
        yarismaRepository.save(yarisma1);
        yarismaRepository.save(yarisma2);




        Yarismaci yarismaci1 = Yarismaci.builder()
                .ad("John Doe")
                .username("john_doe123")
                .avatar("https://example.com/johndoe.jpg")
                .email("john.doe@example.com")
                .baseEntity(baseEntity1)
                .yarisma(yarisma1)
                .build();

        Yarismaci yarismaci2 = Yarismaci.builder()
                .ad("Jane Smith")
                .username("jane_smith456")
                .avatar("https://example.com/janesmith.jpg")
                .email("jane.smith@example.com")
                .baseEntity(baseEntity2)
                .yarisma(yarisma2)
                .build();

        Unlu unlu1 = Unlu.builder()
                .adSoyad("Albert Einstein")
                .resimUrl("https://example.com/einstein.jpg")
                .ipucu("Theory of Relativity")
                .build();

        Unlu unlu2 = Unlu.builder()
                .adSoyad("William Shakespeare")
                .resimUrl("https://example.com/shakespeare.jpg")
                .ipucu("Playwright and Poet")
                .build();
        HashMap<String, String> cevaplar1 = new HashMap<>();
        cevaplar1.put("a","Paris");
        cevaplar1.put("b","Paris");
        cevaplar1.put("c","Paris");
        cevaplar1.put("d","Paris");
        Soru soru1 = Soru.builder()
                .soru("What is the capital of France?")
                .sure(30)
                .cevaplar(cevaplar1)
                .dogruCevap("Paris")
                .puan(10)
                .unlu(unlu1)
                .baseEntity(baseEntity1)
                .yarisma(yarisma1)
                .build();
        HashMap<String, String> cevaplar2 = new HashMap<>();
        cevaplar2.put("a","William Shakespearae");
        cevaplar2.put("b","William Shakespearae");
        cevaplar2.put("c","William Shakespearae");
        cevaplar2.put("d","William Shakespearae");

        Soru soru2 = Soru.builder()
                .soru("Who wrote 'Romeo and Juliet'?")
                .sure(45)
                .cevaplar(cevaplar2)
                .dogruCevap("William Shakespeare")
                .puan(15)
                .unlu(unlu2)
                .baseEntity(baseEntity2)
                .yarisma(yarisma1)
                .build();

        Kazananlar kazananlar1 = Kazananlar.builder()
                .yarismaci(yarismaci1)
                .odul("First Place")
                .baseEntity(baseEntity1)
                .yarisma(yarisma1)
                .build();

        Kazananlar kazananlar2 = Kazananlar.builder()
                .yarismaci(yarismaci2)
                .odul("Second Place")
                .baseEntity(baseEntity2)
                .yarisma(yarisma2)
                .build();


//        HashMap<Integer, String> odullerList  = new HashMap<>();
//        odullerList.put(1,"Altin madalya");
//        odullerList.put(2,"Gumus madalya");
//        odullerList.put(3,"Bronz madalya");
//        yarisma1 = Yarisma.builder()
//                .ad("Science Quiz")
//                .baslangicTarihi(System.currentTimeMillis())
//                .sure(1800L) // 30 minutes in seconds
//                .sorular(Arrays.asList(soru1, soru2))
//                .yarismacilar(Arrays.asList(yarismaci1, yarismaci2))
//                .kazananlar(Arrays.asList(kazananlar1, kazananlar2))
//                .baseEntity(baseEntity1)
//                .puan(puan1)
//                .oduller(odullerList)
//                .build();
//
//        HashMap<Integer, String> odullerList2  = new HashMap<>();
//        odullerList2.put(1,"Altin madalya");
//        odullerList2.put(2,"Gumus madalya");
//        odullerList2.put(3,"Bronz madalya");
//        yarisma2 = Yarisma.builder()
//                .ad("Literature Challenge")
//                .baslangicTarihi(System.currentTimeMillis())
//                .sure(1200L) // 20 minutes in seconds
//                .sorular(Arrays.asList(soru1))
//                .yarismacilar(Arrays.asList(yarismaci1, yarismaci2))
//                .kazananlar(Arrays.asList(kazananlar1, kazananlar2))
//                .baseEntity(baseEntity2)
//                .oduller(odullerList2)
//                .puan(puan2)
//                .build();


        HashMap<Yarismaci,Integer> puanList = new HashMap<>();
        HashMap<Yarismaci,Integer> puanList2 = new HashMap<>();
        puanList2.put(yarismaci1,35);
        puanList2.put(yarismaci2,25);


        puanList.put(yarismaci1,35);
        puanList.put(yarismaci2,25);


        puan1.setYarisma(yarisma1);
        puan2.setYarisma(yarisma2);
        puan1.puanList = puanList;
        puan2.puanList = puanList2;


        // Save entities
        unluRepository.save(unlu1);
        unluRepository.save(unlu2);



        soruRepository.save(soru1);
        soruRepository.save(soru2);



        yarismaciRepository.save(yarismaci1);
        yarismaciRepository.save(yarismaci2);


        puanRepository.save(puan1);
        puanRepository.save(puan2);




        kazananRepository.save(kazananlar1);
        kazananRepository.save(kazananlar2);
        kazananlar1.setYarisma(yarisma1);
        kazananlar2.setYarisma(yarisma1);


        // Save Yarisma entities after setting up relationships
        yarismaRepository.save(yarisma1);
        yarismaRepository.save(yarisma2);


    }


}
