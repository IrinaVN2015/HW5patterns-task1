package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    static Faker faker = new Faker(new Locale("ru"));

    public static String generateDate(int addDays) {
        val date = LocalDate.now().plusDays(addDays);
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity() {

        var cities = new String[]{"Чита", "Санкт-Петербург", "Самара", "Новосибирск", "Омск", "Красноярск", "Ульяновск"};
        return cities[new Random().nextInt(cities.length)];
    }

    public static String generateName() {

        return faker.name().name();
    }

    public static String generatePhone() {

        return faker.numerify("+##########");
    }

}
