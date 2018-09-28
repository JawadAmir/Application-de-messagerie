package com.TP;

public class MotDePasse {

    String chars = "abcdefjhigklmnopqrstuvwxyz0123456789";
    String result = "";
        String Generateur ( int length){

            String[] chs = this.chars.split("");

            for (int i = 0; i < length; ++i) {
                int random = (int) (Math.random() * (double) this.chars.length());
                result = result + chs[random];
            }

            return result;
        }



    }
