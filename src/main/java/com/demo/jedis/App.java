package com.demo.jedis;

import redis.clients.jedis.Jedis;

public class App {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection successful");
        System.out.println(jedis.ping());

//        Set<String> keySet = jedis.keys("*");
//        keySet.forEach(System.out::println);

//        System.out.println("Info");
//        System.out.println(jedis.info());

        jedis.close();
    }

}
