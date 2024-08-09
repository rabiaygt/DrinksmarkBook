package com.rabiayigit.drinksmarkbook;

public class Singleton {
        private Drinksmark sentDrinksmark;
        private static Singleton singleton;
        private Singleton(){

        }

        public Drinksmark getSentDrinksmark(){
            return sentDrinksmark;
    }

        public void setSentDrinksmark(Drinksmark sentDrinksmark){
            this.sentDrinksmark=sentDrinksmark;
        }

        public static Singleton getInstance(){
            if (singleton==null){
                singleton=new Singleton();
            }
            return singleton;
        }
}
