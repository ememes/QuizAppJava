package com.mms.bilgiyarismasi;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    private static final String USER_NAME = "user_name";
    private static final String TOTAL_QUESTIONS = "total_questions";
    private static final String CORRECT_ANSWER = "correct_answer";

    public static List<Question> getQuestionsList() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "Bu bayrak hangi ülkeye aittir?",
                R.drawable.ic_flag_of_argentina,
                new String[]{"Arjantin", "Avustralya", "Brezilya", "Avusturya"},
                0)
        );

        // 2
        questionList.add(new Question(
                2,
                "Bu bayrak hangi ülkeye aittir?",
                R.drawable.ic_flag_of_australia,
                new String[]{"Angola", "Avusturya", "Avustralya", "Brezilya"},
                2)
        );



        return questionList;
    }

    public static List<Question> getQuestionsList2() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "Aşağıdaki işlemin sonucu nedir?",
                R.drawable.matsoru1,
                new String[]{"10", "20", "30", "40"},
                1)
        );

        // 2
        questionList.add(new Question(
                2,
                "Aşağıdaki işlemin sonucu nedir?",
                R.drawable.matsoru2,
                new String[]{"1", "2", "3", "4"},
                0)
        );



        return questionList;
    }

    public static List<Question> getQuestionsList3() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "Hangi spor dalında oyuncular, bir topu potaya atmak için ellerini kullanırken, hücum ve savunma becerilerini sergilerler?",
                R.drawable.empty2,
                new String[]{"Futbol", "Basketbol", "Voleybol", "Jimnastik"},
                1)
        );

        // 2
        questionList.add(new Question(
                2,
                "Hangi spor dalında, iki takım, ağın üzerinden topu karşı tarafa geçirmeye çalışırken, paslar, smaçlar ve bloklar gibi hareketlerle puan kazanmaya çalışır?",
                R.drawable.empty2,
                new String[]{"Futbol", "Basketbol", "Voleybol", "Tenis"},
                2)
        );



        return questionList;
    }
    public static List<Question> getQuestionsList4() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "Hangi müzik aleti, telli çalgılar arasında yer alır ve genellikle akustik veya elektro akustik olarak çalınır?",
                R.drawable.empty2,
                new String[]{"Keman", "Klarnet", "Gitar", "Bateri"},
                2)
        );

        // 2
        questionList.add(new Question(
                2,
                "Bu müzik aletinin adı nedir?",
                R.drawable.empty2,
                new String[]{"Piyano", "Gitar", "Klarnet", "Keman"},
                3)
        );



        return questionList;
    }
    public static List<Question> getQuestionsList5() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "Hangi bilim dalı, canlı organizmaların yapılarını, işleyişlerini ve etkileşimlerini inceler?",
                R.drawable.empty2,
                new String[]{"Biyoloji", "Fizik", "Kimya", "Astronomi"},
                0)
        );

        // 2
        questionList.add(new Question(
                2,
                "Hangi bilim dalı, maddenin yapısını, özelliklerini ve dönüşümlerini araştırır?",
                R.drawable.empty2,
                new String[]{"Biyoloji", "Fizik", "Kimya", "Jeoloji"},
                2)
        );



        return questionList;
    }
    public static List<Question> getQuestionsList6() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "\"Mona Lisa\" tablosu hangi ünlü ressam tarafından yapılmıştır?",
                R.drawable.monalisa,
                new String[]{"Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Salvador Dalí"},
                1)
        );

        // 2
        questionList.add(new Question(
                2,
                "\"Yıldızlı Gece\" ve \"Ayın Dönümü\" gibi ünlü tablolar hangi ressam tarafından yapılmıştır?",
                R.drawable.yildizligece,
                new String[]{"Pablo Picasso", "Claude Monet", "Vincent van Gogh", "Michelangelo"},
                2)
        );



        return questionList;
    }
    public static List<Question> getQuestionsList7() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "Hangi şirket, iPhone ve MacBook gibi ürünleriyle tanınmaktadır?",
                R.drawable.empty2,
                new String[]{"Samsung", "Apple", "Microsoft", "Google"},
                1)
        );

        // 2
        questionList.add(new Question(
                2,
                "Hangi teknoloji, birçok cihazın kablosuz olarak internete bağlanmasını sağlayan bir iletişim standardıdır?",
                R.drawable.empty2,
                new String[]{"Bluetooth", "NFC (Yakın Alan İletişimi)", "Wi-Fi", "LTE (Long-Term Evolution)"},
                2)
        );



        return questionList;
    }
    public static List<Question> getQuestionsList8() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "\"Crime and Punishment\" ve \"The Brothers Karamazov\" gibi ünlü romanlarıyla tanınan yazar aşağıdakilerden hangisidir?",
                R.drawable.empty2,
                new String[]{"Leo Tolstoy", "Fyodor Dostoyevsky", "Franz Kafka", "Ernest Hemingway"},
                1)
        );

        // 2
        questionList.add(new Question(
                2,
                "\"Romeo and Juliet\" ve \"Macbeth\" gibi ünlü oyunlarıyla tanınan yazar aşağıdakilerden hangisidir?",
                R.drawable.empty2,
                new String[]{"William Shakespeare", "Jane Austen", "Charles Dickens", "Mark Twain"},
                0)
        );



        return questionList;
    }
    public static List<Question> getQuestionsList9() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "Hangi yıl Amerika Birleşik Devletleri'nin bağımsızlık ilanının yapıldığı yıldır?",
                R.drawable.empty2,
                new String[]{"1776", "1789", "1804", "1865"},
                0)
        );

        // 2
        questionList.add(new Question(
                2,
                "Hangi yıl Berlin Duvarı'nın yıkıldığı ve Almanya'nın birleştiği yıldır?",
                R.drawable.berlinduvari,
                new String[]{"1945", "1961", "1989", "1992"},
                2)
        );



        return questionList;
    }
    public static List<Question> getQuestionsList10() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "Hangi film, en çok Akademi Ödülleri kazanan film olarak rekor kırmıştır?",
                R.drawable.empty2,
                new String[]{"The Lord of the Rings: The Return of the King", "Titanic", "La La Land", "The Godfather"},
                0)
        );

        // 2
        questionList.add(new Question(
                2,
                "Hangi ünlü yönetmen, \"Pulp Fiction\", \"Kill Bill\" ve \"Inglourious Basterds\" gibi filmlerle tanınmaktadır?",
                R.drawable.empty2,
                new String[]{"Steven Spielberg", "Christopher Nolan", "Quentin Tarantino", "Martin Scorsese"},
                2)
        );



        return questionList;
    }


    public static String getUserName() {
        return USER_NAME;
    }

    public static String getTotalQuestions() {
        return TOTAL_QUESTIONS;
    }

    public static String getCorrectAnswer() {
        return CORRECT_ANSWER;
    }
}
