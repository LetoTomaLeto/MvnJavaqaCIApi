package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        /** post.day = "13";
         post.month = "6";
         post.year = "1999";
         */
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.year = 1999;
        post.birthday.month = 6;
        post.subscription = true;
    }
}
