package com.example;

public class JokesClass {

    public String getJoke(int i){

        if(i==0)
            return "Why do programmers always get Christmas and Halloween mixed up?\n" +
                    "Because DEC 25 = OCT 31";
        else if(i==1)
            return "How do you keep a programmer in the shower all day?\n" +
                    "Give him a bottle of shampoo which says \"lather, rinse, repeat.\"";
        else if(i==2)
            return "A system programmer came home from work almost at dawn and told his wife enthusiastically: \"Tonight I have installed a new release of MVS/ESA together with VM/CMS and CICS/VS\".\n" +
                    "\"G.O.O.D\" answered his wife.\n";
        else if(i==3)
            return "The Programmers' Cheer\n" +
                    "Shift to the left, shift to the right!\n" +
                    "Pop up, push down, byte, byte, byte!";
        else if(i==4)
            return "- \"Have you heard about the object-oriented way to become wealthy?\"\n" +
                    "- \"No...\"\n" +
                    "- \"Inheritance.\"\n";
        else if(i==5)
            return "Why all Pascal programmers ask to live in Atlantis?\n" +
                    "                Because it is below C level.";
        else if(i==6)
            return "The programmer to his son: \"Here, I brought you a new basketball.\"\n" +
                    "\"Thank you, daddy, but where is the user's guide?\"";
        else if(i==7)
            return "There are only 10 types of people in the world: Those that understand binary and those that don't.";
        else if(i==8)
            return "Why did the private boarding school reject OO software designer go to work in defence?\n" +
                    "\n" +
                    "Because someone said there would be 'class' warfare!";

        else
            return "joke";
    }
}
